public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(86.5, 1.65);
        String result = String.format("%.2f",bmi);
        System.out.println("Индекс массы тела:" + result);

    }
}
