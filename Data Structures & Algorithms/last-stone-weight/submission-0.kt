class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        val queue = PriorityQueue<Int>(compareByDescending { it })
        stones.forEach {
            queue.add(it)
        }
        while(queue.size>1){
            val diff = queue.poll() - queue.poll()
            if(diff != 0) {
                queue.add(diff)
            } 
        }
        return queue.peek() ?: 0
    }
}
