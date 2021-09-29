public class CheckingAccount extends Account {
    //FEE
    private static double FEE = 2.5;

    //default constructor
    public CheckingAccount(){
        super();
    }

    //construcotr with parameter
    public CheckingAccount(int accountNumber, double fee){
        super(accountNumber);
        FEE = fee;
    }

    //Abstract functions
    public void deposit(double amount){

        if(amount > 0){
            balance += amount;
            System.out.println("Amount deposited: "+ amount);

            balance -= FEE;
            System.out.println("Fee applied: "+ FEE);

            System.out.println("Current Balance is: "+ balance);

        }else{
            System.out.println("A negative amount cannot be deposited!");
        }
    }
    public void withdraw(double amount){

        if(amount > 0){

            if((amount + FEE) <= balance){
                System.out.println("Amount withdrawn from account: "+ amount);
                balance -= (amount + FEE);
                System.out.println("FEE applied: "+ FEE);
                System.out.println("Current Balance is: "+ balance);
            }else{
                System.out.println("Try a smaller amount!");
            }
        }else{
            System.out.println("Negative amount cannot be withdrawn!");
        }
    }
}
