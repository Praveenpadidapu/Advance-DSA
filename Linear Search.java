import java.util.*;
public class Linear
{
    public static void Linearsearch()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            System.out.println("the array elements is:"+arr[i]);
        }
        System.out.println("enter key");
        int key=sc.nextInt();
        int pos=-1;
        for( int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
               pos=i+1;
               System.out.println("key is found at position"+pos);
               break;
                
            }
           if(pos<0)
           {
            System.out.println("not found");
           
           }
          
        }
    }
     public static void main(String args[])
        {
            Linearsearch();
        }


}
