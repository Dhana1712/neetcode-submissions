class Solution {
    fun orangesRotting(grid: Array<IntArray>): Int {
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        val m = grid.size
        val n = grid[0].size
        var fresh = 0
        for (i in 0 until m) {
            for ( j in 0 until n) {
                if (grid[i][j] == 1) {
                    fresh++
                }
                if (grid[i][j] == 2) {
                    queue.offer(i to j)
                }
            }
        }
        val dirs = arrayOf( intArrayOf(-1, 0), intArrayOf(0, -1), intArrayOf(1, 0), intArrayOf(0, 1) )

        var level = 0
        while(queue.isNotEmpty()) {
            val size = queue.size
            for(k in 0 until size) {
                val (i,j) = queue.poll()
                for (dir in dirs) {
                    val r = i+dir[0]
                    val c = j+dir[1]
                    if (r in 0 until m && c in 0 until n && grid[r][c] == 1) {
                        grid[r][c] = 2
                        queue.add(r to c)
                        fresh--
                    }
                }
            }
            if (queue.isNotEmpty()) {
                level++
            }
        }
        return if (fresh == 0) level else -1
    }
}
