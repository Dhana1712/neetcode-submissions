class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 0
        var j = 0
        while (j < nums.size) {
            nums[i] = nums[j]
            while(j < nums.size && nums[i] == nums[j]) {
                j++
            }
            i++
        }
        return i
    }
}
