public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int production = speed * 221;

        if (speed >= 5 && speed < 9) {
            production = (speed * 221) * 0.9;
        } else if (speed == 9) {
            production = (speed * 221) * 0.8;
        } else if (speed == 10) {
            production = (speed * 221) * 0.77;
        }

        return production;
    }

    public int workingItemsPerMinute(int speed) {
        return (speed * 221) / 60;
    }
}
