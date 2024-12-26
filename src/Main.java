public class Main {
    private static final double CONVERT_KMH = 0.62137119;

    public static void main(String[] args) {
        System.out.println("This project will convert km/h to mph and vice versa.");

        double kmH = 90;
        double mph = 60;
        double convertedKilometers = convertKmToMPH(kmH);
        double convertedMiles = convertMPHToKm(mph);

        System.out.println("Kilometers without conversion to miles: " + kmH + "\n" +
                "Kilometers with conversion to miles: " + convertedKilometers);

        System.out.println("Miles without conversion to kilometers: " + mph + "\n" +
                "Miles with conversion to kilometers: " + convertedMiles);
    }

    private static double convertKmToMPH(double kmH) {
        return kmH * CONVERT_KMH;
    }

    private static double convertMPHToKm(double mph) {
        return mph / CONVERT_KMH;
    }
}