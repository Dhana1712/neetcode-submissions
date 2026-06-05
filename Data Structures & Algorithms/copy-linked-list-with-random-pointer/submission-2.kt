/*
// Definition for a Node.
class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
}
*/

class Solution {
    fun copyRandomList(head: Node?): Node? {
        val dummy = Node(0)
        val map = HashMap<Node,Node>()
        var copy = dummy
        var original = head
        while(original != null) {
            copy.next = getCopyNode(original, map)
            copy = copy.next!!
            if (original.random != null) {
                copy.random = getCopyNode(original.random!!, map)
            }
            original = original.next
        }
        return dummy.next
    }

    fun getCopyNode(node: Node, map: HashMap<Node,Node>): Node {
        if (map[node] != null) {
            return map[node]!!
        } else {
            val copyNode = Node(node.`val`)
            map[node] = copyNode
            return copyNode
        }
    }
}
