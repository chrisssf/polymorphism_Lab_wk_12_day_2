import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    GiftCard giftcard;

    @Before
    public void before(){
        giftcard = new GiftCard("Starbucks", 100.00);
    }

    @Test
    public void hasVendor(){
        assertEquals("Starbucks", giftcard.getVendor());
    }

    @Test
    public void hasBalance(){
        assertEquals(100.00, giftcard.getBalance(), 0.01);
    }
}
