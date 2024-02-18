public class SavingsAccount {
    int balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    //blance checking method :
    public void checkBalance(){
        System.out.println("your balance is: " + balance);
    }

    //withdraw method : 
    public void withdraw(int withdrawAmount){
        int afterWithdraw = balance - withdrawAmount;
        balance = afterWithdraw;
        System.out.println("You just withdraw: " + withdrawAmount + ". So now, "); 
    }

    // Deposit method : 
    public void deposit(int depositAmount){
        int afterDeposit = balance + depositAmount;
        balance = afterDeposit;
        System.out.println("You just deposit: " + depositAmount + ". So now, "); 
    }

    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);
        
        //intial balacne check
        System.out.println("Your initial balance is: " + savings.balance);

        System.out.println("------------------------------------------");

        // After deposit : 
        savings.deposit(700);
        savings.checkBalance();

        System.out.println("------------------------------------------");

        // After withdraw :
        savings.withdraw(500);
        savings.checkBalance();

    }
}
