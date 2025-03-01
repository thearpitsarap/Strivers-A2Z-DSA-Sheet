package PlacementPractice.CollectionFramework;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Arpit",1);
        Student student2 = new Student("Sarap",2);
        Student student3 = new Student("Patil",3);

        Set<Student> set = new TreeSet<Student>(
            new Comparator<Student>(){
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.name.compareTo(o2.name);
                };
            }
            // (s1,s2)->s1.name.compareTo(s2.name)
        );

        set.add(student3);
        set.add(student1);
        set.add(student2);

        for(Student a:set){
            System.out.println(a);
        }
    }
}