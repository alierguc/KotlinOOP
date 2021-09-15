package com.alierguc.oopkotlin

class Users : Human {
    /// This Summary Class Test
    var name: String? = null
    var age: Int? = null

    constructor(_name: String, _age: Int){
        this.name = _name;
        this.age = _age;
        println("Constructor Called !")

    }

    init {
        // ilk Çağırılan Kod Bloğu İnit'tir.
        println("Init Called !")
    }
}