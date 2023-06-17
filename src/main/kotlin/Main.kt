import java.util.stream.IntStream.range

fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")
    println("Yes!")

    //Teste
    var name: String = "Erick"
    var idade: Int = 18
    println(name)
    println(idade)


    //Tamanho dos tipos de dados
    println("Double MAX ${Double.MAX_VALUE} - MIN ${Double.MIN_VALUE}")
    println("Float MAX ${Float.MAX_VALUE} - MIN ${Float.MIN_VALUE}")
    println("Long MAX ${Long.MAX_VALUE} - MIN ${Long.MIN_VALUE}")
    println("Int MAX ${Int.MAX_VALUE} - MIN ${Int.MIN_VALUE}")
    println("Short MAX ${Short.MAX_VALUE} - WIN ${Short.MIN_VALUE}")
    println("Byte MAX ${Byte.MAX_VALUE} - WIN ${Byte.MIN_VALUE}")


    //Declaração dos tipos de variáveis
    var c: Char = 'a'
    var S: String = "hsdffsddf sdf segsdfg sdfg sdg sd rgiybser ibsdflhb dsflgib dfg bdsgflisdbgflsdhb"
    var b: Boolean = true
    var double: Double = 10.0
    var float: Float = 10f
    var long: Long = 10L
    var short: Short = 10
    var byte: Byte = 10
    var int: Int = 40
    val abc: UInt = 50u //O "u" sempre será usado depois da declaração do valor da variável. UNSIGNED"


    var nome2 = "Tony" //Usando o var a varíavel pode ser mudada
    nome2 = "José"
    println(nome2)


    val nome3 = "Tony" //Usando val significa que a variável não poderá ser mutada


    //Formatação de Strings

    val nome4 =  "Tony"
    val sobrenome = "Stark"

    println("Eu sou o $nome4 $sobrenome") //Cifrão é usado para colocar variaveis dentro de String
    println("Double: ${Double.MAX_VALUE}") //Quando usamos o "." significa que estamos acessando algum parametro daquela varável específica

    var str = "dkansdiu gai eba" + "asdibasdbasdbasidbayid" + "daophjsdouahgduhasd" + "daikphduioashduas" //Concatenação de Strings dessa forma também


    var nome99: String = "Erick Bezerra Ribeiro Trindade"
    var nome98: String = " "
    val numeromenor: UByte = 40u
    var pibbrasil: Long = 1869000000000
    var populacaobrasil: Int = 211000000

    var valor = pibbrasil / populacaobrasil
    println(valor)

    helloworld()
    hello(nome2)
    val soma = sum(70,90)
    val soma2 = sum(70,80)

    val str2 = "Erick Bezerra Ribeiro Trindade"

    str2.length

    transformar(2)
    tamanhostring("Isaac Da silva costa moreira")
    cubo(2)
    println(milha(1.0))

    val num96: Int = 90
    if (num96 > 20){
        println("Número maior do que 20")

    }

    verificaridade(90)
    calcularbonus(" ")
    calcularbonus1(" ", 9)
}

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
