public class Maximumheap 
{
    int[] arr;
    int maxheap;
    int heapsize;
    Maximumheap(int max)
    {
        maxheap=max;
        heapsize=0;
        arr=new int[max];
    }
    int parent(int i)
    {
        return (i-1)/2;
    }
    int leftchild(int i)
    {
        return (2*i+1);
    }
    int rightchild(int i)
    {
        return (2*i+2);
    }
    void insert(int d)
    {
        if(heapsize==maxheap)
        {
            System.out.println("out of box");
        }
        int i=heapsize;
        arr[i]=d;
        heapsize++;
        while(i!=0 && arr[parent(i)]<arr[i])
        {
            int temp=arr[i];
            arr[i]=arr[parent(i)];
            arr[parent(i)]=temp;
            i=parent(i);
        }

    }
    void remove()
    {
        if(heapsize==0)
        {
            System.out.println("empty");
        }
        if(heapsize==1)
        {
            heapsize--;
        }
        else
        {
            arr[0]=arr[heapsize-1];
            heapsize--;
            Mapify(0);
        }
    }
    void Mapify(int i)
    {
        int l=leftchild(i);
        int r=rightchild(i);
        int large=i;
        if(l<heapsize && arr[l]>arr[i])
        {
            large=l;
        }
        if(l<heapsize && arr[r]>arr[i])
        {
            large=r;
        }
        if(large!=i)
        {
            int temp=arr[i];
            arr[i]=arr[large];
            arr[large]=temp;
            Mapify(large);
        }
    }
    int getMax()
    {
        return arr[0];
    }
    int currentsize()
    {
        return heapsize;
    }
    public static void main(String[] args)
    {
        Maxheap mh=new Maxheap(20);
        int elements[]={3,254,65,43,67,78,12,5};
        for(int i:elements)
        {
            mh.insert(i);
        }
        System.out.println("current max :"+mh.getMax());
        System.out.println("current size :"+mh.currentsize());
        mh.insert(6);
        System.out.println("current size :"+mh.currentsize());
    }
}
