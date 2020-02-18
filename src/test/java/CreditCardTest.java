import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard("1234", "11/20", "321", 5.0, 1000.00, 2.0);
    }

    @Test
    public void getCustomerRiskMultiplier(){
        assertEquals(5.0, creditCard.getCustomerRiskMultiplier(), 0.01);
    }

    @Test
    public void getCreditLimit(){
        assertEquals(1000.0, creditCard.getCreditLimit(), 0.01);
    }

    @Test
    public void getTransactionCost(){
        assertEquals(2.0, creditCard.getTransactionCost(), 0.01);
    }

    @Test
    public void checkChargesBeginsEmpty(){
        assertEquals(0, creditCard.checkCharges());
    }

    @Test
    public void canAddCharge(){
        creditCard.addCharge(20.00);
        assertEquals(1, creditCard.checkCharges());
    }

    @Test
    public void chargeDecreasesCreditLimit(){
        creditCard.addCharge(20.00);
        assertEquals(980.0, creditCard.getCreditLimit(), 0.01);
    }

    @Test
    public void canCalculateTransactionCostWhenCharged(){
        creditCard.addCharge(20.00);
        assertEquals(.4, creditCard.calculateTransactionCost(), 0.01);
    }

    @Test
    public void checkHighRiskCustomersAreBlocked() {
        creditCard = new CreditCard("1234", "11/20", "321", 15.0, 1000.00, 2.0);
        creditCard.addCharge(20.00);
        assertEquals(20.00, creditCard.calculateTransactionCost(), 0.01);
    }

}
