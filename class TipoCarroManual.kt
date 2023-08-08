class TipoCarroManual(
    nome:String,
    modelo:String,
    ano:Int,
    cor:String,
    velocidadeAtual: Double
):Carro(nome,modelo,ano,cor,velocidadeAtual) {

    override fun detalhesCarro(): String {
        return "MANUAL, FREIO ABS, DIREÇÃO ELETRÔNICA"
    }


}
