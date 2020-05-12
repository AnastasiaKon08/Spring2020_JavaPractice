package day37_Constractors_;

public class CybertekStudents {
    static String schoolName;
    String studentName;
    int GroupNumber;
    String batch;

    public CybertekStudents(String studentName, int GroupNumber, String batch) {
        schoolName = "Cybertek";
        this.studentName = studentName;
        this.GroupNumber = GroupNumber;
        this.batch = batch;

    }

    public String toString() {
        return "Name: " + studentName + ", Batch: " + batch +
                ", in group: " + GroupNumber + ", School Name: " + schoolName;
    }
}
    class CObjects{

        public static void main(String[] args) {
            CybertekStudents student1 = new CybertekStudents("HUNDI", 16, "18");
            System.out.println(student1);
        }
    }


