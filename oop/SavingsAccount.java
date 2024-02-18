public class SavingsAccount {
    int balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }


    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);
        
        //Check balance :
        System.out.println("Hello!");
        System.out.println("Your balance is: " + savings.balance);
        

        //Withdrawing :
        int afterWithdraw = savings.balance - 300;
        savings.balance = afterWithdraw;
        System.out.println("You just withdraw: " + 300); 

        //Check balance :
        System.out.println("Hello!");
        System.out.println("Your balance is: " + savings.balance);
        

        //Deposit :
        int afterDeposit = savings.balance + 600;
        savings.balance = afterDeposit;
        System.out.println("You just deposit: " + 600); 

        //Check balance :
        System.out.println("Hello!");
        System.out.println("Your balance is: " + savings.balance);
        
    }
}
