class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val result = IntArray(temperatures.size)
        val stack = Stack<Int>()
        for (i in temperatures.indices) {
            while(stack.isNotEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                var peek = stack.pop()
                result[peek] = i - peek
            }
            stack.add(i)
        }
        return result
    }
}
