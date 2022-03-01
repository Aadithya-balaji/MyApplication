package com.example.myapplication.view.viewmodel

import android.view.View
import android.widget.Toast
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

     var username = ObservableField("")
    var password = ObservableField("")



    fun submit(view : View){

        if (username.toString().equals("")){
            Toast.makeText(view.context,"Enter Username",Toast.LENGTH_LONG).show()
        }
       /* if (password.equals("")){
            Toast.makeText(view.context,"Enter Password",Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(view.context,"Response submitted successfully",Toast.LENGTH_LONG).show()

        }*/

    }


}