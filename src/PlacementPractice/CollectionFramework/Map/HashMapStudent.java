package PlacementPractice.CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import PlacementPractice.CollectionFramework.Classes.School;
import PlacementPractice.CollectionFramework.Classes.Student;

public class HashMapStudent {
    public static void main(String[] args) {

        School s1 = new School("Dexter", 1);
        School s2 = new School("Mirza", 2);
        School s3 = new School("Mirza", 2);

        Student student1 = new Student("Arpit",1);
        Student student2 = new Student("Sarap",2);
        Student student3 = new Student("Patil",3);

        Map<School,Student> map = new HashMap<>();

        map.put(s1,student3);
        map.put(s2,student1);
        map.put(s3,student2);

        Set<School> set = map.keySet();

        for(School a:set){
            System.out.println(a + " " + map.get(a));
        }
    }
}