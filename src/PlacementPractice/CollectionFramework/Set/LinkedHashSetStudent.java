package PlacementPractice.CollectionFramework.Set;

import java.util.LinkedHashSet;
import java.util.Set;

import PlacementPractice.CollectionFramework.Classes.Student;

public class LinkedHashSetStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Arpit",1);
        Student student2 = new Student("Sarap",2);
        Student student3 = new Student("Arpit",1);

        Set<Student> set = new LinkedHashSet<>();
        set.add(student2);
        set.add(student1);
        set.add(student3);

        for(Student a:set){
            System.out.println(a);
        }
    }
}