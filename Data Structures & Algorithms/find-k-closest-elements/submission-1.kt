class Solution {
    fun findClosestElements(arr: IntArray, k: Int, x: Int): List<Int> {
        var sum = 0
        var l = 0
        var r = 0
        while (r < k) {
            sum += abs(x-arr[r])
            r++
        }

        var i = l
        var j = r
        var min = sum
        while (r < arr.size) {
            sum += abs(x-arr[r])
            sum -= abs(x-arr[l])
            r++
            l++
            if (sum < min) {
                min = sum
                i = l
                j = r
            }
        }

        val list = mutableListOf<Int>()
        for (k in i until j) {
            list.add(arr[k])
        }
        return list
    }
}
