package condition2;

public class GradeNested {
    public String getGradeInfo(String subject, int score) {
        String grade;
        String subjectOutput;

        if (subject.equalsIgnoreCase("Math")) {
            subjectOutput = "Math";
            if (score >= 90) {
                grade = "A";
            } else if (score >= 75) {
                grade = "B";
            } else {
                grade = "C";
            }
        } else if (subject.equalsIgnoreCase("English")) {
            subjectOutput = "English";
            if (score >= 85) {
                grade = "A";
            } else if (score >= 70) {
                grade = "B";
            } else {
                grade = "C";
            }
        } else {
            subjectOutput = "Unknown";
            grade = "N/A";
        }
        return "Subject: " + subjectOutput + ", Grade: " + grade;
    }
}