class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val complementMap = HashMap<Int, Int>()
        for (i in 0..nums.size) {
            val complement = target - nums[i]
            if(complementMap[complement] != null) {
                return intArrayOf(complementMap[complement]!!, i)
            }
            complementMap[nums[i]] = i
        }
        return intArrayOf()
    }
}
