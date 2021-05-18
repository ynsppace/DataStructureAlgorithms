package Tree

class Node<T>(value: T) {
    private val value = value

    override fun toString(): String {
        return this.value.toString()
    }
}