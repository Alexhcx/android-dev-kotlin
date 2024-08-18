package main.kotlin.desafios

/*

Nome: Alexandre dos Santos Nazareth

    Desenvolva um programa que solicite ao usuário o tipo de energia
(eletricidade ou gás natural) e o respectivo consumo. Utilize fatores
de emissão específicos para cada tipo de energia: Eletricidade (0.475
kg C02/kWh) e gás natural (2.0 kg C02/m3). O programa deve calcular
a pegada de carbono para cada tipo de energia inserido e, ao final,
apresentar o valor total da pegada de carbono.

    OBJETIVOS
    Trabalhar variáveis, operadores, estruturas
    de decisão e estruturas de repetição.

    ENTRADA: Eletricidade: 100 kWh/m3
             Gás: 50 kWh/m3

    SAIDA: Eletricidade: 47.50 kg C02
           Gás: 100 kg C02
           Total: 147.50 kg C02

 */

fun main(){

    var pegadaCarbonoTotal = 0.0
    var pegadaEletricidade = 0.0
    var pegadaGasNatural = 0.0

    while (true) {

        print("Digite o tipo de energia (Eletricidade ou Gás natural) ou digite 0 para encerrar: ")
        val tipoEnergia = readlnOrNull()?.lowercase() ?: continue
        if (tipoEnergia == "0") {
            println("Eletricidade: ${pegadaEletricidade} kg CO2")
            println("Gás natural: ${pegadaGasNatural} kg CO2")
            println("Total: ${pegadaCarbonoTotal} kg CO2")
            break
        }
        println()

        print("Digite o consumo ou digite 0 para encerrar: ")
        val consumoEnergia = readlnOrNull()?.toInt() ?: continue
        if (consumoEnergia == 0) {
            println("Eletricidade: ${pegadaEletricidade} kg CO2")
            println("Gás natural: ${pegadaGasNatural} kg CO2")
            println("Total: ${pegadaCarbonoTotal} kg CO2")
            break
        }
        println()

        if(tipoEnergia == "eletricidade") {
            var diferenca = pegadaEletricidade
            pegadaEletricidade = pegadaEletricidade + (0.475 * consumoEnergia)
            pegadaCarbonoTotal = pegadaCarbonoTotal + pegadaEletricidade - diferenca
        }
        if(tipoEnergia == "gás natural" || tipoEnergia == "gas natural") {
            var diferenca = pegadaGasNatural
            pegadaGasNatural = pegadaGasNatural + (2.0 * consumoEnergia)
            pegadaCarbonoTotal = pegadaCarbonoTotal + pegadaGasNatural - diferenca
        }

        println("Eletricidade: ${pegadaEletricidade} kg CO2")
        println("Gás natural: ${pegadaGasNatural} kg CO2")
        println("Total: ${pegadaCarbonoTotal} kg CO2")
    }
}