import java.util.ArrayList;
public class Course {
    //Static Field -----------------------------------------------------------------------------
    private static int numAllCourse = 0;
    private static ArrayList<Faculty> facultyList = new ArrayList<Faculty>();
    //Field-------------------------------------------------------------------------------------
    private String subjectName , courseId , credit;
    //Constructor-------------------------------------------------------------------------------
    public Course(String subjectName , String courseId) {
        this.subjectName = subjectName.strip();
        this.courseId = courseId.strip();
        this.credit = "3";
        String facCode = courseId.substring(0,2);
        boolean oldFac = false;
        for (Faculty i : facultyList) {
            if (facCode.equals(i.getFacId())) {
                i.addNumCourse();
                oldFac = true;
                break;
            }
        }
        if (oldFac == false) {
            facultyList.add(new Faculty(facCode));
        }
        numAllCourse++;
    }
    public Course(String subjectName , String courseId , String credit) {
        this.subjectName = subjectName.strip();
        this.courseId = courseId.strip();
        this.credit = credit.strip();
        String facCode = courseId.substring(0,2);
        boolean oldFac = false;
        for (Faculty i : facultyList) {
            if (facCode.equals(i.getFacId())) {
                i.addNumCourse();
                oldFac = true;
                break;
            }
        }
        if (oldFac == false) {
            facultyList.add(new Faculty(facCode));
        }
        numAllCourse++;
    }
    //Method-------------------------------------------------------------------------------------
    public void setCid(String courseId) {
        this.courseId = courseId;
    }
    public void setCname(String subjectName) {
        this.subjectName = subjectName;
    }
    public void setCredit(String credit) {
        this.credit = credit;
    }
    public String getCname() {
        return this.subjectName;
    }
    public String getCid() {
        return this.courseId;
    }
    public String getCredit() {
        return this.credit;
    }
    public boolean equals(Course other) {
        boolean sameName = this.subjectName.equals(other.subjectName);
        boolean sameId = this.courseId.equals(other.courseId);
        boolean sameCredit = this.credit.equals(other.credit);
        boolean result = sameName && sameCredit && sameId;
        return result;
    }
    public int compare(Course other) {
        int result;
        boolean sameName = this.subjectName.equals(other.subjectName);
        boolean sameId = this.courseId.equals(other.courseId);
        boolean sameCredit = this.credit.equals(other.credit);
        if (sameName && sameCredit && sameId) {
            result = 0;
        }
        else {
            if (!sameId && sameName && sameCredit) {
                result = 1;
            }
            else {
                if (!sameName && sameId && sameCredit) {
                    result = 2;
                }
                else {
                    if (!sameCredit && sameId && sameName) {
                        result = 3;
                    }
                    else {
                        if (!sameName && !sameCredit && sameId) {
                            result = 4;
                        }
                        else {
                            if (!sameId && !sameCredit && sameName) {
                                result = 5;
                            }
                            else {
                                if (!sameId && !sameName && sameCredit) {
                                    result = 6;
                                }
                                else {
                                    result = 7;
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
    public String toString() {
        String text = this.courseId + " " + this.subjectName + " " + this.credit;
        return text;
    }
    public String addCreditWith(Course other) {
        int sum = Integer.parseInt(this.credit) + Integer.parseInt(other.credit);
        String result = String.valueOf(sum);
        return result;
    }
    public ArrayList<Faculty> getFacultyList() {
        return facultyList;
    }
    //Static Method------------------------------------------------------------------------------
    public static int numberOfFacCourses(int facultyCode) {
        String facCode = String.valueOf(facultyCode);
        int numOfFacCourse = 0;
        for (Faculty i : facultyList) {
            if (facCode.equals(i.getFacId())) {
                numOfFacCourse = i.getNumCourses();
                break;
            }
        }
        return numOfFacCourse;
    }
    public static int numberOfCourses() {
        return numAllCourse;
    }
}