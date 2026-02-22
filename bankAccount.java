public abstract class bankAccount{
    //variable
    private String accName = null;
    private String accountID = null;
    private Double balance = null;
    
    //constructor
    public bankAccount(String accName, String accountID, Double balance){
        this.accName = accName;
        this.accountID = accountID;
        this.balance = balance;
    }

    //set
    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public void setBalance(Double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }
    
    //get
    public String getAccName() {
        return this.accName;
    }

    public String getAccountID() {
        return this.accountID;
    }

    public Double getBalance() {
        return this.balance;
    }

    //method
    public void withdraw(Double amount) {
        //withdraw money from account
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }
    public void deposit(Double amount){
        //deposit money to account
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }

    }
}