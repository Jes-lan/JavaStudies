public class Worker {
    private String name;
    private float salary;
    static int counter;

    Worker(String name, float salary){
        setName(name);
        setSalary(salary);
        counter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
