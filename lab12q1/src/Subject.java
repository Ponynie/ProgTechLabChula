public class Subject implements Evaluation {
    //Field---------------------------------------------------------
    private String subjName;
    private int[] score;
    //Constructor---------------------------------------------------
    public Subject(String subjName, int[] score) {
        this.subjName = subjName;
        this.score = score;
    }
    //Method--------------------------------------------------------
    public double evaluate() {
        double sum = 0;
        for (int i : this.score) {
            sum += i;
        }
        return sum / score.length;
    }
    public char grade(double evaluated) {
        char grade;
        if (evaluated >= 70) {
            grade = 'P';
        }
        else {
            grade = 'F';
        }
        return grade;
    }
    public String toString() {
        return this.subjName;
    }
}
