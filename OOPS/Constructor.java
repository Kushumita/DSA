public class Constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="ravi";
        s1.roll=123;
        Student s2=new Student(s1);
        System.out.println(s2.name+s2.roll);
    }
}
class Student{
    String name;
    int roll;
    Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
    }
    Student(){
        System.out.println("constructor is called");
    }
}
