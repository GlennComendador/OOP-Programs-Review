public class AccessModifiersExample {
    public static void main(String[] args) {
        /********* Access Modifiers *********/

        Student student1 = new Student("Lovely Nery", 24, "White", 'F');

        System.out.println(student1.getStudentName());
        System.out.println(student1.getStudentAge());
        System.out.println(student1.getStudentColor());
        System.out.println(student1.getStudentSex());
        System.out.println(student1.getId());

        System.out.println();

        Student student2 = new Student();

        student2.setStudentName("Glenn Comendador");
        student2.setStudentAge(26);
        student2.setStudentColor("Brown");
        student2.setStudentSex('M');
        
        System.out.println(student2.getStudentName());
        System.out.println(student2.getStudentAge());
        System.out.println(student2.getStudentColor());
        System.out.println(student2.getStudentSex());
        System.out.println(student2.getId());

    }
}
