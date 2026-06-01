/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val resultNode: ListNode? = ListNode(0)
        var temp: ListNode? = resultNode
        var list1tmp = list1
        var list2tmp = list2
        while(list1tmp != null || list2tmp != null) {
            if (list1tmp != null && list2tmp != null) {
                if(list1tmp.`val` < list2tmp.`val`) {
                    temp!!.next = list1tmp
                    temp = temp.next
                    list1tmp = list1tmp?.next
                } else {
                    temp!!.next = list2tmp
                    temp = temp.next
                    list2tmp = list2tmp?.next
                }

            } else if (list1tmp != null) {
                temp!!.next = list1tmp
                temp = temp.next
                list1tmp = list1tmp?.next
            } else {
                temp!!.next = list2tmp
                temp = temp.next
                list2tmp = list2tmp?.next
            }
        }
        return resultNode?.next
    }
}
