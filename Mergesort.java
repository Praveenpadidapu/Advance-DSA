import java.util.*;
public class Mergesort
{
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
    public static void merge(int[] a,int low,int mid,int high)
    {
        int i=low;
        int j=mid+1;
        int k=low;
        int[] b=new int[a.length];
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
        for(int f=low;f<=high;f++)
        {
            a[f]=b[f];
        }
    }
    public static void main(String[] args)
    {
        Mergesort obj=new Mergesort();
        int[] c={1,4,2,78,43,678,322,0,78};
        mergesort(c,0,c.length-1);
        System.out.println("sorted array");
        for(int i:c)
        {
            System.out.println(i);
        }
        

    }
}