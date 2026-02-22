import java.util.ArrayList;
public class currAcc extends bank{
    //variable
    private Double minimum = null;
    private ArrayList<String> statement;

    //constructor
    public currAcc(String accName, String accountID, Double balance, String bankName, Double transferFee, Double minimum){
        super(accName, accountID, balance, bankName, transferFee);
        this.statement = new ArrayList<>();

    }

    //set


    //get


    //method
    public void addStatement(Double amount, String bankName){
        //add to statement after transfer

    }
    public void transfer(String accName, Double amount, String bankName){
        //transfer amount of money(amount) to other bank account(accName), add to statement after transfer
        //deduct balance if not the same bank
        //Can't done if balance is less than minimum after transfer
        
    }
}
