package com.example.composedemo.pattern

fun main(){
    //solvePattern(10)
    anotherPattern(10)
}

private fun solvePattern( N:Int){
    for (i in 0 until N) {
        // This is the inner loop which here, loops for the columns
        // as we have to print a rectangular pattern.
        for (j in 0 until i) {
            print("$j ")
        }

        // As soon as N stars are printed, we move to the
        // next row and give a line break otherwise all stars
        // would get printed in 1 line.
        println()
    }
}
private fun anotherPattern(n:Int){
    for (i in 1 until n){
        for(j in 1 until n){
            for(k in 1 until n/(i+j)){
                print("* ")

            }
        }
        println()
    }
}