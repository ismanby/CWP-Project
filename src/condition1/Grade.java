package condition1;

public class Grade {
    public String getGrade(int score) {
        String grade;
        // menentukan grade berdasarkan score
        if (score >= 90) {
            grade = "Grade: A"; // jika score >= 90, maka grade A
        } else if (score >= 75) {
            grade = "Grade: B"; // jika score >= 75, maka grade B
        } else if (score >= 60) {
            grade = "Grade: C"; // jika score >= 60, maka grade C
        } else {
            grade = "Grade: F"; // selain itu, grade F
        }
        return grade;
    }   
}