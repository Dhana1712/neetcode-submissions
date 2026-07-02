class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val ans = IntArray(2*nums.size)
        for (i in nums.indices) {
            ans[i] = nums[i]
            ans[i + nums.size] = nums[i]
        }
        return ans
    }
}
