package Queues


/*
    Describe the core operations of the queue that can be implemented in many ways
 */
interface QueueInterface<T>{
     fun enqueue(element: T):Boolean
     fun dequeue():T?
     val count:Int
        get
    val isEmpty:Boolean
        get()=count==0
    fun peek():T?

}