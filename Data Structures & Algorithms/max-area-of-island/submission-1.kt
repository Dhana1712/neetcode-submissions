class Solution {
    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        var maxArea = 0
        for (i in 0 until m) {
            for (j in 0 until n) {
                if(grid[i][j] == 1) {
                    maxArea = maxOf(maxArea, dfs(grid, i, j))
                }
            }
        }
        return maxArea
    }

    fun dfs(grid: Array<IntArray>, i: Int, j: Int): Int {
        if(i < 0 || i >= grid.size || j < 0 || j >=grid[0].size || grid[i][j] == 0) return 0

        grid[i][j] = 0

        val area = dfs(grid, i+1, j) +
        dfs(grid, i-1, j) +
        dfs(grid, i, j-1) +
        dfs(grid, i, j+1)
        return area + 1
    }
}
