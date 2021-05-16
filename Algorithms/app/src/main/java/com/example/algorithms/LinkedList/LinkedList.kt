package com.example.algorithms.LinkedList

/*
    Represent a Linked List
 */
class LinkedList<T> : Iterable<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    /*
        Makes the size visible of outside the class, but the setter is private
     */
    var size = 0
        private set

    /*
        Creates a instance of iterator
     */
    override fun iterator(): Iterator<T> {
        return LinkedListIterator(this)
    }

    /*
        Verify if a list contains elements
     */
    fun isEmpty(): Boolean {
        return size == 0
    }

    /*
        Returns a description of the list
     */
    override fun toString(): String {
        if (isEmpty()) {
            return "Empty List"
        } else {
            return head.toString()
        }
    }

    /*
        Returns a node in specified index(position)
     */

    fun getNode(index: Int): Node<T>? {
        var currentNode = head
        var currentIndex = 0

        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next
            currentIndex++
        }
        return currentNode
    }

    /*
        Adds a new value at the front of the list
     */
    fun push(value: T): LinkedList<T> {
        head = Node(value = value, next = head)
        if (tail == null) {
            tail = head
        }
        size++
        return this
    }

    /*
        Adds a value at the end of the list
     */
    fun append(value: T) {
        if (isEmpty()) {
            this.push(value)
            return
        }
        tail?.next = Node(value = value)
        tail = tail?.next
        size++

    }

    /*
        Adds a value after a particular node of the list
     */

    fun insert(value: T, nodePosition: Node<T>): Node<T> {
        if (tail == nodePosition) {
            append(value)
            return tail!!
        }
        val newNode = Node(value = value, next = nodePosition.next)
        nodePosition.next = newNode
        size++
        return newNode
    }

    /*
        Removes the value at the front of the list
     */
    fun pop(): T? {
        if (!isEmpty()) {
            size--
        }
        val result = head?.value
        head = head?.next
        if (isEmpty()) {
            tail = null
        }
        return result
    }

    /*
        Removes the value at the end of the list
     */
    fun removeLast(): T? {
        val head = head ?: return null
        if (head.next == null) return pop()
        size--

        var prev = head
        var current = head
        var next = current.next

        while (next != null) {
            prev = current
            current = next
            next = current.next
        }
        prev.next = null
        tail = prev
        return current.value
    }

    /*
        Removes a value anywhere in the list
     */
    fun removeAfter(node: Node<T>): T? {
        val result = node.next?.value
        if (node.next == tail) {
            tail = node
        }
        if (node.next != null) {
            size--
        }
        node.next = node.next?.next
        return result
    }

}