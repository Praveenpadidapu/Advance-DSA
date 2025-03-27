import java.util.Arrays;
import java.util.*;
class Items {
    int w;
    int p;
    double ratio;
     Items(int w,int p)
    {
        this.w=w;
        this.p=p;
        this.ratio=(double) p/w;
    }
}
public class Fractionalks
{
    public static double Maxprofit(Items[] items,int m)
    {
        Arrays.sort(items,(a,b)->Double.compare(b.ratio,a.ratio));
        double maxp=0.0;
        for(Items item:items)
        {
            if(item.w<=m)
            {
                maxp=item.p+maxp;
                System.out.println("item.w"+item.w+"item.p"+item.p);
                m=m-item.w;
            }
            else
            {
                double fraction=(double) m/item.w;
                maxp += item.p*fraction;
                System.out.println("item.w:"+item.w*fraction+"item.p:"+item.p*fraction+"taken"+fraction*100+"%");
                break;
            }
        }
        return maxp;
    }
    public static void main(String[] args) {
        Items[] items={
            new Items(3,2),
        new Items(8,1),
    new Items(10,2) };
    int m=3;
    double max=Maxprofit(items, m);
    System.out.println(max);
    }
}
