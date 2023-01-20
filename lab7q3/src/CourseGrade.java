public class CourseGrade {
    private Course course;
    private String grade;

    public CourseGrade(Course course , String grade) {
        this.course = course;
        this.grade = grade;
    }
    public String toString() {
        return this.course.toString() + " " + this.grade;
    }
    public Course getCourse() {
        return this.course;
    }
    public String getGrade() {
        return this.grade;
    }
}
