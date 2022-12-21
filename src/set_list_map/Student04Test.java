package set_list_map;

import java.util.HashSet;
import java.util.Set;

public class Student04Test {
    public static void main(String[] args) {
        Set<Student04> students = new HashSet<>();
        Student04 student1 = new Student04("Minh", 1);
        Student04 student2 = new Student04("Thong", 2);
        Student04 student3 = new Student04("Uy", 3);
        Student04 student4 = new Student04("Luc", 4);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        for(Student04 student: students){
            System.out.println(student);
        }
    }
}
