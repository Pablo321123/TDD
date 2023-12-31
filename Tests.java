import static org.junit.Assert.*;
import org.junit.Test;

public class Tests {
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    // public void testFrancMultiplication() {
    //     Money five = Money.franc(5);
    //     assertEquals(Money.franc(10), five.times(2));
    //     assertEquals(Money.franc(15), five.times(3));
    // }

    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    // public void testDifferentClassEquality() {
    //     assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
    // }

}
