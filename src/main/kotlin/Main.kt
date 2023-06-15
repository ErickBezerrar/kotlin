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



}