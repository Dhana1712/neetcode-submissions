class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for (ch in s) {
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch)
            } else {
                if (stack.isNotEmpty()) {
                    val peek = stack.peek()
                    if ((peek == '{' && ch == '}') || (peek == '(' && ch == ')') || (peek == '[' && ch == ']')) {
                        stack.pop()
                    } else {
                        return false
                    }
                } else {
                    return false
                }
            }
        }
        return stack.isEmpty()
    }
}
