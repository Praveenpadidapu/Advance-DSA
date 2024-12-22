import java.util.*;
public class Bubble
{
    public static void Bubblesort()
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
        int i,j,temp;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array is ");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) {
       
        Bubblesort();
    }
}
