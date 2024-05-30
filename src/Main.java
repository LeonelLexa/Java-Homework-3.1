public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 90;
        double heightM = 1.82;
        int BMI = service.calculate(90, 1.82);
        System.out.println(BMI);
    }

}