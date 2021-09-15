package com.alierguc.oopkotlin

class Dog : Animal() {
    fun dogFunc(){
        super.Bark()
    }
    // Eğer Bu bu fonksiyonu override etmez isek hata verecektir. Aynı Şekilde
    // Animal Class'ındaki Bark Fonksiyonunu'da open yapmamız gerekecektir.
    override fun Bark(){
        println("Hayvan Havladı")
    }

}