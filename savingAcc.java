public class savingAcc extends bank implements interest{
    //variable
    private String cardID = null;
    private Double cardFee = null;
    private static final Double interestRate = 0.25;

    //constructor
    public savingAcc(String accName, String accountID, Double balance, String bankName, Double transferFee, String cardID, Double cardFee){
        super(accName, accountID, balance, bankName, transferFee);

    }
    
    //set

    //get

    //method

    public void getInterest(Double balance) {
        //calculate interest from balance using interest rate
    }
    public void transfer(String accName, Double amount, String bankName){
        //transfer amount of money(amount) to other bank account(accName)
        //deduct balance if not the same bank
        //Can't done if balance become zero after transfer

    }
    public void useCard(Double amount){
        //deduct balance when use credit card with card fee, can't done if balance become zero after used
    }
}
