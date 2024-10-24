public class BankAccount {
    private  String accountNumber;
    private  double balance;
    public  BankAccount(String accountNumber){
        this.balance = 0.0;
        this.accountNumber = accountNumber;
    }
    public BankAccount(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) throws InvalidAmountException{
        if(amount > 0){
            System.out.println("Depositing: $" + amount);
        }
        if(amount <= 0){
            System.out.println("Attempting to deposit: " + amount);
            throw new InvalidAmountException("Invalid amount!");
        }
        balance = balance + amount;
        System.out.println("New balance: $" + balance);
    }
    public void withdraw(double amount) throws InsufficientFundsException{
        System.out.println("Attempting to withdraw: $" + amount);
        if(amount <= 0  || amount > balance){

            throw new InsufficientFundsException("Insufficient funds!");

        }
        balance = balance - amount;
        System.out.println("New balance: $" + balance);
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}