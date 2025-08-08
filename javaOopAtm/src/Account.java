public class Account {

    private final String accountNumber;
    private double balance;

    Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // methods
    public void deposit(double amount){
        if(amount <= 0 ){
            System.out.println("Amount should be bigger than 0");
        }else{
            balance+=amount;
        }
    }
    public void withdraw(double amount){
        if(amount > this.balance){
            System.out.println("Amount could not be bigger than current balance");
        }
        else{
            balance-=amount;
        }
    }
    public void checkBalance(){
        System.out.println("Your current balance: " + this.balance);
    }
    public void getAccountNumber(){
        System.out.println("Your account name: " + this.accountNumber);
    }
}
