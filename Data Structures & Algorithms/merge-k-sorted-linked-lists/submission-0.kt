/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        val minHeap = PriorityQueue<ListNode>( compareBy { it.`val` } )
        lists.forEach { subList ->
            var curr = subList
            while(curr != null) {
                minHeap.add(curr)
                curr = curr!!.next
            }
        }
        val result = ListNode(0)
        var temp = result
        while (minHeap.isNotEmpty()) {
            temp.next = minHeap.poll()
            temp = temp.next!!
        }
        return result.next
    }
}
