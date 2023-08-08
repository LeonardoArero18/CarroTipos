fun main(args: Array<String>) {

    val carroA = TipoCarroAutomatico(
        nome = "JEEP",
        modelo = "4X4",
        ano = 2014,
        cor = "Azul",
        velocidadeAtual = 0.0
    )

    val carroB = TipoCarroAutomatico(
        nome = "HB20",
        modelo = "HYUNDAI",
        ano = 2017,
        cor = "prata",
        velocidadeAtual = 75.35
    )

    val carroC = TipoCarroManual(
        nome = "UNO",
        modelo = "FIAT",
        ano = 2014,
        cor = "azul",
        velocidadeAtual = 50.0
    )



    println("Nome do CarroA: ${carroA.nome}")
    println("Modelo: ${carroA.modelo}")
    println("Ano: ${carroA.ano}")
    println("Cor: ${carroA.cor}")
    println("Velocidade Atual: ${carroA.velocidadeAtual}")
    println("${carroA.acelerarCarro()}")
    println("Detalhes:${carroA.detalhesCarro()}")

    println()

    println("Nome do CarroB: ${carroB.nome}")
    println("Modelo: ${carroB.modelo}")
    println("Ano: ${carroB.ano}")
    println("Cor: ${carroB.cor}")
    println("Velocidade Atual: ${carroB.velocidadeAtual}")
    println("${carroB.freiarCarro()}")
    println("Detalhes:${carroB.detalhesCarro()}")

    println()


    println("")








}
