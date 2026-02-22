import java.util.ArrayList;
public class currAcc extends bank{
    //variable
    private Double minimum = null;
    private ArrayList<String> statement;

    //constructor
    public currAcc(String accName, String accountID, Double balance, String bankName, Double transferFee, Double minimum){
        super(accName, accountID, balance, bankName, transferFee);
        this.minimum = minimum;
        this.statement = new ArrayList<>();

    }

    //set
    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }


    //get
    public Double getMinimum() {
        return this.minimum;
    }
    public ArrayList<String> getStatement() {
        return this.statement;
    }

    //method
    public void addStatement(Double amount, String bankName){
        //add to statement after transfer
        String record = "Transfer " + amount + " to " + bankName;
        this.statement.add(record);

    }
    public void transfer(String accName, Double amount, String bankName){
        //transfer amount of money(amount) to other bank account(accName), add to statement after transfer
        //deduct balance if not the same bank
        //Can't done if balance is less than minimum after transfer
        double totalAmount = amount;
        if (checkBank(bankName)) {
            totalAmount += getTransferFee();
        }
        if(getBalance() - totalAmount >= minimum) {
            withdraw(totalAmount);
            addStatement(amount, bankName);
        } else {
            System.out.println("Transfer failed. Insufficient balance after transfer.");
        }
    }
}
