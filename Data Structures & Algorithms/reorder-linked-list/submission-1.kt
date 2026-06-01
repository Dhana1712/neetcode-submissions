/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?): Unit {
        var slow = head
        var fast = head
        while(fast?.next != null && fast.next?.next != null) {
            slow = slow?.next
            fast = fast?.next?.next
        }
        var secondHalf = reverse(slow?.next)
        slow?.next = null
        var firstHalf = head
        while(secondHalf != null) {
            var temp = firstHalf?.next
            firstHalf?.next = secondHalf
            secondHalf = secondHalf?.next
            firstHalf?.next?.next = temp
            firstHalf = temp

        }
    }

    fun reverse(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var curr = head
        while (curr != null) {
            val next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }
        return prev
    }
}
