package com.example.praktikum

class Login {
    var username = ""
    var password = ""

    fun logincheck():Boolean{
        if(username.equals("user") &&
            password.equals("amikom")){
            return true
        }
        else{
            return false
        }
    }
}