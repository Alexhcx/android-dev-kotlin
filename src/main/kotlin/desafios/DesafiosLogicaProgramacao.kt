package main.kotlin.desafios

fun desafio1(){
    println("Desafio 1")
    print("Valor A: ")
    val A = readln().toInt()
    print("Valor B: ")
    val B = readln().toInt()
    print("Valor C: ")
    val C = readln().toInt()

    println("A expressão (A + B = ${A + B}) < C é ${A + B < C}")
}

fun desafio2(){
    println("Desafio 2")

    var texto = ""

    print("Digite um numero: ")
    val numero = readln().toDouble()

    if(numero % 2 == 0.0){
        texto = "o numero ${numero} é par "
    } else if (numero % 2 != 0.0){
        texto = "o numero ${numero} é impar "
    }

    if(numero * (-1) < 0.0){
        texto = texto + "e positivo"
    } else if (numero * (-1) > 0.0 ){
        texto = texto + "e negativo"
    }

    println(texto)
}

fun desafio3(){
    println("Desafio 3")
    print("Digite um valor inteiro A: ")
    val A = readln().toInt()
    print("Digite um valor inteiro B: ")
    val B = readln().toInt()

    var C = 0

    if(A == B){ C = A + B; println(C) }
    else{ C = A * B; println(C) }
}

fun desafio4(){
    println("Desafio 4")
    print("Digite um numero: ")
    val numero = readln().toInt()

    println("numero = $numero")
    println("antecessor = ${numero - 1}, sucessor = ${numero + 1} ")
}

fun desafio5(){
    println("Desafio 5")
    print("Digite o seu salário: ")
    val salario = readln().toDouble()

    println("Seu salario de R$ $salario é equivalente a ${"%.2f".format(salario / 1293.20)}x que o salario minimo de R$ 1293,20.")
}

fun desafio6(){
    println("Desafio 6")
    print("Digite um numero: ")
    var numero = readln().toDouble()

    println("$numero com reajuste de 5% é ${numero * 1.05}")
}

fun desafio7(){
    println("Desafio 7")
    print("Digite o primeiro valor booleano (true ou false): ")
    var boolA = readln().toBoolean()

    print("Digite o segundo valor booleano (true ou false): ")
    var boolB = readln().toBoolean()

    if (boolA && boolB) {
        println("Ambos os valores são verdadeiros.")
    } else if (!boolA && !boolB) {
        println("Ambos os valores são falsos.")
    } else {
        println("Um dos valores é verdadeiro e o outro é falso.")
    }
}

fun desafio8(){
    println("Desafio 8")
    print("Digite um valor inteiro A: ")
    val A = readln().toInt()
    print("Digite um valor inteiro B: ")
    val B = readln().toInt()
    print("Digite um valor inteiro C: ")
    val C = readln().toInt()

    var numeros = listOf(A, B, C)

    println("${numeros.sortedDescending()}")
}

fun desafio9(){
    println("Desafio 9")
    print("Digite seu peso: ")
    val peso = readln().toDouble()
    print("Digite sua altura: ")
    val altura = readln().toDouble()

    var imc = peso /(altura * altura)

    val classificacao = when {
        imc < 18.5 -> "Abaixo do peso"
        imc in 18.5..24.9 -> "Peso ideal (parabéns)"
        imc in 25.0..29.9 -> "Levemente acima do peso"
        imc in 30.0..34.9 -> "Obesidade grau I"
        imc in 35.0..39.9 -> "Obesidade grau II (severa)"
        imc >= 40 -> "Obesidade grau III (mórbida)"
        else -> "Valor inválido"
    }

    println("Seu IMC é de ${"%.2f".format(imc)} e sua classificação é: $classificacao")
}

fun desafio10(){
    println("Desafio 10")
    print("Digite a primeira nota: ")
    val primeiro = readln().toDouble()
    print("Digite a segundo nota: ")
    val segundo = readln().toDouble()
    print("Digite a terceira nota: ")
    val terceiro = readln().toDouble()

    print("A média das notas: ${"%.2f".format((primeiro + segundo + terceiro) / 3)}")
}

fun main() {

    print("Escolha o desafio para rodar (1 a 10):")
    val escolha = readln().toIntOrNull()

    when (escolha) {
        1 -> desafio1()
        2 -> desafio2()
        3 -> desafio3()
        4 -> desafio4()
        5 -> desafio5()
        6 -> desafio6()
        7 -> desafio7()
        8 -> desafio8()
        9 -> desafio9()
        10 -> desafio10()
        else -> println("Opção inválida! Por favor, escolha um número entre 1 e 10.")
    }
}