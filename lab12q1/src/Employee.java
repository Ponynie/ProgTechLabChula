public class Employee {
    //Field-----------------------------------------------------------------
    private String name;
    private int salary;
    //Constructor-----------------------------------------------------------
    public Employee(String name , int salary) {
        this.name = name;
        this.salary = salary;
    }
    //Method-----------------------------------------------------------------
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString() {
        return this.name + "\n" + "salary = " + this.salary;
    }
}
