public class ObjectExample {
    public static void main(String[] args) {

        //Creating the Student Object with Default Empty Constructor
        Student student1 = new Student();

        //Calling the Behaviors of Student Object
        student1.Drinking();
        student1.Eating();
        student1.Running();

        //You can see that it will be initialized as Null since it's a String
        //System.out.println("Student 1 Name: " + student1.studentName);


        //Creating Object with Full State Constructor
        Student student2 = new Student("Glenn", 26, "Brown", 'M');
        student2.Running();
        //System.out.println("Student 2 Name: " + student2.studentName);
    }
}
