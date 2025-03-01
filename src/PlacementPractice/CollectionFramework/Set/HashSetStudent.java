package PlacementPractice.CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

import PlacementPractice.CollectionFramework.Student;

public class HashSetStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Arpit",1);
        Student student2 = new Student("Sarap",2);
        Student student3 = new Student("Arpit",1);

        Set<Student> set = new HashSet<>();
        set.add(student3);
        set.add(student1);
        set.add(student2);

        for(Student a:set){
            System.out.println(a);
        }
    }
}