class MyStack() {

    class Node(val value: Int) {
        var next: Node? = null
        var prev: Node? = null
    }

    var size = 0

    var top: Node? = null

    fun push(x: Int) {
        val node = Node(x)
        if (top == null) {
            top = node
        } else {
            node?.prev = top
            top?.next = node
            top = top?.next
        }
        size++
    }

    fun pop(): Int {
        val temp = top
        top = top?.prev
        top?.next = null
        temp?.prev = null
        size--
        return temp!!.value
    }

    fun top(): Int {
        return top!!.value
    }

    fun empty(): Boolean {
        return size == 0
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * val obj = MyStack()
 * obj.push(x)
 * val param_2 = obj.pop()
 * val param_3 = obj.top()
 * val param_4 = obj.empty()
 */
