class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        nums.sort()
        val n = nums.size
        for(i in 0..n-3) {
            var j = i+1
            var k = n-1
            if(i > 0 && nums[i] == nums[i-1]){
                continue
            }
            while(j < k) {
                val sum = nums[i] + nums[j] + nums[k]
                if (sum == 0) {
                    result.add(listOf(nums[i], nums[j], nums[k]))
                    j++
                    k--
                    while(j< k && nums[j] == nums[j-1]) {
                        j++
                    }
                    while(j< k && nums[k] == nums[k+1]) {
                        k--
                    }
                } else if (sum < 0){
                    j++
                } else {
                    k--
                }
            }
        }
        return result
    }
}
