public class Main { //This is the Class
    public static void main(String[] args) { //This is a Method

        //Method - block of code that only runs when called
        //You can pass data, known as parameters, into a method
        //Used to perform certain actions
        //Also known as functions
        //Must be declared within a class

        //Java will only run this Method unless other methods are called

        FirstMethod(); //This will be executed because it is called
        FirstMethod();

        String msg = "World!";
        int randomNumber = 2;
        boolean YesNo = true;

        ArgumentParameterExample(msg,randomNumber, YesNo /**Arguments will be inserted here**/);

        int result1 = SumTwoNumbers(1,2);
        double result2 = SumTwoNumbers(1.5,2.1,3.4);
        double result3 = SumTwoNumbers(1.1,2.2,3.3,4.4);
        //Need Variable to catch the returned result from the Method

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    //Another Method
    public static void FirstMethod(){
        //void means you don't want to return anything

        System.out.println("Hello");

    }

    public static void ArgumentParameterExample(String message, int randNum, boolean state /**Parameters will be inserted here**/){

        //Parameters are variables that are passed when calling the method
        System.out.println("Message: " + message + " Number: " + randNum + " Yes or No? " + state);
    }

    //Returning Types Example (No void)
    //String - returns string, int - returns int, etc.

    //Method that will add two numbers and will return the result
    public static int SumTwoNumbers(int num1, int num2){
        int result = num1 + num2;

        return result;
    }

    //Method Overloading Example
    //Same Method Name but Different Parameters
    public static double SumTwoNumbers(double num1, double num2, double num3){
        double result = num1 + num2 + num3;

        return result;
    }

    //Another Example of Method Overloading
    //Same Method Name but with additional Parameters
    public static double SumTwoNumbers(double num1, double num2, double num3, double num4){
        double result = num1 + num2 + num3 + num4;

        return result;
    }


}