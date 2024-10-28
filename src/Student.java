public class Student{
    private String studentId;
    private String firstName;
    private String lastName;
    private int age;
    private String major;

    public Student(){
        studentId = "Unknown";
        firstName = "Unknown";
        lastName ="Unknown";
        age = 0;
        major = "Unknown";
    }

    public Student(String studentId, String firstName, String lastName, int age, String major) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.major = major;
    }

    public String getStudentId(){
        return studentId;
    }

    public void setStudentId(){
        this.studentId = studentId;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(){
        this.firstName = firstName;
    }

    public  String getLastName(){
        return lastName;
    }

    public void setLastName(){
        this.lastName = lastName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(){
        this.age = age;
    }

    public String getMajor(){
        return major;
    }

    public void setMajor(){
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + firstName + " " + lastName + ", Age: " + age + ", Major: " + major;
    }
}

