package com.example.algorithms


fun main(args: Array<String>){

    val orderedData= listOf(1, 3, 56, 66, 68, 80, 99, 105, 450,451,460,480,552,5334)
    val x=Complexity(orderedData)
    println(x.inLogTimecontainsValue(450))

}
