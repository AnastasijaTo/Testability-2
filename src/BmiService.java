public class BmiService {
    public <index> int calculate(int weight, double height) {
        return (int) (weight / (height * height));
    }
}
