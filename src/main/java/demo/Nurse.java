package demo;

public class Nurse implements Staff{

    private String qualification;

    //creating constructor for constructor injection
    public Nurse(String qualification) {
        this.qualification = qualification;
    }

    public void status(){
        System.out.println("Nurse is Busy");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
