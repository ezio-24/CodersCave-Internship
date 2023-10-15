package CodersCave.Phase1.FeesManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Student {

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    private String name;
    private String rollNumber;
    private List<FeeRecord> feeRecords;
    

    public Student(String name, String rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
        this.feeRecords = new ArrayList<>();
    }


    public void addFeeRecord(FeeRecord feeRecord){
        feeRecords.add(feeRecord);
    }

    public void displayFeeRecords (){
        for(FeeRecord feeRecord : feeRecords){
            System.out.println(ANSI_GREEN + feeRecord + ANSI_RESET);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                '}';
    }
}
