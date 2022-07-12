public class Main {
    public static void main(String[] args) {
        MegaBytesConverter.printMegaBytesAndKiloBytes(-2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        print(" shouldWakeUp = " + BarkingDog.shouldWakeUp(true, 7));
        print(" isLeapYear = " + LeapYear.isLeapYear(2022));
        print(" areEqualByThreeDecimalPlaces = " + DecimalComparator.areEqualByThreeDecimalPlaces(-33.1756, -33.175));
        print(" areEqualByThreeDecimalPlaces = " + DecimalComparator.areEqualByThreeDecimalPlaces(33.175, 33.176));
        print(" areEqualByThreeDecimalPlaces = " + DecimalComparator.areEqualByThreeDecimalPlaces(33.04, 33.04));
        print(" areEqualByThreeDecimalPlaces = " + DecimalComparator.areEqualByThreeDecimalPlaces(-33.1232, 33.1237));
        print(" hasEqualSum " + EqualSumChecker.hasEqualSum(1, 1, 1));
        print(" hasEqualSum " + EqualSumChecker.hasEqualSum(1, 1, 2));
        print(" hasEqualSum " + EqualSumChecker.hasEqualSum(1, -1, 0));
        print(" hasTeen " + TeenNumberChecker.hasTeen(9, 99, 19));
        print(" hasTeen " + TeenNumberChecker.hasTeen(23, 15, 42));
        print(" hasTeen " + TeenNumberChecker.hasTeen(22, 23, 34));
        print(" isTeen " + TeenNumberChecker.isTeen(9));
        print(" isTeen " + TeenNumberChecker.isTeen(13));

    }

    public static void print(String message) {
        System.out.println(message);
    }
}
