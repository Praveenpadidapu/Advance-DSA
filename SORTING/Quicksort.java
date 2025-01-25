import java.util.*;
public class Quicksort {
    public static int Partition(int[] a,int low,int high)
    {
        int pivot=a[low];
        int i=low+1;
        int j=high;
        while(i<j)
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
                Interchange(a,i,j);
            }
        }
        Interchange(a,low,j);
        return j;
    }
    public static void Interchange(int[] a,int i,int j)
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
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        quicksort(array,0,array.length-1);
        System.out.println("sorted array");
        for(int i:array)
        {
            System.out.println(i);
        }
    }
}
