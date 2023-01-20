import java.util.GregorianCalendar ; 
import java.util.Calendar ;
public class Student {
    // Field --------------------------------------------------------------------------------------------
    private String name , studentId ;
    private GregorianCalendar date ;
    // Constructor --------------------------------------------------------------------------------------
    public Student(String name , String studentId) {
        this.name = name ;
        this.studentId = studentId ;
        this.date = new GregorianCalendar();
    }
    public Student(String name , String studentId , int day , int month , int year ) {
        this.name = name ;
        this.studentId = studentId ;
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
        boolean sameDate_day = this.date.get(Calendar.DAY_OF_MONTH) == secondStudent.date.get(Calendar.DAY_OF_MONTH) ;
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
    private int getDigit(int start , int end) {
        int digit = Integer.parseInt(this.studentId.substring(start, end + 1));
        return digit;
    }
    public int getFacultyCode() {
        int facultyCode = getDigit(8,9);
        return facultyCode;
    }
    public int getLevelCode() {
        int levelCode = getDigit(2,2);
        return levelCode;
    }
    public int getYear() {
        int yearCode = getDigit(0,1);
        return yearCode;
    }
    public boolean sameYear(Student other) {
        boolean sameYear = this.getYear() == other.getYear();
        return sameYear;
    }
    public boolean sameLevel(Student other) {
        boolean sameLevel = this.getLevelCode() == other.getLevelCode();
        return sameLevel;
    }
    public boolean sameFaculty(Student other) {
        boolean sameFaculty = this.getFacultyCode() == other.getFacultyCode();
        return sameFaculty;
    }
}
