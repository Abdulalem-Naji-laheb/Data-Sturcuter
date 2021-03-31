/**
 * Created by Laheb on 16/02/2021.
 */
public class CloneArray {

    
        static int [] array= {10,56,89,6,4,2,45};
    
        static int [] array1 = new int[array.length];

    static public void Print()
    {
        System.out.print("[ ");
        for (int i = 0; i <array1.length ; i++) {

            if(i==array1.length-1)
                System.out.print(array1[i]+" ]");
            else
                System.out.print(array1[i]+"  ,  ");
        }
    }


    static public void Clone()
        {
            for (int i = 0; i <array.length ; i++) {
                array1[i]=array[i];
            }
        }


        public static void main(String[] args) {
            
            System.out.println("The Array Before : ");
            Print();
            System.out.println("\n");
            
            System.out.println("After Clone  : ");
            Clone();
            Print();
        }
    }

