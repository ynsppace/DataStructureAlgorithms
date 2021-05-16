import LinkedList.*

/*
    Testing a LinkedList methods
 */
fun main(args: Array<String>) {
     val node1 = Node(value = 1)
     val node2 = Node(value = 2)
     val node3 = Node(value = 3)

     node1.next = node2
     node2.next = node3

     println(node1)
     println(node2)

     val list = LinkedList<Int>()
     list.push(3)
     list.push(2)
     list.push(1)

     println(list)

     list.pop()
     println(list)

     list.push(4)
     list.removeLast()
     println(list)

     //list.removeAfter(list.getNode(1))
     println(list)
     /*
         Challenges
     */

     println("------------------------------------------------------------------------------------------------------")

     val linkedList = LinkedList<Int>()
     linkedList.push(1)
     linkedList.push(2)
     linkedList.push(3)
     val node=linkedList.getNode(list.size/2)
     println("wasdas")
}



