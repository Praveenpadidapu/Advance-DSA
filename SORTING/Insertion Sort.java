import java.util.*;
public class Insertion
{
    public static void insertionsort()
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
        // logic 
        for (int j = 1; j < n; j++)
         {  
            int key = arr[j];  
            int i = j-1;  
            while ( (i > -1) && ( arr [i] > key ) )
            {  
                arr [i+1] = arr [i];  
                i--;  
            }  
            arr[i+1] = key;  
        }  

        System.out.println("sortded array");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[])
    {
        insertionsort();
    }
}
