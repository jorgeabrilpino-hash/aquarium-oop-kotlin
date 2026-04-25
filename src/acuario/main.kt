package acuario

fun construirAcuario(){

    val miAcuario = Acuario(ancho = 25, largo = 25, alto = 40)
    miAcuario.imprimirTamano()
    val miTorre = Acuario.TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()


    miAcuario.nombre()
}

fun main(){
    construirAcuario()
}