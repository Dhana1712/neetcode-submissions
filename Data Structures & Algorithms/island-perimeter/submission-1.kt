class Solution {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        for(i in 0 until grid.size) {
            for(j in 0 until grid[0].size) {
                if (grid[i][j] == 1) {
                    return dfs(i, j, grid)
                }
            }
        }
        return 0
    }

    fun dfs(i: Int, j: Int, grid: Array<IntArray>): Int {
        if(i < 0 || j < 0 || i >= grid.size || j >= grid[0].size || grid[i][j] == 0) {
            return 1
        }

        if (grid[i][j] == -1) return 0

        grid[i][j] = -1
        return dfs(i, j+1, grid) + dfs(i, j-1, grid) + dfs(i+1, j, grid) + dfs(i-1, j, grid)
    }
}
