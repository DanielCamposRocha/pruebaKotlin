package Ejercicios/*Se ingresan tres notas de un alumno, si el promedio es mayor o igual a cinco mostrar un mensaje "Apto".

Se ingresa por teclado un número entero comprendido entre 1 y 99, mostrar un mensaje indicando si el número tiene uno o dos dígitos.

(Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)*/



    fun main(){

        print("Ingrese nota: ")
        val nota= digitos()
        print("Ingrese nota: ")
        val nota2= digitos()
        print("Ingrese nota: ")
        val nota3= digitos()
        val promedio=(nota+nota2+nota3)/3
        if(promedio<5){
            println("El alumno es No apto")
        }else{
            println("El alumno es Apto")
        }

    }


    fun digitos():Int{
       val nota=readln().toInt()
        if(nota>=10){
            println("El numero tiene dos digitos")
        }else{println("El numero tiene un digito")}
        return nota
    }
