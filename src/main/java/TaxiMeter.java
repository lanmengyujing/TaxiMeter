public class TaxiMeter {

    public static final double STARTING_DISTANCE = 2;
    public static final double STARTING_PRICE = 6;
    public static final double BASE_DISTANCE = 8;
    public static final double BASE_PRICE = 0.8;
    public static final double RATING_PRICE = 1.2;
    public static final double STOPPING_PRICE = 0.25;

    public double calculate(double mile, int stoppingTime) {
        double distanceCharge = 0;
        double stoppingCharge = stoppingTime * STOPPING_PRICE;
        if (InStartDistance(mile)) {
            distanceCharge = STARTING_PRICE;
        } else if (InBaseDistance(mile)) {
            distanceCharge += STARTING_PRICE + BASE_PRICE * (mile - STARTING_DISTANCE);
        } else {
            distanceCharge += STARTING_PRICE + BASE_PRICE * STARTING_PRICE + RATING_PRICE * (mile - STARTING_PRICE);
        }
        return distanceCharge + stoppingCharge;
    }

    private boolean InBaseDistance(double mile) {
        return mile <= BASE_DISTANCE;
    }

    private boolean InStartDistance(double mile) {
        return mile < STARTING_DISTANCE;
    }
}
