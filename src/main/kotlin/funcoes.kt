fun hello(nome : String): String{
    return ("Olá $nome ! Seja bem vindo!!")
}

fun helloworld(): Unit { //O unit serve para funções que não tem retorno
    println("Hello World")
}

fun sum(num1: Int, num2: Int): Int{
    val num3 = num1 + num2
    return num3
}

fun sum2(num1: Int, num2: Int): Int = (num1 + num2)

fun transformar(anos: Int){

    println("${anos} equivalem a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")

}

fun tamanhostring(a: String){
    println(a.length)
}

fun cubo(num: Int){
    println(num * num * num)
}

fun milha(num: Double): Double{
    return (num * 1.6)
}

fun verificaridade(idade: Int)  {
    if(idade >18){
        println("Maior de idade")

        if (idade > 60){
            println("Terceira idade")
        }

    } else if(idade < 10 ){
        println("Criança")
    } else {
        println("Menor de idade")
    }
}

fun saudacao(dia: Boolean): String{
    return if (dia) {
        "Bom dia"
    } else{
        "Boa noite"
    }
}

fun calcularbonus(cargo: String) {
    var cargo: String = readln()

    if (cargo == "Gerente"){
        println("$cargo recebeu um bônus de 2.000 reais!")
    }
    else if (cargo == "Coordenador") {
        println("$cargo recebeu um bônus de 1.500 reais!")
    }
    else if (cargo == "Engenheiro"){
        println("$cargo recebeu um bônus de 1.000 reais!")
    }
    else if (cargo == "Estagiário"){
        println("$cargo recebeu um bônus de 500 reais!")
    } else {
        println("Profissão não especificada da empresa, por favor insira a profissão correta")
        calcularbonus(cargo)
    }
}

fun calcularbonus1(cargo: String, xp: Int) {
    var cargo: String = readln()
    if ((cargo == "Gerente") && xp < 2)
        println("$cargo receberá 2.000 reais pois possui $xp anos de experiencia")
    else {
        println("$cargo receberá 3.000 reais pois possui $xp anos de experiencia")
    }

    if (cargo == "Coordenador" && xp < 1) {
        println("$cargo receberá 1.500 reais pois possui $xp anos de experiencia")
    } else if (cargo == "Coordenador") {
        println("$cargo receberá 1.800 reais pois possui $xp anos de experiencia")
    }

    if (cargo == "Engenheiro")
        println("Por ser $cargo você receberá 1.000 reais de bônus")
    else if (cargo == "Estagiário") {
        println("Por ser $cargo você receberá 500 reais de bônus")
    }

}