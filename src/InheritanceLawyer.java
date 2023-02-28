public class InheritanceLawyer extends InheritanceEmployee {

    //CHILDREN CLASS

    //Variable Initialization
    String nameLawyer;

    //Lawyer Specific
    public String getLawyerPosition() {
        return "Senior";
    }

    @Override
    public double getSalary() {
        return super.getSalary() + 500;
    }


    public InheritanceLawyer(){

    }

    public InheritanceLawyer(String nameLawyer){
        this.nameLawyer = nameLawyer;
    }
}
