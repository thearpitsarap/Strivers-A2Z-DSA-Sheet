package PlacementPractice.CollectionFramework;

import java.util.Objects;

public class Student implements Comparable<Student>{
    public String name;
    public int rollno;

    Student(){}

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public int compareTo(Student obj){
        return this.rollno-obj.rollno;
    }

    @Override
    public int hashCode(){
        System.out.println("Hash Called");
        return Objects.hash(rollno,name);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollno=" + rollno + "]";
    }
}