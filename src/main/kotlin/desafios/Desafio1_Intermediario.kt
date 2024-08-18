package main.kotlin.desafios

/*

Nome: Alexandre dos Santos Nazareth

        Desenvolva um programa que solicite ao usuário a distância
    percorrida e o meio de transporte utilizado para várias viagens (carro,
    ônibus e avião). Utilize fatores de emissão específicos para cada tipo
    de veículo: carro (0.21 kg C02/km), ônibus (0.105 kg C02/km), avião
    (0.133 kg C02/km). Armazene esses dados em vetores e utilize uma
    matriz para acessar os fatores de emissão. Implemente funções que
    calculem a pegada de carbono de cada viagem e a soma total. Ao
    final, exiba o total da pegada de carbono.

    OBJETIVOS
    Trabalhar funções, vetores e matrizes

    ENTRADA
    Carro: 100 km

    SAÍDA
    Pegada de C02 : 21 kg
 */

fun main(){

    val tiposTransporte = arrayOf("Carro", "Ônibus", "Avião")
    val fatoresEmissao = arrayOf("0.21", "0.105", "0.133")

    var listaPegadaCarbonoTotal = mutableListOf<Double>(0.0)
    val matrizTransporteEmissao: Array<Array<String>> = Array(3){Array(2){""}}

    for (i in 0 until 3) {
        for (j in 0 until 2) {
            matrizTransporteEmissao[i][j] = if (j == 0) tiposTransporte[i] else fatoresEmissao[i]
        }
    }

    fun carcularPegadaCarbono(distancia:Int, fator:String):Double{
        return distancia * fator.toDouble()
    }

    fun calcularPegadaCarbonoTotal(pegadaCarbono:Double):Double{
        var total = 0.0
        listaPegadaCarbonoTotal.add(pegadaCarbono)

        for (i in 0 until listaPegadaCarbonoTotal.size){
           total += listaPegadaCarbonoTotal[i]
        }

        return total
    }

while (true) {

        var pegadaCarbono = 0.0

        print("Digite a distancia pecorrida em KM ou digite 0 para encerrar: ")
        var distanciaPercorrida = readLine()?.toIntOrNull() ?: continue
        if (distanciaPercorrida == 0) {println("\nPegada de CO2: ${calcularPegadaCarbonoTotal(pegadaCarbono)} KG"); break}

        println("\nEscolha o meio de transporte: ")
        for(i in tiposTransporte.indices){
            println("${i + 1} - ${tiposTransporte[i]}")
        }

        print("Sua escolha: ")
        var escolhaTransporte = readLine()?.toIntOrNull()

        var fEmissao = when (escolhaTransporte) {
            1 -> matrizTransporteEmissao[0][1]
            2 -> matrizTransporteEmissao[1][1]
            3 -> matrizTransporteEmissao[2][1]
            else -> "Erro: Opção invalida."
        }

        pegadaCarbono = carcularPegadaCarbono(distanciaPercorrida, fEmissao)

        println("\nPegada de CO2: ${calcularPegadaCarbonoTotal(pegadaCarbono)} KG\n")

    }

}