/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val dummy: ListNode? = ListNode(0)
        dummy!!.next = head
        var slow = dummy
        var fast = head
        var count = 0
        while (count < n) {
            fast = fast?.next
            count++
        }
        while(fast != null) {
            fast = fast?.next
            slow = slow?.next
        }
        slow?.next = slow?.next?.next
        return dummy?.next
    }
}
