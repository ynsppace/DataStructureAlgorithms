package LinkedList

class Challenge<T> {
    /*
        Reverse a linkedList
     */

    fun printInReverse(node: Node<T>?) {
        if (node== null) {
            return
        }
        printInReverse(node?.next)
        if (node?.next != null) {
            print("->")
        }
        print(node?.value.toString())
    }
}