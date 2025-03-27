public class EditDistance 
{
    public static int mindis(String str1,String str2)
    {
        int n=str1.length();
        int m=str2.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0)
                {
                    dp[i][j]=j;
                }
                else if(j==0)
                {
                    dp[i][j]=i;
                }
                else if(str1.charAt(i-1)==str2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args)
    {
        String str1="kitten";
        String str2="kumar";
        int result=mindis(str1,str2);
        System.out.println(result);
    }

}
