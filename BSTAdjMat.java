import java.util.Queue;
import java.util.LinkedList;
import java.util.*;

public class BSTAdjMat 
{
    private int[][] matrix;
    private int vertix;
    public BSTAdjMat(int vertix)
    {
        this.vertix=vertix;
        matrix=new int[vertix][vertix];
    }
    public void addbst(int src,int dest)
    {
        matrix[src][dest]=1;
        matrix[dest][src]=1;
    }
    public void Bst(int start)
    {
        boolean[] visited=new boolean[vertix];
        Queue<Integer> queue =new LinkedList<>();
        visited[start]=true;
        queue.add(start);
        while(!queue.isEmpty())
        {
            int node=queue.poll();
            System.out.println(node+" ");
        
        for(int i=0;i<vertix;i++)
        {
            if(matrix[node][i]==1 && !visited[i])
            {
                visited[i]=true;
                queue.add(i);
            }
        }
    }
    }
    public static void main(String[] args) 
    {
        BSTAdjMat obj=new BSTAdjMat(5);
        obj.addbst(1,2);
        obj.addbst(0,1);
        System.out.println("the graph");
        obj.Bst(1);
    }
}

