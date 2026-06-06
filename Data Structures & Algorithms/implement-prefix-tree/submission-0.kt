class PrefixTree {

    class TrieNode {
        val child = HashMap<Char, TrieNode>()
        var isEnd = false
    }

    val prefixTree = TrieNode()

    fun insert(word: String) {
        var curr = prefixTree
        for(ch in word) {
            curr = curr.child.getOrPut(ch) { TrieNode() }
        }
        curr.isEnd = true
    }

    fun search(word: String): Boolean {
        var curr = prefixTree
        for(ch in word) {
            if(curr?.child[ch] == null) {
                return false
            }
            curr = curr.child[ch]!!
        }
        return curr.isEnd
    }

    fun startsWith(prefix: String): Boolean {
        var curr = prefixTree
        for(ch in prefix) {
            if(curr?.child[ch] == null) {
                return false
            }
            curr = curr.child[ch]!!
        }
        return true
    }
}
