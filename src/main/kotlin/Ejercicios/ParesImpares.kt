package Ejercicios/*Desarrollar un programa que permita cargar n números enteros y luego nos informe cuántos valores
fueron pares y cuántos impares.
Emplear el operador "%" en la condición de la estructura condicional:
if (valor % 2 == 0)         //Si el if se verifica verdadero luego es par.
*/
fun main(){
    pedirNumero();
}

fun pedirNumero(){
    var contadorP=0
    var contadorI=0
    do{
        println("Introduce numero, cuando pares pulsa 0")
        val numero= readln().toInt()
        if(numero==0) else if(numero%2==0) contadorP++ else contadorI++
    }while (numero!=0)
    println( "Hay $contadorP numeros pares y $contadorI impares")

}