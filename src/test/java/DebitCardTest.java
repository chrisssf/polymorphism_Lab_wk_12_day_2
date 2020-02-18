import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    DebitCard debitCard;

    @Before
    public void before(){
        debitCard = new DebitCard("1234", "11/20", "321", "125687", "98765");
    }

    @Test
    public void hasSortCode(){
        assertEquals("125687", debitCard.getSortCode());
    }

    @Test
    public void hasAccountNumber(){
        assertEquals("98765", debitCard.getAccountNumber());
    }

    @Test
    public void canCalculateTransactionCostWhenCharged(){
        debitCard.addCharge(20.00);
        assertEquals(.2, debitCard.calculateTransactionCost(), 0.01);
    }
}
