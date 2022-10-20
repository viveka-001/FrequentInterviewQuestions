class Main {
    static void Mark_Visited_Island(char mat[][],int x,int y)
    {
        //checking for boundary conditions
        if(x<0||y<0||x>=mat.length||y>=mat[0].length||mat[x][y]!='1')return;
        mat[x][y]='2';
        Mark_Visited_Island( mat, x+1, y);
        Mark_Visited_Island( mat, x-1, y );
        Mark_Visited_Island( mat, x, y+1);
        Mark_Visited_Island( mat, x, y-1);
        
    }
    public int numIslands(char[][] grid) {
      if(grid.length==0)return 0;
        int row=grid.length;
        int col=grid[0].length;
        int No_Of_Island=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    Mark_Visited_Island(grid,i,j);
                    No_Of_Island+=1;
                    
                }
            }
        }
        return No_Of_Island;
    }
}
