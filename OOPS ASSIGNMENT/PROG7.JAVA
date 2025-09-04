package JAVA_PROGRAM;

public class prog7 {
    static class Bankaccount {
        String accountholder;
        double accountnumber;
        int balance;

        Bankaccount(String accountholder,int accountnumber,int balance){
            this.accountholder=accountholder;
            this.accountnumber=accountnumber;
            this.balance=balance;
        }
        void deposit(int money){
            System.out.println(money +"Rs. is added to your account so,the total balance is "+(balance+=money));
        }
        void withdraw(int money){
            if(balance>money){
            System.out.println(money +"Rs. is withdrawn from your account now,your total balance is "+(balance-=money));
            }
            else{
                System.out.println("insufficient balance");
            }
        }
    
        
    }
    public static void main(String[] args) {
        Bankaccount b1 = new Bankaccount("hemant", 230045321, 100);
        // b1.deposit(5000);
        // b1.withdraw(300);
        // b1.withdraw(400);
        b1.withdraw(6000);
    }
    
}
