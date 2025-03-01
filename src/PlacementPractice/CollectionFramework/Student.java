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
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj==null || !(obj instanceof Student)){
            return false;
        }

        Student student = (Student)obj;
        return (this.name==student.name && this.rollno==student.rollno);
    }

    @Override
    public int hashCode(){
        System.out.println("Hash Called " + Objects.hash(rollno,name));
        return Objects.hash(rollno,name);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollno=" + rollno + "]";
    }
}