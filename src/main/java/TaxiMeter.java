public class TaxiMeter {

    public double calculate(double mile) {
        if (mile < 2) {
            return 6;
        } else if (mile <= 8) {
            return 6 + 0.8 * (mile - 2);
        } else {
            return 6 + 0.8 * 6 + 1.2 * (mile - 6);
        }
    }
}
