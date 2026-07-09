class Solution {

    class Node(val course: Int) {
        val edges = mutableListOf<Node>()
        var state = 0
    }

    val map = mutableMapOf<Int, Node>()
    var index = 0
    fun findOrder(numCourses: Int, prerequisites: Array<IntArray>): IntArray {
        construct(numCourses, prerequisites)
        index = numCourses - 1
        val array = IntArray(numCourses)
        map.values.forEach {
            if(!dfs(it, array)) {
                return IntArray(0)
            }
        }
        return array
    }

    fun dfs(node: Node, array: IntArray): Boolean {
        if (node.state == 1) return false
        if (node.state == 2) return true

        node.state = 1
        node.edges.forEach {
            if(!dfs(it, array)) {
                return false
            }
        }
        node.state = 2
        array[index--] = node.course
        return true
    }

    fun construct(numCourses: Int, prerequisites: Array<IntArray>) {
        for (i in 0 until numCourses) {
            map[i] = Node(i)
        }

        prerequisites.forEach {
            map[it[1]]!!.edges.add(map[it[0]]!!)
        }
    }
}
