public class bank extends bankAccount{
    //variable
    private String bankName = null;
    private Double transferFee = null;

    //constructor
    public bank(String accName, String accountID, Double balance, String bankName, Double transferFee){
        super(accName, accountID, balance);
        this.bankName = bankName;
        this.transferFee = transferFee;
    }

    //set


    //get


    //method
    public boolean checkBank(String bankName){
        //check if target account id the same bank or not
        return true;
    }
}
