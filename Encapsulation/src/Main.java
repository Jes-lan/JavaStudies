public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Chevrolet","Camaro",2021);
        //Car car2 = new Car("Mercedes","A5",2022);

        //car2.copy(car1);

        Car car2 = new Car(car1);
    }
}