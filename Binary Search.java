import java.util.*;
public class Binary
{
    public static void Binarysearch()
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
        int start=arr[0];
        int end=arr[n-1];
        int middle=(start+end)/2;
        boolean found=false;
        for(int i=0;i<n;i++)
        {
            if(middle==key)
            {  
                found=true;
                System.out.println("key is found ");
                break;
                
            }
            else if(key<middle)
            {
                end=middle-1;
            }
            else if(key>middle)
            {
                start=middle+1;
            }
            
        }
        if(!found)
        {
         System.out.println("not found");
        }

    }
    public static void main(String[] args) {
        Binarysearch();
    }
}
