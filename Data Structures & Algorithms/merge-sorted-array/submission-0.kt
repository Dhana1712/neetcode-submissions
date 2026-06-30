class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var n1 = m
        var n2 = n
        var l = m+n-1
        while(n1 > 0 && n2 > 0) {
            if (nums1[n1-1] >= nums2[n2-1]) {
                nums1[l] = nums1[n1-1]
                n1--
            } else {
                nums1[l] = nums2[n2-1]
                n2--
            }
            l--
        }

        while(n2 > 0) {
            nums1[l] = nums2[n2-1]
            n2--
            l--
        }
    }
}
