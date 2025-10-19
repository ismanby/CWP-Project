package identifier;

public class StudentInfo {
    public String showStudentInfo(String name, int age, double gpa) {
        String output = "Name: " + name + "\n" +
                        "Age : " + age + "\n" +
                        "GPA : " + gpa + "\n";
        return output;
    }
}
