package pr30;

import org.junit.Test;
import pr29.CurrencyInfo;

import static org.junit.Assert.*;


public class ClassTest {
    @Test
    public void testSetName() {
        CurrencyInfo currencyInfo = new CurrencyInfo();
        currencyInfo.setName("Euro");
        assertEquals("Euro", currencyInfo.getName());
    }

    @Test
    public void testSetSymbol() {
        CurrencyInfo currencyInfo = new CurrencyInfo();
        currencyInfo.setSymbol("€");
        assertEquals("€", currencyInfo.getSymbol());
    }

    @Test
    public void testSetExchangeRate() {
        CurrencyInfo currencyInfo = new CurrencyInfo();
        currencyInfo.setExchangeRate(4.0);
        assertEquals(4.0, currencyInfo.getExchangeRate(), 0.004);
    }
}
