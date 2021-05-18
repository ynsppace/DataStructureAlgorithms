package Tree

class Tree<T>(root: Node<T>) {
    private val tree: MutableList<Node<T>> = mutableListOf()
    private val root = root


    /*
        Initializes the tree with root element
     */
    init {
        this.add(root)
    }
    /*
        adding a new node to the mutable List
     */
    fun add(node: Node<T>) {
        this.tree.add(node)
    }
    /*
        returns a description with tree elements
     */
    override fun toString(): String {
        return this.tree.toString()
    }

    /*
        Depth-first transversal algorithm
     */
    fun depthFirstTransversal(){
        //NOT IMPLEMENTED
    }

}