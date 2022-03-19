package com.alejandrov.kotilinintermedio

class Visibility {

    private var name:String? = null
        private fun sayMyName(){
           name?.let {
           println("Mi nombre es $it")
           } ?: run {
               println("No tengo nombre")
           }
        }
}

open class VisibilityTwo{

    protected fun sayMyNameTwo(){
        val visibility = Visibility()
    }
}

//class VisibilityThree: VisibilityTwo{
    internal val age:Int? = null
//    fun sayMyNameThree()
        //sayMyNameTwo()

