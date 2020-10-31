package atm;
import java.util.*;

import atm.*;


public class Process extends Info{
    public IO io =  new IO();
    public Pages Page =  new Pages();
    public Tools tool = new Tools();
    public  static int Users=2;   

    Info data = new Info();

    Process(){
    }
    // void CreateUser(int AccountNumber,int PinNumber,int MainBalance ){
    //     Users=Users+1;
    //     obj[Users]=new Info(AccountNumber,PinNumber,MainBalance);
    // } 

    void fiend(int acc,int pin){
        boolean bo = true;      
            load();

    // return bo;
    }
    String name(){

        return "varun";
    }
    

    public static void main(String args[]){
        new Process().fiend(2,22);
    }

}