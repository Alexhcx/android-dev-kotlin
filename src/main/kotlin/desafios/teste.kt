package main.kotlin.desafios

import java.io.File
import java.io.FileNotFoundException
import java.io.IOException

fun main() {

   /* try {

        val localArquivo = "consumo.txt"
        val arquivo = File(localArquivo)

        arquivo.forEachLine { line ->
            println(line)
        }
    } catch (e: FileNotFoundException) {
        println("Arquivo não encontrado: ${e.message}")
    } catch (e: IOException) {
        println("Erro de E/S ao ler o arquivo: ${e.message}")
    } catch (e: Exception) {
        println("Erro inesperado: ${e.message}")
    }
    */

    val tiposTransporte = arrayOf("Carro", "Ônibus", "Avião")
    val fatoresEmissao = arrayOf("0.21", "0.105", "0.133")

    val matrizTransporteEmissao: Array<Array<String>> = Array(3){Array(2){""}}

    for (i in 0 until 3) {
        for (j in 0 until 2) {
            matrizTransporteEmissao[i][j] = if (j == 0) tiposTransporte[i] else fatoresEmissao[i]
        }
    }

        for(i in 0 until 3){
            for(j in 0 until 2){
                print("${matrizTransporteEmissao[i][j]} ")
            }
            print("\n")
        }


}