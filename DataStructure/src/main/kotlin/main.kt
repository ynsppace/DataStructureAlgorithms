import LinkedList.*
import Queues.Queue
import StackData.Stack
import Tree.Node
import Tree.Tree

/*
    Testing a LinkedList methods
 */


fun main(args: Array<String>) {
    println("-------------------------TEST PRINT IN REVERSE-----------------------------------------------------------------------------")

    val linkedList = LinkedList<Int>()
    linkedList.append(1)
    linkedList.append(2)
    linkedList.append(3)
    linkedList.append(4)
    linkedList.append(5)
    linkedList.append(6)
    linkedList.append(7)
    println(linkedList)
    val ch1 = Challenge<Int>()
    ch1.printInReverse(linkedList.getNode(0))
    println()
    println("-------------------------TEST PRINT THE MIDDLE ITEM-----------------------------------------------------------------------------")
    ch1.printMiddleItem(linkedList)
    println()
    println("-------------------------MERGE TWO LINKED LISTS---------------------------------------------------------------------------------")
    println()
    println()
    println("-------------------------TESTING A STACK---------------------------------------------------------------------------------")
    val stack = Stack<Int>()
    stack.push(1)
    stack.push(2)
    stack.push(4)
    stack.push(6)
    stack.push(7)
    stack.push(9)
    println(stack)
    println("--------------REMOVING A ELEMENT------------------")
    stack.pop()
    println(stack)
    println()
    println("-------------------------TESTING A QUEUE---------------------------------------------------------------------------------")
    val queue = Queue<Int>()
    queue.enqueue(2)
    queue.enqueue(3)
    queue.enqueue(7)
    queue.enqueue(9)
    queue.enqueue(4)
    queue.enqueue(5)
    println(queue)
    queue.dequeue()
    println(queue)

    println()
    println("-------------------------TESTING A QUEUE OF STRINGS---------------------------------------------------------------------------------")
    val queue2 = Queue<String>()
    queue2.enqueue("D")
    queue2.enqueue("S")
    queue2.enqueue("A")
    queue2.enqueue("L")
    queue2.enqueue("G")
    println(queue2)
    queue2.enqueue("R")
    queue2.enqueue("O")
    queue2.dequeue()
    println(queue2)
    queue2.enqueue("C")
    queue2.dequeue()
    queue2.dequeue()
    queue2.enqueue("K")
    println(queue2)

    println()
    println("-------------------------TESTING A REVERSE QUEUE METHOD---------------------------------------------------------------------------------")
    val ch3 = Queues.Challenge<String>()
    println(ch3.reverse(queue2))

    println()
    println("-------------------------TESTING A TREE---------------------------------------------------------------------------------")
    val hot = Node("Hot")
    val cold = Node("Cold")
    val beverages = Node("Beverages")
    val tree = Tree(beverages)
    tree.add(hot)
    tree.add(cold)
    println(tree)


}



