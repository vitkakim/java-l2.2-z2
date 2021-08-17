public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double bodyMassIndex = service.calculate(67, 172);

        String str = String.format("Индекс массы тела = %.2f кг/м^2", bodyMassIndex);
        System.out.println(str);

    }
}