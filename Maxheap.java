class Maxheap
{
    int [] arr;
    int maxheap;
    int heapsize;
    Maxheap(int max)
    {
        maxheap=max;
        heapsize=0;
        arr=new int[maxheap];
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
    void insert(int x)
    {
        if(heapsize==maxheap)
        {
            System.out.println("out of size");
        }
        int i=heapsize;
        arr[i]=x;
        heapsize++;
        while(i!=0 && arr[parent(i)]<arr[i])
        {
            int temp=arr[i];
            arr[i]=arr[parent(i)];
            arr[parent(i)]=temp;
            i=parent(i);
        }
    }
    void removeMax()
    {
        if(heapsize<=0)
        {
            System.out.println("not possible");
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
        int largest=i;
        if(l<heapsize && arr[l]>arr[i])
        {
            largest=l;
        }
        if(r<heapsize && arr[r]>arr[i])
        {
            largest=r;
        }
        if(largest!=i)
        {
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            Mapify(largest);
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
    public static void main(String args[])
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