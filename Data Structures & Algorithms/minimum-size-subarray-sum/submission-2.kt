class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var sum = 0
        var result = Int.MAX_VALUE
        var l = 0
        var r = 0
        while(r < nums.size) {
            sum += nums[r]
            while(sum >= target) {
                result = minOf(result, r-l+1)
                sum -= nums[l]
                l++
            }
            r++
        }
        return if (result == Int.MAX_VALUE) 0 else result
    }
}
