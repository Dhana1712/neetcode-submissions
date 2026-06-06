class KthLargest(val k: Int, nums: IntArray) {

    val queue = PriorityQueue<Int>()
    init {
        for (num in nums) {
            addToQueue(num)
        }
    }

    fun add(num: Int): Int {
        addToQueue(num)
        return queue.peek()
    }

    fun addToQueue(num: Int) {
        queue.add(num)
        if(queue.size > k) {
            queue.poll()
        }
    }
}
