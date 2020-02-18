import java.util.ArrayList;

public class DebitCard extends PaymentCard implements IChargeable{

    private String sortCode;
    private String accountNumber;
    private ArrayList<Double> charges;


    public DebitCard(String cardNumber, String expiryDate, String securityNumber, String sortCode, String accountNumber){
        super(cardNumber, expiryDate, securityNumber);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.charges = new ArrayList<Double>();

    }

    public String getSortCode() {
        return sortCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void addCharge(Double charge){
        charges.add(charge);
    }

    public Double calculateTransactionCost(){
        return charges.get(0) * 0.01;
    }
}
