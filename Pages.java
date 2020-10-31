package atm;

import atm.Info;
import atm.IO;
import atm.Tools;

public class Pages {
    public IO io =  new IO();
    public Tools tool = new Tools();

    
    int MainPage(){

        tool.clrscr();
        int inner=0;
        io.out("Number 1 for Sing in.\n");
        io.out("Numebr 2 for Sing up.\n");
        inner=io.in(inner);

        return inner;
    }
    void AP_checking(){
        int acc,pin,amount;
        acc=pin=amount=0;
        io.out("Enter your account number\t:");
        acc = io.in(acc);
        io.out("Enter your pin number\t\t:");
        pin = io.in(acc);
        io.out(acc);
    }

}