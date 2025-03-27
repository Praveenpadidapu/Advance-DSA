import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BSTAdjList 
{
    private int vertex;
    public List<Integer>[] adj;
    @SuppressWarnings("unchecked")
    BSTAdjList(int vertex)
    {
        this.vertex=vertex;
        adj = (ArrayList<Integer>[]) new ArrayList[vertex];
        for(int i=0;i<vertex;i++)
        {
            adj[i]=new ArrayList<>();
        }
    }
    public void addadj(int u,int v)
    {
        if (u >= 0 && u < vertex && v >= 0 && v < vertex)
        {
        adj[u].add(v);
        adj[v].add(u);
        }
    }
    public void Bst(int start)
    {
        boolean[] visited =new boolean[vertex];
        Queue<Integer> queue=new LinkedList<>();
        visited[start]=true;
        queue.add(start);
        while(!queue.isEmpty())
        {
            int node=queue.poll();
            System.out.print(node+" ");
            for(int num:adj[node])
            {
                if(!visited[num])
                {
                    visited[num]=true;
                    queue.add(num);
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        BSTAdjList obj=new BSTAdjList(10);
        obj.addadj(0, 1);
        obj.addadj(1,2);
        obj.addadj(2,3);
        System.out.println("the adjacent ");
        obj.Bst(0);
    }

}
