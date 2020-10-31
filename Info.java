package atm;

public class Info{
    public int PinNumber;
    public int AccountNumber;
    public boolean on = false;
    public String Name;

    public   Info[] obj = new Info[10];

        
        obj[0].PinNumber=1;
        obj[0].Name="varun";
        obj[0].AccountNumber=11;

        obj[1].PinNumber=2;
        obj[1].Name="saravan";
        obj[1].AccountNumber=22;

        obj[2].PinNumber=3;
        obj[2].Name="bala";
        obj[2].AccountNumber=33;

    // int MainBalance;
    // String BankName;
    // int PhoneNumber;

    // Info(int AccountNumber,int PinNumber,int MainBalance){ 
    //     this.AccountNumber = AccountNumber;
    //     this.PinNumber = PinNumber;
    //     this.MainBalance = MainBalance;
    // }

}