class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = Stack<String>()
        for (token in tokens) {
            if (token == "*" || token == "/" || token == "+" || token == "-") {
                var op2 = stack.pop().toInt()
                var op1 = stack.pop().toInt()
                val result = when(token) {
                    "*" -> op1*op2
                    "/" -> op1/op2
                    "+" -> op1+op2
                    "-" -> op1-op2
                    else -> 0
                }
                stack.push(result.toString())
            } else {
                stack.push(token)
            }
        }
        return stack.peek().toInt()
    }
}
