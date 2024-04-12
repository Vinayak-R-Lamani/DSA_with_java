class bank
{
    bank(){
        System.out.println("all bank comes  under RBI");
    }
}

class canara extends bank{
    static String bank_name = "canara bank";
    int account;
    float balance;
    String acc_holder;
    canara(){
        super();
        System.out.println("the canar bank is also comes under the RBI");
    }


}
public class temp {

    public static void main(String[] args) {
        canara banks = new canara();
        banks.acc_holder = "abhishek";
        banks.balance = 10000;
        banks.account = 123456;

        canara[] list = new canara[1];
        for(int i = 0 ; i < list.length ; i++){
           System.out.println(list[i].acc_holder + " " + list[i].balance + " " + list[i].account+" "+canara.bank_name);
        }
    }
    
}