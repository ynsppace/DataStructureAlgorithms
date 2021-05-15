package com.example.algorithms.LinkedList

/*
    Represent a Linked List
 */
class LinkedList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

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

}