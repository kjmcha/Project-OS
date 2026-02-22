import java.util.ArrayList;
public class transaction{
    //variable
    private static ArrayList<String> transactionList = new ArrayList<>();

    //method
    public void addTransaction(String accName, double amount, String bankName) {
        transactionList.add(accName + " " + amount + " " + bankName); 
    }
    public ArrayList<String> getTransaction(){
        return transactionList;
    }


}