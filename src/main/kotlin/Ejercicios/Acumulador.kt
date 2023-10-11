package Ejercicios

/*Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar el 9999
(no sumar dicho valor, indica que ha finalizado la carga). Imprimir el valor acumulado e informar
si dicho valor es cero, mayor a cero o menor a cero.

En un banco se procesan datos de las cuentas corrientes de sus clientes. De cada cuenta corriente se conoce: número de cuenta y saldo actual.
El ingreso de datos debe finalizar al ingresar un valor negativo en el número de cuenta.

    Se pide confeccionar un programa que lea los datos de las cuentas corrientes e informe:
    a)De cada cuenta: número de cuenta y estado de la cuenta según su saldo, sabiendo que:
Estado de la cuenta	'Acreedor' si el saldo es >0.
			'Deudor' si el saldo es <0.
			'Nulo' si el saldo es =0.

    b) La suma total de los saldos acreedores.*/
fun main(){
    val banco= banco()
    println(banco)
    banco.forEach(){ println("La cuenta ${it.numero_Cuenta} presenta un estado ${it.estado()}") }

}

fun banco(): ArrayList<Cuenta> {
    var banco=ArrayList<Cuenta>()
    var numeroCuenta=0
    while(numeroCuenta>=0){
        print("Introduce numero de cuenta: ")
        numeroCuenta= readln().toInt()
        print("Introduce saldo: ")
        val saldo= readln().toDouble()
        if(numeroCuenta>=0) banco.add(Cuenta(numeroCuenta,saldo))
    }
return banco
}

class Cuenta(val numero_Cuenta: Int, var saldo: Double){

    fun estado():String {
        var estado :String
        if(saldo<0) estado="Deudor" else if (saldo>0) estado="Acreedor" else estado= "Nulo"
        return estado
    }

    fun ingresar( ingreso: Double){
        saldo=saldo+ingreso
    }
    override fun toString(): String {
        return "numero de cuenta $numero_Cuenta saldo $saldo"
    }

}

/*
fun sumar() {
    var entrada=0
    var suma=0
    while (entrada!=9999){
        print("Introduce numero a sumar: ")
        entrada= readln().toInt()
        if(entrada!=9999)suma+=entrada
    }
    if(suma == 0) println("$suma es cero")else if(suma< 0) println("$suma es menor que cero")else if(suma > 0) println("$suma es mayor que cero")
}*/