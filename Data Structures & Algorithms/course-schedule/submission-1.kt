class Solution {

    class Node(val course: Int) {
        val edges = mutableListOf<Node>()
        var state = 0
    }

    private val map = mutableMapOf<Int, Node>()

    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        construct(numCourses, prerequisites)

        map.values.forEach {
            if(!dfs(it)) {
                return false
            }
        }
        return true
    }

    private fun dfs(node: Node): Boolean {
        if (node.state == 1) return false
        if (node.state == 2) return true
        node.state = 1
        node.edges.forEach {
            if(!dfs(it)) {
                return false
            }
        }
        node.state = 2
        return true
    }

    private fun construct(numCourses: Int, prerequisites: Array<IntArray>) {
        for (i in 0 until numCourses) {
            map[i] = Node(i)
        }
        
        prerequisites.forEach {
            map[it[1]]!!.edges.add(map[it[0]]!!)
        }
    }
}