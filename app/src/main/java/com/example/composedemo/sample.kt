package com.example.composedemo

fun String.removeFirstLastChar():String = this.substring(1,this.length-1)

fun main(args:Array<String>){
    val myString="Hello Everyone"

    solvePattern(5)

}
private fun solvePattern( N:Int){
    for (i in 0 until N) {
        // This is the inner loop which here, loops for the columns
        // as we have to print a rectangular pattern.
        for (j in 0 until i) {
            print("* ")
        }

        // As soon as N stars are printed, we move to the
        // next row and give a line break otherwise all stars
        // would get printed in 1 line.
        println()
    }
}