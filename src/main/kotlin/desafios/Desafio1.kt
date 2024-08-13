package main.kotlin.desafios

import java.io.File
import java.lang.Exception

/*
    Desenvolva um programa que leia um arquivo de texto contendo itens
de consumo (alimentos, produtos diversos), suas respectivas
quantidades. Utilize o operador Elvis para fornecer valores padrão
quando os dados estão ausentes e a função let para garantir
operações seguras com variáveis não nulas. Implemente tratamento
de exceções para lidar com possíveis erros de leitura ou formato
incorreto dos dados. O programa deve calcular a pegada de carbono
para cada item listado, acumular o valor total e exibir a pegada de
carbono total ao final.

OBJETIVOS
Utilizar a função LET, operador elvis, leitura de
dados e tratamento de exceções.
 */

fun main(){

    val tabelaFatorEmissao = mapOf(
        "Arroz" to 0.001835,               // kg CO2/g
        "Feijão" to 0.001835,              // kg CO2/g
        "Leite" to 0.0012,                 // kg CO2/g
        "Carne Bovina" to 0.027,           // kg CO2/g
        "Carne de Frango" to 0.0065,       // kg CO2/g
        "Pão" to 0.00075,                  // kg CO2/g
        "Queijo" to 0.013,                 // kg CO2/g
        "Ovos" to 0.0048,                  // kg CO2/g
        "Café" to 0.011,                   // kg CO2/g
        "Tomate" to 0.0023,                // kg CO2/g
        "Batata" to 0.0005,                // kg CO2/g
        "Banana" to 0.0008,                // kg CO2/g
        "Chocolate" to 0.019,              // kg CO2/g
        "Cerveja" to 0.0008572,            // kg CO2/g
        "Refrigerante" to 0.0005714,       // kg CO2/g
        "Vinho" to 0.0015,                 // kg CO2/g
        "Água Engarrafada" to 0.00015,     // kg CO2/g
        "Cereal" to 0.0035,                // kg CO2/g
        "Macarrão" to 0.0013,              // kg CO2/g
        "Azeite de Oliva" to 0.0067        // kg CO2/g
    )

    fun calcularPegadaCarbono(nome: String, qtd: Double): Double{
        val resultadoCarbono = tabelaFatorEmissao[nome] ?: 0.0
        return resultadoCarbono * qtd
    }

    var pegadaCarbonoTotal = 0.0

    try{
        val localArquivo = "/Programacao/AndroidDevIntellij/src/main/kotlin/desafios/consumo.txt" //Caso forem testar, sempre verificar o local do arquivo para evitar erro de leitura, creio que seja devido a como o projeto está estruturado.
        val arquivo = File(localArquivo)

        arquivo.forEachLine { line ->
            val divisao = line.split(":")
            val nome = divisao.getOrNull(0)?.trim() ?: "Item não listado"
            val qtd = divisao.getOrNull(1)?.trim()?.removeSuffix("g")?.toDouble() ?: 0.0

            qtd.let{
                val itemPegadaCarbono = calcularPegadaCarbono(nome, it)
                pegadaCarbonoTotal += itemPegadaCarbono
            }

        }

    } catch (e: Exception){
        println("Erro: A leitura do arquivo não foi possível. ")
    }
    println("Total: ${"%.2f".format(pegadaCarbonoTotal)} kg CO2")
}

//Alexandre dos Santos Nazareth