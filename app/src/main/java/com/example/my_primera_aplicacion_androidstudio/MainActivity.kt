package com.example.my_primera_aplicacion_androidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //saludo()
        //println("Hola compañeros de programación 4")

        // variableyConstantes()
        // ejercicioVarVal()
        //tiposDeDatos()
        tiposDeDatosDeducidoExplicitos()

    }

    /*
    La
    de
    comentario

    *
     */

    fun saludo(){
        println("Hola buenas tardes estoy creando mi primera app")
    }

    private fun variableyConstantes(){
        //Variables
        var myPrimeraVariable = "Hola compañeros de Ingenieria"
        println(myPrimeraVariable)

        myPrimeraVariable = "Aqui cambiamos el valor de la variable"
        println(myPrimeraVariable)

        //Constante
        val myPrimeraConstante = "Esto es una constante"
        println(myPrimeraConstante)
        //Una constante no puede se modificado su valor
        //myPrimeraConstante = "Otro valor"

        val miSegundaConstante:String = myPrimeraVariable
        println(miSegundaConstante)

        val miNumero = 1
        val miDouble = 2.2

    }

    fun ejercicioVarVal(){
        println("Hola Compañer@s")

        val nombre:String = "William"
        //nombre = "Pedri"

        var apellido:String = "Lopes"
        apellido = "Caballero"

        var edad:Int = 21
        edad = 22

        var salario = 1200
        salario = 1220

        var nombreCompleto = nombre + " "+apellido
        println(nombreCompleto)

        val añoNacimiento = 2000
        var añoActual = Calendar.getInstance().get(Calendar.YEAR)
        var Edad = añoActual-añoNacimiento
        println("Tu edad es: " + Edad)
        println("Tu edad es:  $Edad")

    }

    private fun tiposDeDatos(){
        //Enteros(Byte,Short,Int,Long)
        val myInt = 1
        val myInt2:Int = 3
        val myInt3:Int = myInt + myInt2
        println(myInt3)

        //Decimales(Float, Double)
        val myFloat = 1.7f
        val myFloat2:Float = 1.7f
        val myDouble = 1.3
        val myDouble2:Double = 1.4
        val myDouble3:Double = 5.0
        val mySumaDouble = myDouble+myDouble2+myDouble3
        println(mySumaDouble)

        //boolean (bool)
        val myBoolean:Boolean = true
        val myBoolean2 = false
        val myBoolean3 = true
        println(myBoolean==myBoolean2)
        println(myBoolean&&myBoolean3)

    }

    private fun tiposDeDatosDeducidoExplicitos(){
        //tipos de datos
        var enteroExplicito:Int = 45
        println(enteroExplicito.javaClass)
        var enteroDeducido = 35
        println(enteroDeducido.javaClass)

        var dobleExplicito:Double = 45.45
        println(dobleExplicito.javaClass)
        var dobleDeducido = 35.35
        println(dobleDeducido.javaClass)

        var flotanteExplicito:Float = 45.45f
        println(flotanteExplicito.javaClass)
        var flotanteDeducido = 35.35f
        println(flotanteDeducido.javaClass)

        var largoExplicito:Long = 454545
        println(largoExplicito.javaClass)
        var largoDeducido = 353535L
        println(largoDeducido.javaClass)

        var textoExplicito:String = "45"
        println(textoExplicito.javaClass)
        var textoDeducido:String = "35"
        println(textoDeducido.javaClass)

        enteroExplicito=textoExplicito.toInt()
        println(enteroExplicito.javaClass)

        enteroDeducido=textoDeducido.toInt()
        println(enteroDeducido.javaClass)



    }


}