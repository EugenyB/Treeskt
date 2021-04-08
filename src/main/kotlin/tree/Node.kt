package tree

data class Node<T : Comparable<T>?> (var key: T, var left: Node<T>? = null, var right: Node<T>? = null)
{
    val isLeaf: Boolean
        get() = left == null && right == null

}
