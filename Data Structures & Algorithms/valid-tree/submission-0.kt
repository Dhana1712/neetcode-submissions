class Solution {

    class Node(val num: Int) {
        val edges = mutableSetOf<Node>()
    }

    val map = mutableMapOf<Int, Node>()
    val set = HashSet<Node>()
    var validTree = true

    fun validTree(n: Int, edges: Array<IntArray>): Boolean {
        construct(n, edges)
        dfs(map[0]!!)
        if (validTree == false ) {
            print("loop")
            return false
        } else if (set.size != n){
            print("dis")
           return false
        }
        return true
    }

    fun dfs(node: Node, root: Node? = null) {
        println()
        if(set.contains(node)) {
            print(node.num)
            validTree = false 
            return
        }
        set.add(node)
        node.edges.forEach {
            if(root != it) {
                print(it.num)
                dfs(it, node)
            }
        }
    }

    fun construct(n: Int, edges: Array<IntArray>) {
        for (i in 0 until n) {
            map[i] = Node(i)
        }

        edges.forEach {
            map[it[0]]!!.edges.add(map[it[1]]!!)
            map[it[1]]!!.edges.add(map[it[0]]!!)
        }
    }
}
