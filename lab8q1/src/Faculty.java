public class Faculty {
    private String facId;
    private int numCourses;

    public Faculty(String facId) {
        this.facId = facId;
        this.numCourses = 1;
    }
    public String getFacId() {
        return this.facId;
    }
    public int getNumCourses() {
        return this.numCourses;
    }
    public void addNumCourse() {
        this.numCourses++;
    }
}
