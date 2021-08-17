public class BmiService {
    public double calculate(int weight, double height) {

        System.out.println("Вес = " + weight + " кг");
        System.out.println("Рост = " + height + " см");

        return weight / Math.pow(height * 0.01, 2);
    }
}
