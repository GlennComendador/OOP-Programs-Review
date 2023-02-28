public class Inheritance {

    public static void main(String[] args) {

        //Creation of Objects
        InheritanceEmployee employee = new InheritanceEmployee();
        InheritanceLawyer lawyer1 = new InheritanceLawyer();
        InheritanceSecretary secretary = new InheritanceSecretary();
        InheritanceMarketer marketer = new InheritanceMarketer();
        InheritanceLegalSecretary legalSecretary = new InheritanceLegalSecretary();

        System.out.println(marketer.getHours());
        System.out.println(marketer.getVacationDays());
        System.out.println(marketer.getSalary());
        System.out.println(lawyer1.getSalary());

        InheritanceLawyer lawyer2 = new InheritanceLawyer("John");
        InheritanceLawyer lawyer3 = new InheritanceLawyer("John");
        InheritanceLawyer lawyer4 = lawyer3;

        //== is used to compare references of object.
        //will give false because they are not referenced or connected to each other
        System.out.println(lawyer2 == lawyer3);

        //Will give true because they were connected via this line:
        //  InheritanceLawyer lawyer4 = lawyer3;
        System.out.println(lawyer3 == lawyer4);



        //Comparing content of objects by using .equals()
        //will give false because even if they have the same name,
        //they were created separately
        System.out.println(lawyer2.equals(lawyer3));

        //Will give true because they were connected via this line:
        //  InheritanceLawyer lawyer4 = lawyer3;
        //thus making the contents of lawyer3 the same as lawyer4
        System.out.println(lawyer3.equals(lawyer4));




        //POLYMORPHISM
        InheritanceEmployee[] employees = new InheritanceEmployee[10];
        employees[0] = lawyer1;
        employees[1] = secretary;
        employees[2] = marketer;
        employees[3] = legalSecretary;

        InheritanceEmployee employee1 = new InheritanceLawyer();
        InheritanceEmployee employee2 = new InheritanceSecretary();
        InheritanceEmployee employee3 = new InheritanceMarketer();
        InheritanceEmployee employee4 = new InheritanceLegalSecretary();

        //InheritanceLawyer lawyer = new InheritanceEmployee(); - will give error

        System.out.println(employee3.getSalary());
        //Even if Employee Superclass is used with Salary Value (4000), it will still return marketer salary value (5500)

        System.out.println(((InheritanceMarketer) employee3).insideMarket());
    }

}
