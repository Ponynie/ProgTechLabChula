public class Secretary extends Employee implements Evaluation {
    //Field----------------------------------------------------------
    private int typingSpeed;
    private int[] score;
    //Constructor----------------------------------------------------
    public Secretary(String name , int salary, int[] sc ,int typingSpeed) {
        super(name , salary);
        this.score = sc;
        this.typingSpeed = typingSpeed;
    }
    //Method---------------------------------------------------------
    public double evaluate() {
        double sum = 0;
        for (int i : this.score) {
            sum += i;
        }
        return sum;
    }
    public char grade(double evaluated) {
        char grade;
        if (evaluated >= 90) {
            setSalary(18000);
            grade = 'P';
        }
        else {
            grade = 'F';
        }
        return grade;
    }
    public int getTypespeed() {
        return typingSpeed;
    }
}
