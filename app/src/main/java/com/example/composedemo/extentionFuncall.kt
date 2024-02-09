package com.example.composedemo

//Create an extension for ArrayList which accepts only Int type to return all the even numbers using collections
fun main() {
    val arr1 = arrayListOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,12)
    val kotlin = arr1.getEvenNumber()
    println(kotlin)
}


fun ArrayList<Int>.getEvenNumber(): List<Int>{

    return this.filter{it %2 == 0}
}