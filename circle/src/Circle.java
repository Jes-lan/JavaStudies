public class Circle {
    private final double PI = 3.415926;
    private double radius;

    Circle(double radius){
        setRadius(radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea(){
        return PI*getRadius()*getRadius();
    }
}
