public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Bycicle bycicle = new Bycicle();
        Boat boat = new Boat();

        Vehile[] racers = {car,boat,bycicle};

        for (Vehile x : racers){
            x.go();
        }
    }
}