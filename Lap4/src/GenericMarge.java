import java.util.Arrays;

/**
 * Created by Laheb on 15/02/2021.
 */
public class GenericMarge {
    
        public static void main(String[] args) {

            String[] first = {"A","B","C","E","D"};
            String[] second = {"a","b","c","d","e"};
            merge(first, second);
        }
        public static <E> void merge(E[] first, E[] second) {
            int Fsize = first.length;
            int Ssize = second.length;
            int newarrSize = Fsize + Ssize;
            E[] marge = (E[]) new Object[newarrSize];
            int counter = 0;
            for (int i = 0; i < newarrSize; i++) {
                if (i < Fsize) {
                    marge[i] = first[i];
                } else {
                    marge[i] = second[counter];
                    counter++;
                } }
            System.out.println(Arrays.toString(marge)); }
}

