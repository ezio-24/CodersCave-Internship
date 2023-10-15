package CodersCave.Phase1.FeesManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class FeesManagementSystem {

       public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    private List<Student> students;

    public FeesManagementSystem(){
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void displayStudents(){
        for(Student student : students){
            System.out.println(ANSI_GREEN + student + ANSI_RESET);
        }
    }


    public static void main(String[] args) {
        FeesManagementSystem system = new FeesManagementSystem();

        Student student1 = new Student("John", "101");
        student1.addFeeRecord(new FeeRecord(100, "2022-01-01"));
        student1.addFeeRecord(new FeeRecord(200, "2022-02-01"));

        Student student2 = new Student("Jane", "102");
        student2.addFeeRecord(new FeeRecord(150, "2022-01-01"));
        student2.addFeeRecord(new FeeRecord(250, "2022-02-01"));

        system.addStudent(student1);
        system.addStudent(student2);

        System.out.println(ANSI_RED + "Students:" + ANSI_RESET);
        system.displayStudents();

        System.out.println(ANSI_RED + "\nFee Records for Student 1:" + ANSI_RESET);
        student1.displayFeeRecords();
    }
}
