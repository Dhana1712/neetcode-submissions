class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = HashMap<Int, Int>()
        for (num in nums) {
            if (map[num] == null) {
                map[num] = 1
            } else {
                map[num] = map[num]!! + 1
            }
            if (map[num]!! > nums.size/2) return num
        }
        return 0
    }
}
