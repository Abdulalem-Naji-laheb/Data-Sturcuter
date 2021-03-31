/**
 * Created by Laheb on 27/02/2021.
 */
public class Lap3first {
    public static void main(String[] args) {

        int [] array={1,1,2,35,84,9,9,6,4,4};
        Repated(array);

    }

    /*
     the for first Question in lap 3
     */
    public static void Repated(int []arr ){

        int size =arr.length;
        System.out.println("The repeated Elements :");
        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (arr[i] == arr[j])
                    System.out.print(arr[i] + " ");
            }
        }
    }

}
