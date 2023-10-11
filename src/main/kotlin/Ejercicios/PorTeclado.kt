package Ejercicios

fun main() {
    print("Ingrese lado del cuadrado:")
    val lado = readln().toInt()
    val superficie= lado*lado
    val perimetro= lado*4
    println("El lado del cuadrado es $lado y $superficie es la superficie y el perimetro $perimetro")

    print("Ingrese peso primera persona: ")
    val persona1 = readln().toFloat()
    print("Ingrese peso segunda persona: ")
    val persona2 = readln().toFloat()
    print("Ingrese peso tercera persona: ")
    val persona3 = readln().toFloat()
    var promedio =(persona1+persona2+persona3)/3
    println("El promedio de los pesos es $promedio ")
    var numeros= arrayOf(0,0,0,0)
    for (i in 0..3){
        print("Introduzca numero entero: ")
        numeros[i]= readln().toInt()
    }
    for(i in 0..3){
        println(numeros[i])
    }
}