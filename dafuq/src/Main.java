public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("ali",-100);
        Worker worker2 = new Worker("ahmet",-100);
        Worker worker3 = new Worker("zeynep",-100);

        System.out.println(Worker.counter);

        if (worker1.getSalary() < 0)
            throw new IllegalArgumentException("Salary should be greater then zero!");
    }
}