import tree.Tree

fun main() {
    val tree = Tree<Int>()
    tree.add(5)
    tree.add(8)
    tree.add(2)
    tree.add(3)
    tree.add(9)
    tree.add(6)
    tree.add(11)
    tree.add(1)

    tree.traverse()

    println(tree.contains(3))
    println(tree.contains(4))

    tree.removeElement(6)
    tree.traverse()
}