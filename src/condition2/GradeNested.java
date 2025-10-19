package condition2;

public class GradeNested {
    public String getGradeInfo(String subject, int score) {
        String grade;
        String subjectOutput;

        // Menentukan grade berdasarkan subject dan score
        if (subject.equalsIgnoreCase("Math")) {
            subjectOutput = "Math";
            if (score >= 90) { 
                grade = "A"; // jika score >= 90, maka grade A untuk Math
            } else if (score >= 75) {
                grade = "B"; // jika score >= 75, maka grade B untuk Math
            } else {
                grade = "C"; // selain itu, grade C untuk Math
            }
        } else if (subject.equalsIgnoreCase("English")) {
            subjectOutput = "English";
            if (score >= 85) {
                grade = "A"; // jika score >= 85, maka grade A untuk English
            } else if (score >= 70) {
                grade = "B"; // jika score >= 70, maka grade B untuk English
            } else {
                grade = "C"; // selain itu, grade C untuk English
            }
        } else {
            subjectOutput = "Unknown"; // subject selain Math dan English
            grade = "N/A"; // grade tidak berlaku
        }
        return "Subject: " + subjectOutput + ", Grade: " + grade;  // output
    }
}