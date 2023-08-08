open class Carro(
    var nome: String,
    var modelo: String,
    var ano: Int,
    var cor: String,
    var velocidadeAtual: Double
){
    open fun acelerarCarro():String{
        if(velocidadeAtual == 0.0){
            println("Carro Parado")
        }

        return "ACELERAR"
    }

    open fun freiarCarro():String{
        if(velocidadeAtual >= 75.0){
            println("Velocidade Máxima Atingida")
        }
        return "FREIAR"
    }

    open fun detalhesCarro():String{
        return "OKAY"
    }

}
