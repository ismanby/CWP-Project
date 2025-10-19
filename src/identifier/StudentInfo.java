package identifier;

public class StudentInfo {
    // fungsi untuk menampilkan informasi mahasiswa
    public String showStudentInfo(String name, int age, double gpa) {
        // menyusun informasi mahasiswa dalam format tertentu
        String output = "Name: " + name + "\n" +
                        "Age : " + age + "\n" +
                        "GPA : " + gpa + "\n";
        
        // mengembalikan string informasi mahasiswa
        return output;
    }
}
