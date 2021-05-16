package LinkedList

import java.lang.IndexOutOfBoundsException

class LinkedListIterator<T>(private val list: LinkedList<T>) : Iterator<T> {

    /*
        Represents a atual position in LinkedList
     */
    private var index = 0

    /*
        Represents a actual node that iterator is pointing
     */

    private var lastNode: Node<T>? = null

    /*
        Advances one position in a LinkedList
     */
    override fun next(): T {
        if (index >= list.size) throw IndexOutOfBoundsException()
        if (index == 0) {
            lastNode = list.getNode(0)
        } else {
            lastNode?.next
        }
        index++
        return lastNode!!.value
    }

    /*
        Verify if exists a next element in a LinkedList
     */
    override fun hasNext(): Boolean {
        return index < list.size
    }
}