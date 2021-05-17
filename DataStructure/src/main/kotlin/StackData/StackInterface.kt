package StackData

interface StackInterface<T> {

    /*
        Abstraction of method that inserts a element in last position of Stack
     */
    fun push(element: T)

    /*
        Abstraction of method that removes a last element of Stack
     */
    fun pop(): T?
}