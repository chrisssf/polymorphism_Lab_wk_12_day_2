import java.util.ArrayList;

public class CreditCard extends PaymentCard implements IChargeable{

    private Double customerRiskMultiplier;
    private Double creditLimit;
    private Double transactionCost;
    private ArrayList<Double> charges;

    public CreditCard(String cardNumber, String expiryDate, String securityNumber, Double customerRiskMultiplier, Double creditLimit, Double transactionCost){
        super(cardNumber, expiryDate, securityNumber);
        this.customerRiskMultiplier = customerRiskMultiplier;
        this.creditLimit = creditLimit;
        this.transactionCost = transactionCost;
        this.charges = new ArrayList<Double>();
    }

    public Double getCustomerRiskMultiplier() {
        return customerRiskMultiplier;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public Double getTransactionCost() {
        return transactionCost;
    }

    public int checkCharges(){
        return charges.size();
    }

    public void addCharge(Double charge){
        charges.add(charge);
        this.creditLimit -= charge;
    }

    public Double calculateTransactionCost(){
        if (customerRiskMultiplier <= 10) {
            return charges.get(0) * 0.02;
        } else {
            return charges.get(0);
        }
    }
}
