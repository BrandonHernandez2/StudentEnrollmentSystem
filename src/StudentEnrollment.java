public class StudentEnrollment {
    public static void main(String[] args) {

        Student student1 = new Student("12345", "John", "Doe", 20, "Computer Science");
        System.out.println(student1.toString());


        Student student2 = new Student("23456", "Jane", "Smith", 21, "Mathematics");
        System.out.println(student2.toString());

        Student student3 = new Student("34567", "Bob", "Johnson", 19, "Physics");
        System.out.println(student3.toString());

        System.out.println(" ");

        Student newStudent1 = new Student("12345", "John", "Doe", 20, "Data Science");
        System.out.println("Updated Major for " + newStudent1.toString());
    }
}