import java.util.*;
public class Mergesort
{
    int[] b;
    public static void mergesort(int[] a,int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            mergesort(a,low,mid);
            mergesort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
    public static void  merge(int[] a,int low,int mid,int high)
    {
        int i=low;
        int j=mid+1;
        int k=low;
        int b[] = new int[a.length];
        while(i<=mid && j<=high)
        {
        if(a[i]<a[j])
            {
                b[k++]=a[i++];

            }
        else
            {
                b[k++]=a[j++];
            }   
        
        }
        while(i<=mid)
        {
            b[k++]=a[i++];
        }
        while(j<=high)
        {
            b[k++]=a[j++];
        }
        for( int h=low;h<=high;h++)
        {
            a[h]=b[h];
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        mergesort(array,0,array.length-1);
        System.out.println("sorted array");
        for(int i:array)
        {
            System.out.println(i);
        }
    }
}
