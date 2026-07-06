class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        val m = grid.size
        val n = grid[0].size
        var count = 0
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] == '1') {
                    count++
                    bfs(grid, i, j)
                }
            }
        }
        return count
    }

    fun bfs(grid: Array<CharArray>, i: Int, j: Int) {
        val queue: Queue<Pair<Int, Int>> = LinkedList<Pair<Int, Int>>()
        queue.offer(i to j)
        while (queue.isNotEmpty()) {
            val (k, l) = queue.poll()
            grid[k][l] = '0'
            if (k-1 >= 0 && grid[k-1][l] == '1') {
                queue.add(k-1 to l)
            }
            if (k+1 < grid.size && grid[k+1][l] == '1') {
                queue.add(k+1 to l)
            }
            if (l-1 >= 0 && grid[k][l-1] == '1') {
                queue.add(k to l-1)
            }
            if (l+1 < grid[0].size && grid[k][l+1] == '1') {
                queue.add(k to l+1)
            }
        }
    }
}
