class Solution {
    fun islandsAndTreasure(grid: Array<IntArray>) {
        val m = grid.size
        val n = grid[0].size
        val queue: Queue<Pair<Int,Int>> = LinkedList()
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] == 0) {
                    queue.add(i to j)
                }
            }
        }
        bfs(grid, queue)
    }

    fun bfs(grid: Array<IntArray>, queue: Queue<Pair<Int,Int>>) {
        var level = 0
        while(queue.isNotEmpty()) {
            val size = queue.size
            for (k in 0 until size) {
                val (a, b) = queue.poll()
                if (grid[a][b] != 0) {
                    grid[a][b] = level
                }
                if (a+1 < grid.size && grid[a+1][b] == 2147483647) {
                    grid[a+1][b] = -2
                    queue.offer(a+1 to b)
                }
                if (a-1 >= 0 && grid[a-1][b] == 2147483647) {
                     grid[a-1][b] = -2
                    queue.offer(a-1 to b)
                }
                if (b+1 < grid[0].size && grid[a][b+1] == 2147483647) {
                    grid[a][b+1] = -2
                    queue.offer(a to b+1)
                }
                if (b-1 >= 0 && grid[a][b-1] == 2147483647) {
                    grid[a][b-1] = -2
                    queue.offer(a to b-1)
                }
            }
            level++
        }
    }
}
