package Practice;

public class Lasagna {

    public static void main(String[] args) {
        System.out.println(totalTimeInMinutes(3, 20));
    }

    // TODO: define the 'expectedMinutesInOven()' method
    public static int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public static int remainingMinutesInOven(int actualMinute) {
        return expectedMinutesInOven() - actualMinute;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public static int preparationTimeInMinutes(int numLayers) {
        return numLayers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public static int totalTimeInMinutes(int numLayers, int actualMinute) {
        return preparationTimeInMinutes(numLayers) + actualMinute;
    }

}