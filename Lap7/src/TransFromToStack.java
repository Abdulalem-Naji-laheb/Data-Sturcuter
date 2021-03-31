/**
 * Created by Laheb on 23/03/2021.
 */
public class TransFromToStack<s> {
    public void Transfer(ArraySatck<s> f , ArraySatck<s> s)
    {
        int x =f.Size();

        for (int i = 1; i <=x ; i++) {
            System.out.println("f = "+f.top());
            s.push(f.top());
            f.pop();
        }
        
        System.out.println("  ");
        int y =s.Size();
        for (int i = 1; i <=y ; i++) {
            System.out.println("s = "+s.top());
            s.pop();
        }
    }

    public static void main(String[] args) {
        ArraySatck<String> f = new ArraySatck<>();
        ArraySatck<String> s = new ArraySatck<>();
        f.push("ALI");
        f.push("khlad");
        f.push("laheb");
        f.push("salh");

        TransFromToStack t = new TransFromToStack();
        t.Transfer(f,s);
    }
}
