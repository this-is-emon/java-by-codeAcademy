public class SavingsAccount {
    int balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    //blance checking method :
    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is: " + balance);
    }

    //withdraw method : 
    public void withdraw(){
        int afterWithdraw = balance - 300;
        balance = afterWithdraw;
        System.out.println("You just withdraw: " + 300); 
    }

    // Deposit method : 
    public void deposit(){
        int afterDeposit = balance + 600;
        balance = afterDeposit;
        System.out.println("You just deposit: " + 600); 
    }

    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);
        
        //intial balacne check
        System.out.println("Your current initial balance is: " + savings.balance);

        System.out.println("------------------------------------------");

        // After deposit : 
        savings.deposit();
        savings.checkBalance();

        System.out.println("------------------------------------------");

        // After withdraw :
        savings.withdraw();
        savings.checkBalance();

    }
}
