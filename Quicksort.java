import java.util.*;
public class Quicksort
{
    public static int Partition(int[] a,int low,int high)
    {
        int pivot=a[low];
        int i=low+1;
        int j=high;
        if(i<j)
        {
            while(a[i]<=pivot && i<=j)
            {
                i++;
            }
            while(a[j]>=pivot && j>=i)
            {
                j--;
            }
            if(i<j)
            {
                swap(a,i,j);
            }
           

        }
        swap(a,low,j);
        return j;

    }
    public static void swap(int[] a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void quicksort(int[] a,int low,int high)
    {
        if(low<high)
        {
            int j=Partition(a,low,high);
            quicksort(a, low, j-1);
            quicksort(a, j+1, high);
        }
    }
    
    public static void main(String[] args)
    {
        int[] c={23,455,121,433,13,1};
        quicksort(c,0,c.length-1);
        System.out.println("sorted array");
        for(int i:c)
        {
            System.out.println(i);
        }
        

    }
}