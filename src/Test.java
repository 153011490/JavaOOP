import model.Student;

public class Test {
    public static void main(String[] args){
        Student student=new Student("Mike",12,"male",123456789L);
        System.out.println(student.getName()+","+student.getAge()+","+student.getSex()+","+student.getNumber());
    }
}
