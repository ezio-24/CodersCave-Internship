package CodersCave.Phase1.FeesManagementSystem;

public class FeeRecord {
    private int amountPaid;
    private String paymentDate;


    public FeeRecord (int amountPaid, String paymentDate){
        this.amountPaid = amountPaid;
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString(){
        return "FeeRecord{" +
    "amountPaid=" + amountPaid + 
    ", paymentDate='" + paymentDate + '\'' + 
    '}';
    }
}
