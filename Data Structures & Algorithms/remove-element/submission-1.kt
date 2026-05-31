class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var j = nums.size - 1
        var i = 0
        while(i <= j) {
            if (nums[j] == `val`) {
                j--
                continue
            } else if (nums[i] == `val`){
                nums[i] = nums[j]
                i++
                j--
                continue
            } else {
                i++
            }
        }
        return i
    }
}
