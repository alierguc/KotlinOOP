package com.alierguc.oopkotlin

class SpecialArts(_artistsName: String, _artistsAge: Int, _artistsProfession: String)
                : Arts(_artistsName, _artistsAge, _artistsProfession)
{
    fun singASong(){
        println("Şarkı Söyleniyor.");
    }

}