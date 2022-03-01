package com.example.myapplication

object MainActivityValidator {
    fun validator(username : String,password : String) : Boolean{
        if (username.isEmpty()){
            return false
        }
        if (password.isEmpty() || password.contains(username)){
            return false
        }
        return true
    }
}