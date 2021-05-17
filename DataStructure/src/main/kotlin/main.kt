import LinkedList.*
import StackData.Stack

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
    val stack=Stack<Int>()
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



}



