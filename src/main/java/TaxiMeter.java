public class TaxiMeter {

    public static final double STARTING_DISTANCE = 2;
    public static final double STARTING_PRICE = 6;
    public static final double BASE_DISTANCE = 8;
    public static final double BASE_PRICE = 0.8;
    public static final double RATING_PRICE = 1.2;

    public double calculate(double mile) {
        double distancePrice = 0;
        if (InStartDistance(mile)) {
            distancePrice = STARTING_PRICE;
        } else if (InBaseDistance(mile)) {
            distancePrice += STARTING_PRICE + BASE_PRICE * (mile - STARTING_DISTANCE);
        } else {
            distancePrice += STARTING_PRICE + BASE_PRICE * STARTING_PRICE + RATING_PRICE * (mile - STARTING_PRICE);
        }
        return distancePrice;
    }

    private boolean InBaseDistance(double mile) {
        return mile <= BASE_DISTANCE;
    }

    private boolean InStartDistance(double mile) {
        return mile < STARTING_DISTANCE;
    }
}
