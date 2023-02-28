public class Student {

    //States
    private String studentName;
    private int studentAge;
    private String studentColor; //Brown, Black, White
    private char studentSex; //F or M


    private static int id = 0;

    public void Eating() {
        System.out.println("Eating");
    }

    public void Drinking() {
        System.out.println("Drinking");
    }

    public void Running() {
        System.out.println("Running");
    }



    //Constructor Example


    //Default Constructor
    //Select Constructor then Select None
    //Also an Example of a Method
    public Student(){
        //Should Have the Same Name as Public Class
        //Increase ID by 1 every time I create an object from Student
        id++;
    }


    //Full State Constructor
    //Select Constructor then Select All
    //Also a Method Overloading Example
    public Student(String studentName, int studentAge, String studentColor, char studentSex) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentColor = studentColor;
        this.studentSex = studentSex;

        //Increase ID by 1 every time I create an object from Student
        id++;
    }

    /**
    //Another Example of Constructor
    //Also a Method Overloading Example
    public Student(String studentName, int studentAge, char studentSex) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentSex = studentSex;
    }
**/


    //Getters
    public String getStudentName() {
        //Returns value of private variable studentName
        return studentName;
    }

    public int getStudentAge() {
        //Returns value of private variable studentAge
        return studentAge;
    }

    public String getStudentColor() {
        //Returns value of private variable studentColor
        return studentColor;
    }

    public char getStudentSex() {
        //Returns value of private variable studentSex
        return studentSex;
    }

    public int getId() {
        return id;
    }



    //Setters
    public void setStudentName(String newStudentName) {
        //sets and adds value from outside input variable to the private variable
        this.studentName = newStudentName;
    }

    public void setStudentAge(int newStudentAge) {
        //sets and adds value from outside input variable to the private variable
        this.studentAge = newStudentAge;
    }

    public void setStudentColor(String newStudentColor) {
        //sets and adds value from outside input variable to the private variable
        this.studentColor = newStudentColor;
    }

    public void setStudentSex(char newStudentSex) {
        //sets and adds value from outside input variable to the private variable
        this.studentSex = newStudentSex;
    }

}
