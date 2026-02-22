import java.time.LocalDateTime;
public class fixedDepositAcc extends bank{
    //variable
    private Integer time = null;
    private LocalDateTime date = null;
    private Double interestRate = null;

    //constructor
    public fixedDepositAcc(String accName, String accountID, Double balance, String bankName, Double transferFee, Integer time, LocalDateTime date){
        super(accName, accountID, balance, bankName, transferFee);
        this.time = time;
        this.date = date;

    }

    //set
    public void setTime(Integer time) {
        this.time = time;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    
    //get
    public Integer getTime() {
        return this.time;
    }
    public LocalDateTime getDate() {
        return this.date;
    }
    public Double getInterestRate() {
        return this.interestRate;
    }

    //method
    public void cutInterest(Double amount){
        //deduce interest rate when transfer
        

    }
    public void getInterest(Double  balance){
        //calculate interest from balance and time 
        //interest rate can be change depend on time

    }
    public void transfer(String accName, Double amount, String bankName){
        //transfer amount of money(amount) to other bank account(accName) and cut interest
        //deduct balance if not the same bank
        //Can't done if balance become zero after transfer
        
    }
}
