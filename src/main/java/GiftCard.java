
public class GiftCard implements IChargeable{

    private String vendor;
    private Double balance;


    public GiftCard(String vendor, Double balance){
        this.vendor = vendor;
        this.balance = balance;
    }

    public String getVendor() {
        return vendor;
    }

    public Double getBalance() {
        return balance;
    }

    public void addCharge(Double charge){
        this.balance -= charge;
    }

    public Double calculateTransactionCost(){
            return 0.0;
    }
}
