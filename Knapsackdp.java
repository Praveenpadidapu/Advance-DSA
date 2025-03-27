import java.util.*;
public class Knapsackdp 
{
    public static int knapsack(int[] weight,int[] profit,int m)
    {
        int n=weight.length;
        int[] dp=new int[m+1];
        for(int i=0;i<n;i++)
        {
            for(int w=m;w>=weight[i];w--)
            {
                dp[w]=Math.max(dp[w],profit[i]+dp[w-weight[i]]);
            }
        }
        return dp[m];
    }
    public static void main(String[] args)
    {
        int[] weight={10,20,30};
        int[] profit={60,100,120};
        int m=50;
        Knapsackdp obj=new Knapsackdp();
        System.out.print(obj.knapsack(weight,profit,m));
    }
}
