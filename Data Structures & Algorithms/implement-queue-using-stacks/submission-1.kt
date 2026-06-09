class MyQueue() {

    class Node(val value: Int) {
        var next: Node? = null
        var prev: Node? = null
    }

    var size = 0

    var bottom: Node? = null

    var top: Node? = null

    fun push(x: Int) {
        val node = Node(x)
        if (top == null) {
            top = node
            bottom = top
        } else {
            node?.prev = top
            top?.next = node
            top = top?.next
        }
        size++
    }

    fun pop(): Int {
        val temp = bottom ?: throw NoSuchElementException()

        if (bottom == top) {
            bottom = null
            top = null
        } else {
            bottom = bottom?.next
            bottom?.prev = null
        }

        size--
        return temp!!.value
    }

    fun peek(): Int {
        return bottom!!.value
    }

    fun empty(): Boolean {
        return size == 0
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * val obj = MyQueue()
 * obj.push(x)
 * val param_2 = obj.pop()
 * val param_3 = obj.peek()
 * val param_4 = obj.empty()
 */
