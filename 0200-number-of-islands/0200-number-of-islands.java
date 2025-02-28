class Solution {
    public int numIslands(char[][] grid) {

        // int numIslands(char[][] grid) {
        // if (grid == null || grid.length == 0) return 0;
        // }
        int m = grid.length;
        int n = grid[0].length;

        boolean vis[][] = new boolean[m][n];
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         vis[i][j]=false;
        //     }
        // }
        int c=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    dfs(i, j,grid, vis, m, n);
                    c++;
                }
            }
        }
        return c;
        
    }

    void dfs(int i, int j,char[][] grid, boolean vis[][], int m, int n){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]=='0' || vis[i][j]){
            return;
        }
        vis[i][j] = true;
        dfs(i, j+1, grid,vis,m,n);
        dfs(i, j-1, grid,vis,m,n);
        dfs(i+1, j,grid,vis,m,n);
        dfs(i-1, j, grid,vis,m,n);
    }
}