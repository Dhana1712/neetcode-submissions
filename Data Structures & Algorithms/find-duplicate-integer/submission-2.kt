class Solution {
    fun findDuplicate(nums: IntArray): Int {
        var i = 0
        var j = 0
        var n = nums.size
        while(true) {
            if (nums[i%n] == nums[j%n] && i%n != j%n) {
                return nums[j]
            }
            i++
            j = nums[j]
        }
        return 0
    }
}
