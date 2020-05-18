package day40_Encapsulation;

public class Encapsulation {
    private long Ssn;


    // getter: allows other classes to read private data (read only)
    public long getSsn(){ //return
        return Ssn;
    }

    public void setSsn(long Ssn){
        this.Ssn = Ssn;


    }
}
