class Solution {
    fun islandsAndTreasure(grid: Array<IntArray>) {
        val m = grid.size
        val n = grid[0].size
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] == 0) {
                    bfs(grid, i, j)
                }
            }
        }
    }

    fun bfs(grid: Array<IntArray>, i: Int, j: Int) {
        val queue: Queue<Pair<Int,Int>> = LinkedList()
        val visited = Array(grid.size) { BooleanArray(grid[0].size) }
        queue.offer(i to j)
        var level = 0
        while(queue.isNotEmpty()) {
            val size = queue.size
            for (k in 0 until size) {
                val (a, b) = queue.poll()
                if (grid[a][b] != 0) {
                    grid[a][b] = minOf(grid[a][b], level)
                }
                if (a+1 < grid.size && !visited[a+1][b] && grid[a+1][b] != -1) {
                    queue.offer(a+1 to b)
                    visited[a+1][b] = true
                }
                if (a-1 >= 0 && !visited[a-1][b] && grid[a-1][b] != -1) {
                    queue.offer(a-1 to b)
                    visited[a-1][b] = true
                }
                if (b+1 < grid[0].size && !visited[a][b+1] && grid[a][b+1] != -1) {
                    queue.offer(a to b+1)
                    visited[a][b+1] = true
                }
                if (b-1 >= 0 && !visited[a][b-1] && grid[a][b-1] != -1) {
                    queue.offer(a to b-1)
                    visited[a][b-1] = true
                }
            }
            level++
        }
    }
}
