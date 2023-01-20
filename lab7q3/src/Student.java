import java.util.GregorianCalendar ; 
import java.util.Calendar ;
import java.util.ArrayList;
public class Student {
    // Field --------------------------------------------------------------------------------------------
    private String name , studentId ;
    private GregorianCalendar date ;
    private ArrayList<CourseGrade> transcript = new ArrayList<>();
    // Constructor --------------------------------------------------------------------------------------
    public Student(String name , String studentId) {
        this.name = name.strip() ;
        this.studentId = studentId.strip() ;
        this.date = new GregorianCalendar();
    }
    public Student(String name , String studentId , int day , int month , int year ) {
        this.name = name.strip() ;
        this.studentId = studentId.strip() ;
        this.date = new GregorianCalendar(year, month, day);
    }
    // Method --------------------------------------------------------------------------------------------
    public void setBD(int day, int month, int year) {
        this.date = new GregorianCalendar(year, month, day) ;
    }
    public void setName(String name) {
        this.name = name ;
    }
    public GregorianCalendar getBD() {
        return this.date ;
    }
    public String getName() {
        return this.name ;
    }
    public String getID() {
        return this.studentId ; 
    }
    public int getAge() {
        int ageInyear = (new GregorianCalendar()).get(Calendar.YEAR) - this.date.get(Calendar.YEAR); 
        return ageInyear ;
    }
    public int daysToYears(int day) {
        int years = day / 365 ;
        return years ;
    }
    public boolean equals(Student secondStudent) {
        boolean sameName = this.name.equals(secondStudent.name) ; 
        boolean sameId = this.studentId.equals(secondStudent.studentId) ;  
        boolean sameDate_year = this.date.get(Calendar.YEAR) == secondStudent.date.get(Calendar.YEAR) ;
        Boolean sameDate_day = this.date.get(Calendar.DAY_OF_MONTH) == secondStudent.date.get(Calendar.DAY_OF_MONTH) ;
        boolean sameDate_month = this.date.get(Calendar.MONTH) == secondStudent.date.get(Calendar.MONTH) ;
        boolean end = sameName && sameId && sameDate_day && sameDate_month && sameDate_year ;
        return end ;
    }
    public String toString() {
        String mainString = this.name + " " + this.studentId + " " + this.date.get(Calendar.DAY_OF_MONTH) + " " + this.date.get(Calendar.MONTH) + " " + this.date.get(Calendar.YEAR); 
        return mainString ; 
    }
    public void setID(String id) {
        this.studentId = id ;
    }
    public void addGradeReport(Course c, String g) {
        this.transcript.add(new CourseGrade(c , g));
    }
    public double calGPA() {
        double sumProduct = 0;
        int sumCredit = 0;
        for (CourseGrade report : transcript) {
            int credit = Integer.parseInt(report.getCourse().getCredit());
            double grade = 0;
            switch (report.getGrade()) {
                case "A" : 
                    grade = 4.0; break;
                case "B+": 
                    grade = 3.5; break;
                case "B" : 
                    grade = 3.0; break;
                case "C+": 
                    grade = 2.5; break;
                case "C" : 
                    grade = 2.0; break;
                case "D+": 
                    grade = 1.5; break;
                case "D" : 
                    grade = 1.0; break;
                case "F" : 
                    grade = 0.0; break;
            }
            double product = credit * grade;
            sumCredit += credit;
            sumProduct += product;
        }
        double gpa = sumProduct / sumCredit;
        return gpa;
    }
    public ArrayList<CourseGrade> getTranscript() {
        return this.transcript;
    }
}

