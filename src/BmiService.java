public class BmiService {

    public static int calculate(double heightInMeters, double weightInKg) {
        double bmi = weightInKg / (heightInMeters * heightInMeters);
        return (int) bmi;
    }
}