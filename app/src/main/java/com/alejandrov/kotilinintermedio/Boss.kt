package com.alejandrov.kotilinintermedio

class Boss(name: String, age:Int): Person(name, age){
    override fun work() {
        println("Esta persona está en una reunión")
    }

    }
