package condition1;

public class Grade {
    public String getGrade(int score) {
        String grade;
        if (score >= 90) {
            grade = "Grade: A";
        } else if (score >= 75) {
            grade = "Grade: B";
        } else if (score >= 60) {
            grade = "Grade: C";
        } else {
            grade = "Grade: F";
        }
        return grade;
    }   
}