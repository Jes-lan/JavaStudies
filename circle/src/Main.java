public class Main {
    public static void main(String[] args) {
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(15);
        Circle circle1 = new Circle(5);

        double[] array = {circle1.computeArea(),circle2.computeArea(),circle3.computeArea()};

        for (double i :
                array) {
            System.out.println(i);
        }
    }
}