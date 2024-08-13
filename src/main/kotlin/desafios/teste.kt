package main.kotlin.desafios

import java.io.File
import java.io.FileNotFoundException
import java.io.IOException

fun main() {

    try {

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

}