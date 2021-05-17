package Queues


/*
    This implementation is based in a ArrayList.Exist other ways to implement.
    E.g. Doubly Linked List / Ring Buffer / Two stacks
 */
class Queue<T> : QueueInterface<T> {
    private val list = arrayListOf<T>()

    override fun toString(): String {
        if (list.isEmpty()) {
            return "Empty Queue"
        }
        return list.toString()

    }

    override fun enqueue(element: T): Boolean {
        list.add(element)
        return true
    }

    override fun dequeue(): T? {
        if (this.list.isEmpty()) {
            return null
        }
        return list.removeAt(0)
    }

    override val count: Int
        get() = list.size

    override fun peek(): T? {
        return list.getOrNull(0)
    }

}