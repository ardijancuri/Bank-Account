public abstract class Account {

    //acc number
    private int accountNumber;
    //balance
    protected double balance;

    //default constructor
    public Account(){

    }

    public Account(int accountNumber){
        this.accountNumber = accountNumber;
        balance = 0;
    }

    //get methods
    public double getBalance(){
        return this.balance;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    //Abstract functions
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
