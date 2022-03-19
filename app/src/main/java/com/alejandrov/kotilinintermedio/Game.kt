package com.alejandrov.kotilinintermedio

interface Game {
    val game: String
        get() = "Among us"
    fun play()

    fun stream(){
        println("Estoy haciendo stream de mi juego $game")
    }
}