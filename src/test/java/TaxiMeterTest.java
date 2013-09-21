import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TaxiMeterTest {
    TaxiMeter taxiMeter;

    @Test
    public void setUp() throws Exception {
        taxiMeter = new TaxiMeter();
    }

    @Test
    public void should_charge_6_within_2_miles() throws Exception {
             double price = taxiMeter.calculate(2);
             assertThat(price, is(6.0));
    }
}
