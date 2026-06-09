class Solution {
    fun calPoints(operations: Array<String>): Int {
        val stack = Stack<Int>()
        var sum = 0
        for (operation in operations) {
            when(operation) {
                "+" -> {
                    val num = stack.pop()
                    val add = num + stack.peek()
                    stack.push(num)
                    stack.push(add)
                    sum += add
                }
                "D" -> {
                    val double = 2*stack.peek()
                    stack.push(double)
                    sum+=double
                }
                "C" -> {
                    sum -= stack.pop()
                }
                else -> {
                    stack.push(operation.toInt())
                    sum += stack.peek()
                }

            }
        }
        return sum
    }
}
