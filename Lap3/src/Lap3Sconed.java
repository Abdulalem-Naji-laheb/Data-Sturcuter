import java.util.Arrays;

/**
 * Created by Laheb on 27/02/2021.
 */
public class Lap3Sconed {
    public static void main(String[] args) {
        int [] arr={1,23,84,8,9,6,1,35,6,8,4};
        Arrays.sort(arr);
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//
//        }
        reapetedcount(arr);

    }
    public static void reapetedcount(int [] array){
      int  n=array.length;
        for (int i = 0; i < n; i++) {
            int c=1;
            for (int j = i+1; j <array.length-1 ; j++) {
                if (array[i]==array[i])
                    c++;
                else
                    break;

            if (c>1){
                System.out.println(array[i]+" the repeted "+c);
                i+=(c-1);}}
    }
            }
            }





