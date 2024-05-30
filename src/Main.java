public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    BmiService service = new BmiService();
    int weightKg = 90;
    double heightM = 1.82;
    int BMI = (int) (int weightKg,double heightM);
System.out.println(BMI);
}
}