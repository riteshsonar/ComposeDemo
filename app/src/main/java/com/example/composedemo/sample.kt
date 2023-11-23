package com.example.composedemo

fun String.removeFirstLastChar():String = this.substring(1,this.length-1)

fun main(args:Array<String>){
    val myString="Hello Everyone"
    val result=myString.removeFirstLastChar()

}