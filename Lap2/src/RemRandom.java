import java.util.Random;

/**
 * Created by Laheb on 16/02/2021.
 */
public class RemRandom {

    int[] a = {11,12,13,14,15,16,17};

    static void Remove(int[] ar) {
        Random r = new Random();
        while (ar.length > 0) {
            int index = (ar.length);
            System.out.println("Index = " + index + ", el = " + ar[index]);
            int[] ar1 = new int[ar.length - 1];
            for (int i = 0; i < index; i++)
                ar1[i] = ar[i];
            for (int i = index; i < ar.length - 1; i++)
                ar1[i] = ar[i + 1];
            ar = ar1;
            for (int i = 0; i <ar.length ; i++) {
                System.out.println(ar[i]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[] a = {11,12,13,14,15,16,17};
        Remove(a);


    }
}