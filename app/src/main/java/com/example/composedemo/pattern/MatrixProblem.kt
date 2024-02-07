package com.example.composedemo.pattern

fun main(){
    val row = 2
    val column = 3
    val matrix = arrayOf(intArrayOf(2,3,4), intArrayOf(5,6,7))

        //Display current matrix
    display(matrix)
    //Transport the matrix

    /*val transpose = Array(column) {IntArray(row)}
    for (i in 0 until row-1){
        for (j in 0 until column-1){
            transpose[j][i] = matrix[i][j]
        }
    }*/

    // Transpose the matrix
    val transpose = Array(column) { IntArray(row) }
    for (i in 0 until row) {
        for (j in 0 until column) {
            transpose[j][i] = matrix[i][j]
        }
    }
    //Display transposed matrix
    display(transpose)
}
fun display(matrix: Array<IntArray>) {
    println("The Matrix is : ")
    for(row in matrix){
        for (column in row){
            print("$column ")
        }
        println()
    }
}