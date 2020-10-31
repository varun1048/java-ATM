package atm;
import java.util.Scanner;

public class IO{
    public Scanner input = new Scanner(System.in).useDelimiter("\n");;

    void out(String str){
        System.out.print(str);
    }
    void out(int in){
        System.out.print(in);
    }
    void out(boolean in){
        System.out.print(in);
    }

    int in(int in){
            in = input.nextInt();
        return in;
    }
    String in(String in){
            in = input.next();
        return in;
    }
}
