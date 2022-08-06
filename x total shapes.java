static int[][] dir=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    public int xShape(char[][] grid)
    {
        // code here
        int res=0,m=grid.length,n=grid[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='X'){
                    res++;
                    dfs(grid,i,j,m,n);
                }
            }
        }
        return res;
    }
    private static void dfs(char[][] grid,int r,int c,int m,int n){
        if(r<0 || r==m || c<0 || c==n || grid[r][c]=='O')
            return;
        grid[r][c]='O';
        for(int i=0;i<4;i++)
            dfs(grid,r+dir[i][0],c+dir[i][1],m,n);
    }