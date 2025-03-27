public class DFSAdjMat 
{
    private int vertex;
    private int[][] mat;
    DFSAdjMat(int vertex)
    {
        this.vertex=vertex;
        mat=new int[vertex][vertex];
    }
    public void addadj(int u,int v)
    {
        mat[u][v]=1;
        mat[v][u]=1;
    }
    public void dfsutil(int node,boolean[] visited)
    {
        
        visited[node]=true;
        System.out.println(node+" ");
        for(int i=0;i<vertex;i++)
        {
            if(mat[node][i]==1 && !visited[i])
            {
                dfsutil(i,visited);
            }
        }

    }
    public void dfs(int start)
    {
        boolean[] visited=new boolean[vertex];
        dfsutil(start,visited);
    }
    public static void main(String[] args)
    {
        DFSAdjMat obj=new DFSAdjMat(10);
        obj.addadj(0,1);
        obj.addadj(1,2);
        obj.addadj(2,3);
        System.out.println("dfs adj matrix");
        obj.dfs(0);
    }
}


