class Solution {
    fun solve(board: Array<CharArray>) {
        val set = HashSet<Pair<Int, Int>>()
        val m = board.size
        val n = board[0].size
        for (i in 0 until m) {
            if (board[i][0] == 'O') {
                dfs(board, i, 0, set)
            }
            if (board[i][n-1] == 'O') {
                dfs(board, i, n-1, set)
            }
        }

        for (j in 0 until n) {
            if (board[0][j] == 'O') {
                dfs(board, 0, j, set)
            }
            if (board[m-1][j] == 'O') {
                dfs(board, m-1, j, set)
            }
        }

        for (i in 0 until m) {
            for (j in 0 until n) {
                if(board[i][j] == 'O' && !set.contains(i to j)) {
                    board[i][j] = 'X'
                }
            }
        }
    }

    fun dfs(board: Array<CharArray>, i: Int, j: Int, set: HashSet<Pair<Int, Int>>) {
        if(i < 0 || j < 0 || i >= board.size || j >= board[0].size || board[i][j] == 'X' || board[i][j] == 'a') return
        set.add(i to j)
        val temp = board[i][j]
        board[i][j] = 'a'
        dfs(board, i+1, j, set)
        dfs(board, i-1, j, set)
        dfs(board, i, j+1, set)
        dfs(board, i, j-1, set)
        board[i][j] = temp
    }
}
