package com.alierguc.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ///#region Classes Fundamentals
        println("----Classes Fundamentals------")
        val users = Users("Ali",24)
        println("Kullanıcılar : ${users.age}")
        ///endregion

        ///#region Encapsulation Fundamentals
        println("----Encapsulation Fundamentals------")
        val artists = Arts("Ali",50,"Software Developer")
        println("Artist's Name :  ${artists.artistsName} -  Artist's Age : " +
                "${artists.artistsAge}")
        // artists.artistsName = "Artist Name"; Hata Verecektir. Çünkü; Set Kısmı Private
        ///endregion

        ///#region Inheritance Fundamentals
        println("----Inheritance Fundamentals------")
        val inheritanceExample = SpecialArts("Ruhi",27,"Musician")
        inheritanceExample.singASong()
        ///endregion

        ///#region PolyMorphism Fundamentals
        println("----Static PolyMorphism Fundamentals------")
        val trans = Transactions()
        println(trans.carpma())
        println(trans.carpma(1,2))
        println(trans.carpma(1,2,3))
        println("----Dynamic PolyMorphism  Fundamentals------")
        val dog = Dog()
        val cat = Animal()
        println(dog.Bark())
        println(cat.Bark())
        ///endregion

        ///#region Abstraction & Interface Fundamentals
        println(users.humanFunc()) // Abstract Class
        var guitar = Guitar()
        guitar.guitarBrand = "Fender"
        guitar.isElectro = true
        println(guitar.room)
        guitar.information()
        ///#endregion

        ///#region Lambda Expressions
        printTheText("Test")
        val printTheTextLambda = {verilenString:String -> println(verilenString)}
        printTheTextLambda("Test Lambda")

        val printCarpmaIslemiLambda = {a: Int, b:Int -> println(a*b)}
        printCarpmaIslemiLambda(3,2)

        val carpmaLambdaV2 : (Int,Int) -> Int = {a,b -> a*b}
        println(carpmaLambdaV2(5,4))


        ///#endregion

    }

    fun printTheText(s: String) {
        println(s)
    }
}