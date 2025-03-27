public class NQueens 
{
    private int vertex;
    private int[][] mat;
    NQueens(int vertex)
    {
        this.vertex=vertex;
        mat=new int[vertex][vertex];
    }
    public boolean issafe(int row,int col)
    {
        for(int i=0;i<row;i++)
        {
            if(mat[i][col]==1)
            {
                return false;
            }
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--)
        {
           
            
                if(mat[i][j]==1)
                {
                    return false;
                }
                    
        }
        for(int i=row, j=col;i>=0 && j<vertex;i--,j++)
        {
            
                if(mat[i][j]==1)
                {
                    return false;
                }
            
        }
        return true;
    }
    public boolean solveQueens(int row)
    {
        if(row>=vertex)
        {
            return true;
        }
        for(int col=0;col<vertex;col++)
        {
            if(issafe(row, col))
            {
                mat[row][col]=1;
                if(solveQueens(row+1)) 
                {
                    return true;
                }
                mat[row][col]=0;
            }
        }
        return false;


    }
    public void solve()
    {
        if(solveQueens(0))
        {
            printsol();
        }
        else
        {
            System.out.println("NO solutions");
        }
    }
    public void printsol()
    {
        for(int[] i:mat)
        {
            for(int j:i)
            {
                System.out.print(j==1?"Q ":"- ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        int vertex=4;
        NQueens obj=new NQueens(vertex);
        obj.solve();
    }
}
