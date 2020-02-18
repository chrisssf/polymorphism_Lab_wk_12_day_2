import java.util.ArrayList;

public abstract class PaymentCard {

    private String cardNumber;
    private String expiryDate;
    private String securityNumber;
    private ArrayList<Double> charges;


    public PaymentCard(String cardNumber, String expiryDate, String securityNumber){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        this.charges = new ArrayList<Double>();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getSecurityNumber() {
        return securityNumber;
    }

    public ArrayList<Double> getCharges() {
        return charges;
    }

    public abstract void addCharge(Double charge);
}
