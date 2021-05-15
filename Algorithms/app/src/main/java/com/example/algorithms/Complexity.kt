package com.example.algorithms


/*

        Big O(Logn) complexity to find a value in a order list
 */

class Complexity(val orderedNumbers: List<Int>) {

    fun inLogTimecontainsValue(value: Int): Boolean {
        if (orderedNumbers == null) return false
        val middleIndex = orderedNumbers.size / 2
        if (value <= orderedNumbers[middleIndex]) {
            for (i in 0..middleIndex) {
                if (orderedNumbers[i] == value) {
                    return true
                }
            }
        } else {
            for (j in middleIndex until orderedNumbers.size) {
                if (orderedNumbers[j] == value) {
                    return true
                }
            }
        }
        return false
    }
}




