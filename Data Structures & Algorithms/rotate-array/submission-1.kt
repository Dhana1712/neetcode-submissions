class Solution {
    fun rotate(nums: IntArray, k: Int) {
        var k1 = k%nums.size
        var n = nums.size
        var j = k1
        while(k1 > 0) {
            var temp = nums[n-1]
            for (i in n-1 downTo 1) {
                nums[i] = nums[i-1]
            }
            nums[0] = temp
            k1--
        }
    }
}
