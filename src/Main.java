public class Main {
    public static void main(String[] args) {
        BmiService bmiservice = new BmiService();
        int weight = 98;
        double height = 1.87;
        int bmiIndex = BmiService.calculate(height, weight);
        System.out.println("BMI index: +" + bmiIndex);
    }

}