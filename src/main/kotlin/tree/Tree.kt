package tree

class Tree<T : Comparable<T>?> {

    var root: Node<T>? = null

    fun add(value: T): Boolean {
        if (root == null) {
            root = Node(value)
            return true
        }
        return addInSubTree(value, root)
    }

    private fun addInSubTree(value: T, root: Node<T>?): Boolean {
        if (value == root!!.key) {
            return false
        }
        return if (value!! < root.key) {
            if (root.left == null) {
                root.left = Node(value)
                true
            } else {
                addInSubTree(value, root.left)
            }
        } else {
            if (root.right == null) {
                root.right = Node(value)
                true
            } else {
                addInSubTree(value, root.right)
            }
        }
    }

    fun traverse() {
        traverse(root)
    }

    private fun traverse(root: Node<T>?) {
        if (root != null) {
            traverse(root.left)
            visit(root)
            traverse(root.right)
        }
    }

    private fun visit(node: Node<T>) {
        println(node.key)
    }

    private fun find(key: T): Node<T>? {
        return if (root == null) {
            null
        } else findInSubTree(key, root)
    }

    private fun findInSubTree(key: T, root: Node<T>?): Node<T>? {
        if (root == null || key == root.key) {
            return root
        }
        return if (key!! < root.key) {
            findInSubTree(key, root.left)
        } else {
            findInSubTree(key, root.right)
        }
    }

    operator fun contains(key: T): Boolean {
        return find(key) != null
    }
}
