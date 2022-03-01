package com.example.myapplication

import com.example.myapplication.view.MainActivityValidator
import com.google.common.truth.Truth.assertThat
import org.junit.Test


class MainActivityValidatorTest{

    @Test
    fun validInput(){
        var username = "Test"
        var password = "Password@123"
        val result = MainActivityValidator.validator(username, password)
        assertThat(result).isTrue()

    }

    @Test
    fun invalidInput(){
        var username = "Test"
        var password = "Test"

        val result = MainActivityValidator.validator(username, password)
        assertThat(result).isFalse()

    }

    @Test
    fun invalidUsername(){
        var username = ""
        var password = "Password@123"

        val result = MainActivityValidator.validator(username, password)
        assertThat(result).isFalse()

    }

    @Test
    fun invalidPassword(){
        var username = "Test"
        var password = ""

        val result = MainActivityValidator.validator(username, password)
        assertThat(result).isFalse()

    }

    @Test
    fun passwordSameAsUsername(){
        var username = "Test"
        var password = "Test"

        val result = MainActivityValidator.validator(username, password)
        assertThat(result).isFalse()

    }

}