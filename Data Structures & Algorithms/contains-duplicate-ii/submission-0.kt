class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = HashMap<Int, Int>()
        for (i in 0 until nums.size) {
            if(map.contains(nums[i]) && abs(i-map[nums[i]]!!) <= k) {
                return true
            } else {
                map[nums[i]] = i
            }
        }
        return false
    }
}
