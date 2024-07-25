public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 52;
        double heightM = 1.63;
        int index = service.calculate(weightKg, heightM);
        System.out.println("Индекс массы тела составляет " + index);
    }
}
