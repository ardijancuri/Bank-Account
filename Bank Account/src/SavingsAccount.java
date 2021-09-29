public class SavingsAccount extends Account{

    private double interestRate;

    //default constructor
    public SavingsAccount(){
        super();
    }

    //construcotr with parameter
    public SavingsAccount(int accountNumber, double interestRate){
        super(accountNumber);
        this.interestRate = interestRate;
    }

    //getter function
    public double getInterestRate(){
        return this.interestRate;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    public double calcInterest(){
        return balance * interestRate;
    }

    public void applyInterest(){
        double interest = calcInterest();
        System.out.println("Interest amount added to balance: "+ interest);
        deposit(interest);
    }

    //Abstract functions
    public void deposit(double amount){

        if(amount > 0){
            balance += amount;
            System.out.println("Amount deposited: "+ amount);
            System.out.println("Current Balance is: "+ balance);

        }else{
            System.out.println("A negative amount cannot be deposited!");
        }
    }
    public void withdraw(double amount){

        if(amount > 0){

            if(amount <= balance){
                System.out.println("Amount withdrawn from account: "+ amount);
                balance -= amount;
                System.out.println("Current Balance is: "+ balance);
            }else{
                System.out.println("Try a smaller amount!");
            }
        }else{
            System.out.println("Negative amount cannot be withdrawn!");
        }
    }
}
