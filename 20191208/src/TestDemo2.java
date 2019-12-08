import java.util.ArrayList;
import java.util.List;
class   Student{
    public  String name ;
    public  String Class;
    public  double score;
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Class='" + Class + '\'' +
                ", score=" + score +
                '}';
    }
    public Student(String name , String Class, double score){
        this.name = name ;
        this.Class =Class;
        this.score = score;
    }
}
public class TestDemo2 {

    public static void main(String[] args) {

       List<Student> list = new ArrayList<>();
        list.add(new Student("你好","20ban",10.2));
        list.add(new Student("你好","20ban",10.2));
        list.add(new Student("你好","20ban",10.2));
        for (Student student:list) {
            System.out.println(student);
        }
    }
}

