package Ejercicios/*Problemas propuestos

Definir una variable inmutable con el valor 50 que representa el lado de un cuadrado, en otras dos variables inmutables almacenar la superficie y el perímetro del cuadrado.
Mostrar la superficie y el perímetro por la Consola.
Definir tres variables inmutables y cargar por asignación los pesos de tres personas con valores Float. Calcular el promedio de pesos de las personas y mostrarlo.
*/

fun main (){
    val valor1:Int
    val valor2: Int
    valor1 = 100
    valor2 = 400
    var resultado: Int
    resultado = valor1 + valor2
    println("La suma de $valor1 + $valor2 es $resultado")
    resultado = valor1 * valor2
    println("El producto de $valor1 * $valor2 es $resultado")

    val lado: Int
    val superficie: Int
    val perimetro: Int
    lado = 50
    superficie = lado*lado;
    perimetro =lado*4;
    println("El lado es $lado, la superficie es $superficie y el perimetro es $perimetro")

    val persona1 : Float
    val persona2 : Float
    val persona3 : Float
    persona1= 75.5F
    persona2= 125.5F
    persona3= 70F
    var promedio =(persona1+persona2+persona3)/3
    println("El promedio de los pesos es $promedio ")

}