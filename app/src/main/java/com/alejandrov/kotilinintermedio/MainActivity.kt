package com.alejandrov.kotilinintermedio

import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

typealias MyMapList = MutableMap<Int,ArrayList<String>>
typealias MyFun = (Int, String, MyMapList) -> Boolean
typealias MyNestedClass = MyNestedAndInnedClass.MyNestedClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                //Enum Classes
        //enumClasses()

                // Nested and Inned Classes
                //Nos sirven para que nuestro código sera más resistente y seguro
        //nestedAndInnerClasses()

                //Clases Ineritance
        //classInheritance()
                //Interfaces


                // Interfaces
        //interfaces()

                //Modificadores de visibilidad: private, protected,internal, public
        //visibilityModifiers()

                //Clases de datos
        //dataClasses()

                //Type aliases
        //typeAliases()

                //Destructuring declarations
        destucturingDeclarations()

    }

    enum class Direction(val dir:Int) {
        NORTH(dir = 1), SOUTH(dir = -1), EAST(dir = 1), WEST(dir = -1);

        fun description (): String{
            return when (this) {
                NORTH -> "La dirección es NORTE"
                SOUTH -> "La dirección es SUR"
                EAST -> "La dirección es ESTE"
                WEST -> "La dirección es OESTE"
            }
        }
    }

    private fun enumClasses(){
        var userDirection:Direction? = null
        println("Dirección: $userDirection")

        userDirection = Direction.NORTH
        println("Dirección $userDirection")

        userDirection = Direction.EAST
        println("Dirección $userDirection")

        println("Propiedad name: ${userDirection.name}")
        println("Propiedad name: ${userDirection.ordinal}")

        println(userDirection.description())

        println(userDirection.dir)

    }
    // Lección 2. Nested and Inner Classes
    private fun nestedAndInnerClasses(){

        val MyNestedClass = MyNestedAndInnedClass.MyNestedClass()
        val sum:Int = MyNestedClass.sum(10, 5)
        println("El resultado de la suma es $sum")

        val myInnerClass: MyNestedAndInnedClass.MyInnerClass = MyNestedAndInnedClass().MyInnerClass()
        val sumTwo = myInnerClass.sumTwo(10)
        println("El resultado de la suma es $sumTwo")
    }

    // Lección 3. Clases heredadas
    private fun classInheritance(){

        val person = Person("Barandela",28)

        //val worker = Worker("Alejandro", 30, "con un vídeo")
        //worker.work()
        //worker.sayLanguage()
        //worker.goToWork()
        //worker.drive()

        val boss = Boss("Vanesa", 45)
        //boss.work()
        //boss.goToWork()

    }

    // Lección 4. Interfaces
    private fun interfaces(){

            val gamer = Person ("Alejandro", 30)
    gamer.play()
    gamer.stream()

    }

    // Lección 5. Modificadores de visibilidad

    private fun visibilityModifiers(){
        //val visibility = Visibility()
        //visibility.name = "Alejandro"
        //visibility.sayMyName()

        val visibilityTwo = VisibilityTwo()

    }

    // Lección 6. Data Classes

    private fun dataClasses(){
        val marcos = Journalist("Marcos", 33, "Política")
        marcos.lastWork = "Cadena SER"

        val monica = Journalist("Mónica", 29, "Cultura")

        val pinheiro = Journalist("Marcos", 33, "Política")
        marcos.lastWork = "Cadena SER"

        // equals & hashCode
        if (marcos == pinheiro){
            println("Son iguales")
        } else {
            println("No son iguales")
        }

        //toString
        println(marcos.toString())

        //copy
        val marcos2 =  marcos.copy(section = "Economía")
        println(marcos.toString())
        println(marcos2.toString())

        //componentN
        val (name, age) = marcos
        println(name)
        println(age)
    }

    // Lección 7. Type Aliases

        private var myMap: MyMapList = mutableMapOf()
        private fun typeAliases(){
            var myNewMap: MyMapList = mutableMapOf()
            myNewMap[1] = arrayListOf("Alejandro", "Drov")
            myNewMap[2] = arrayListOf("Mateo", "Matej")

            myMap = myNewMap

        }

    // Lección 7. Deconstruring declarations

        private fun destucturingDeclarations() {
            val (name, _, section) = Journalist("Alejandro", 31,"Vídeo")
            println("$name, $section")

            val nando = Journalist("Nando", 27, "Videoperiodista")
            println(nando.component3())

            val (pabloName, pabloAge, pabloSection) = myJournalist()
            println("$pabloName, $pabloAge, $pabloSection")

            val myMap = mapOf(1 to "Alejandro", 2 to "Mateo", 3 to "Pablo", 4 to "Marta")
                for ((id, name) in myMap){
                    println("$id, $name")
                }
        }
    private fun myJournalist() : Journalist{
        return Journalist("Pablo", 33, "Diseñador")
    }
}