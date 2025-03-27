import java.util.*;
import java.util.LinkedList;
public class DFSAdjList 
{
    private int vertex;
    private LinkedList<Integer>[] adj;
    DFSAdjList(int vertex)
    {
        this.vertex=vertex;
        adj=new LinkedList[vertex];
        for(int i=0;i<vertex;i++)
        {
            adj[i]=new LinkedList<>();
        }
    }
    public void addadj(int u,int v)
    {
        adj[u].add(v);
        adj[v].add(u);
    }
    public void dfsutil(int node,boolean[] visited)
    {
        visited[node]=true;
        System.out.println(node+" ");
        for(int num:adj[node])
        {
            if(!visited[num])
            {
                dfsutil(num,visited);
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
        DFSAdjList obj=new DFSAdjList(10);
        obj.addadj(0,1);
        obj.addadj(1,2);
        obj.addadj(2,3);  
        System.out.println("dfs adjacent list");
        obj.dfs(0);  
    }
}
