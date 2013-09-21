import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TaxiMeterTest {
    public TaxiMeter taxiMeter;

    @Before
    public void setUp() throws Exception {
        taxiMeter = new TaxiMeter();
    }

    @Test
    public void should_charge_6_within_2_miles() throws Exception {
        double price = taxiMeter.calculate(2);
        assertThat(price, is(6.0));
    }

    @Test
    public void should_charge_more_than_6_when_distance_is_3() throws Exception {
        double price = taxiMeter.calculate(3);
        assertThat((price - 6) > 0, is(true));
    }

    @Test
    public void should_charge_12_when_distance_is_9() throws Exception {
        double price = taxiMeter.calculate(9);
        assertThat(price, is(14.4));
    }
}
