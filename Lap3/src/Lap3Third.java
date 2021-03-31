/**
 * Created by Laheb on 28/02/2021.
 */
public class Lap3Third {

    private int Entrynum = 0 ;
    private int lastRemoved = -1;
    private int [] board = new int[10];


    public void remove(int index) throws IndexOutOfBoundsException{
        if (index >= Entrynum || index < 0){
            throw new IndexOutOfBoundsException("wriong index: " + index);
        }
        board[index] = 0;
        lastRemoved = index;
    }

    public void add(int elem){
        if (lastRemoved == -1){
            board[Entrynum++] = elem;  

        }else {
            board[lastRemoved] = elem; 
            lastRemoved = -1;
        }
    }


    public static void main(String[] args) {
        ScoreBoard secorbord = new ScoreBoard();
        secorbord.add(2);
        secorbord.add(9);

        System.out.println(Arrays.toString(secorbord.board));
        secorbord.remove(2);
        System.out.println(Arrays.toString(secorbord.board));
        secorbord.add(9);
    }
}
