package StackData

class Stack<T> : StackInterface<T> {

    /*
        Represents the Stack Last-In First-Out(LIFO)
     */
    private val stack = arrayListOf<T>()


    /*
        Prints the elements Of Stack
     */

    override fun toString() = buildString {
        appendln("----top----")
        stack.asReversed().forEach {
            appendln("$it")
        }
        appendln("-----------")
    }


    /*
        Insert a element in the last position of stack
     */
    override fun push(element: T) {
        if (element != null) {
            stack.add(element)
        }
    }

/*
    Removes and return the last element of the list
 */

    override fun pop(): T? {
        if (this.stack.size == 0) {
            return null
        }
        return this.stack.removeAt(stack.size - 1)
    }
}