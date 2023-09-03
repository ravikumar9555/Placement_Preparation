// class Solution {
//   public int uniquePaths(int m, int n) {
//     // dp[i][j] := unique paths from (0, 0) to (i, j)
//     int[][] dp = new int[m][n];
//     Arrays.stream(dp).forEach(A -> Arrays.fill(A, 1));

//     for (int i = 1; i < m; ++i)
//       for (int j = 1; j < n; ++j)
//         dp[i][j] = dp[i - 1][j] + dp[i][j - 1];

//     return dp[m - 1][n - 1];
//   }
// }
class Solution {
    int[][] t;

    public int solve(int m, int n, int i, int j) {
        if(i >= m || i < 0 || j >= n || j < 0)
            return 0;
           
        if(i == m-1 && j == n-1)
            return 1;
        
        if(t[i][j] != -1) 
            return t[i][j];
        
        return t[i][j] = solve(m, n, i+1, j) + solve(m, n, i, j+1);
    }

    public int uniquePaths(int m, int n) {
        t = new int[m][n];
        for (int[] row: t)
            Arrays.fill(row, -1);
        
        return solve(m, n, 0, 0);
    }

}