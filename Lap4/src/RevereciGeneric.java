import java.util.Arrays;

/**
 * Created by Laheb on 15/02/2021.
 */
public class RevereciGeneric {
    
    public static <E> void   rever(E num[])

    {

        int n= num.length-1;
        for (int i = 0; i < num.length/2; i++) {
            E e;
            e= (E) num[i];
            num[i]=num[n];
            num[n]=e;
            n--; }

    }

    public static void main(String[] args) {


        Integer []num={11,22,33,44,55};
        rever(num);
        System.out.println(Arrays.toString(num)); }


}



