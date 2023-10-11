package Ejercicios/*CONDICIONAL COMO EXPRESIÓN

Cargar un valor entero por teclado comprendido entre 1 y 99. Almacenar en otra variable la cantidad de dígitos que tiene el valor ingresado por teclado.

    Mostrar la cantidad de dígitos del número ingresado por teclado.*/

/*Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y muestre un mensaje indicando
si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el número de cifras es mayor.*/
fun main() {

    algunMenoresDiez()
}

fun numeros():Int{
    println("Introduzca un numero entero entre 1 y 99")
    val numero=readln().toInt()
    var cantidad =if(numero<10) 1 else 2
    println("el numero tiene $cantidad digitos")
    return cantidad
}

fun cifras(){
    println("Introduzca un numero entero entre 0 y 999")
    val cifras= readln().toInt()
    if(cifras>=1000) println("ERROR tiene mas de 3 cifras") else if(cifras>99) println("Tiene 3 cifras") else if(cifras>9) println("Tiene 2 cifras") else println("Tiene 1 cifra")
}
/*Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10, imprimir en pantalla la leyenda "Todos los números son menores a diez".*/

fun menoresDiez(){
    println("Introduce un numero")
    val v1= readln().toInt()
    println("Introduce un numero")
    val v2= readln().toInt()
    println("Introduce un numero")
    val v3= readln().toInt()

    if( v1<10 && v2<10 && v3<10) println("Todos los numeros menores a 10")

}
fun algunMenoresDiez(){
    val v= arrayOfNulls<Int>(3)
    for (i in 0..2){
        println("Introduce un numero")
        v[i]=readln().toInt()
    }

    if( v[1]!! <10 || v[2]!!<10 || v[3]!!<10) println("Al menos un de los numeros es menora 10")

}
/*Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de preguntas que se le realizaron
y la cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del
 mismo según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:

    	Nivel máximo:	Porcentaje>=90%.
    	Nivel medio:	Porcentaje>=75% y <90%.
    	Nivel regular:	Porcentaje>=50% y <75%.
    	Fuera de nivel:	Porcentaje<50%.*/

fun postulante(){
    val v= arrayOfNulls<Int>(2)
    println("Preguntas")
    v[0]= readln().toInt()
    println("Respuestas correctas")
    v[1]= readln().toInt()
    val porcentaje=(v[1]!! / v[0]!!)*100
    if (porcentaje>=90)  println("Nivel max")
        else if(porcentaje>=75) println("Nivel medio")
        else if (porcentaje>=50) println("Nivel regular")
        else println("Fuera de nivel")
}

fun postulante2(){
    val v= arrayOfNulls<Int>(2)
    println("Preguntas")
    v[0]= readln().toInt()
    println("Respuestas correctas")
    v[1]= readln().toInt()
    val porcentaje=(v[1]!! / v[0]!!)*100
        when(porcentaje){
            in 90..100 ->println("Nivel max")
            in 75..90 -> println("Nivel medio")
            in 50..75->println("Nivel regular")
            else -> println("Fuera de nivel")
        }
}

