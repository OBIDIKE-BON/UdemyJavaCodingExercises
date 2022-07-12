public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2) {
        return (int) (value1 * 1_000) == (int) (value2 * 1_000);
    }
}
