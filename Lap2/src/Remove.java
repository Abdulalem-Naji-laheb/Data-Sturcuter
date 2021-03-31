import java.util.Scanner;

/**
 * Created by Laheb on 16/02/2021.
 */
public class Remove {
    static int []a={1,2,3,5,8,4,84,5};
    static int [] arr2 = new int[a.length-1] ;
    static public void Removear(int x)
    {

        int y ;
        for (int i = 0 , k=0 ; i <a.length ; i++) {
            if(a[i]==x)
            {
                continue;
            }

            arr2[k++]=a[i];
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
        Scanner in = new Scanner(System.in);
        System.out.println(" Before Remove : ");
        Print();
        System.out.println("Enter the Element to remove : ");
        int x = in.nextInt();
        Removear(x);
        System.out.println(" after Remove : ");
        Print();
    }
}
