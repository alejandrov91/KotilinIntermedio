package com.alejandrov.kotilinintermedio

open class Person(name:String, age:Int) :Work(), Game{

    // Cualquier clase tiene una superclase comón "Any"

    open fun work (){
        println("Esta persona está trabajando")
    }
    override fun goToWork(){
        println("Esta persona está yendo al trabajo")
    }

    //Game Interdace
    override val game: String = "Among us"

    override fun play() {
        println("Esta persona está jugando a $game")
    }


}