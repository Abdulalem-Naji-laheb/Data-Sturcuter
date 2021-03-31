/**
 * Created by Laheb on  2/16/2021.
 */
public class ReverisArray {



    //////////////////////////    First questuion
    static   int [] a={1,2,3,4,5};

    static public void revers()
    {
        int n= a.length-1;
        for(int i=0;i< a.length/2; i++)
        {
            int t;
            t=a[i];
            a[i]=a[n];
            a[n]=t;
            n--;
        }
    }

    static public void Print()
    {
        System.out.print("[ ");
        for (int i = 0; i <a.length ; i++) {
            if(i==a.length-1)
                System.out.print(a[i]+" ]");
            else
                System.out.print(a[i]+"  ,  ");
        }

    }
    public static void main(String[] args) {
        Print();

        revers();
        System.out.println("\n revers :");
        Print();
    }
}
