package Queues

import StackData.Stack

class Challenge<T> {

    /*
        Reverse a queue
     */

    fun reverse(queue: Queue<T>): Stack<T> {

        val stack = Stack<T>()
        var value = queue.dequeue()
        while (value != null) {
            stack.push(value)
            value = queue.dequeue()
        }
        return stack
    }
}