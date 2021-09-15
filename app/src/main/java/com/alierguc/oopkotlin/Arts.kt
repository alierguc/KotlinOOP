package com.alierguc.oopkotlin

open class Arts(_artistsName:String, _artistsAge:Int, _artistsProfession:String) {

    // bir sınıfın miras alabilmesi için open anahtar kelimesi kullanılmalıdır.
    var artistsName : String? = _artistsName
        private set // Set Edilemesin ama Get Edilsin.
        get
    var artistsAge : Int? = _artistsAge
        private set
        get

    private var artistsProfession : String? = _artistsProfession
}