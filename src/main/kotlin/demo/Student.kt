package demo


data class Student(val id:Int, var name:String, var rating:Double) : Comparable<Student> {
    override fun compareTo(other: Student): Int {
        return if (name == other.name) {
            id - other.id
        } else name.compareTo(other.name)
    }
}
