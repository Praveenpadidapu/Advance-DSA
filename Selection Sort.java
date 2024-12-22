import java.util.*;
public class Selection2
{
    public static void selection()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {    
            System.out.print(arr[i]+" ");
        }
        for( int i=0;i<n-1;i++)
        {
             int min_index=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[min_index]>arr[j])
                {
                    min_index=j;
                }
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
        System.out.println("sortded array");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[])
    {
        selection();
    }
}
