package LinkedList

class Challenge<T> {
    /*
        Reverse a linkedList
     */

    fun printInReverse(node: Node<T>?) {
        if (node == null) {
            return
        }
        printInReverse(node?.next)
        if (node?.next != null) {
            print("->")
        }
        print(node?.value.toString())
    }

    /*
        Print the middle node value
     */

    fun printMiddleItem(list: LinkedList<T>) {
        if (list == null || list.isEmpty()) {
            println("List is Empty!")
            return
        }
        val middlePos = list.size / 2
        println(list.getNode(middlePos)?.value.toString())

    }

    /*
        Merge Two LinkedLists
     */

    fun mergeLinkedLists(list1: LinkedList<T>, list2: LinkedList<T>): LinkedList<T> {
        if (list1.isEmpty()) {
            return list2
        } else if (list2.isEmpty()) {
            return list1
        }
        val list3 = LinkedList<T>()
        var it=0
        //NOT IMPLEMENTED
        return list3
    }
}