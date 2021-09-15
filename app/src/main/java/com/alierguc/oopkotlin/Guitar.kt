package com.alierguc.oopkotlin

class Guitar : Insturment,Decoration {
    var guitarBrand: String? = null
    var isElectro: Boolean? = null

    override var room: String
    get() = "Saloon"
    set(value){}

}