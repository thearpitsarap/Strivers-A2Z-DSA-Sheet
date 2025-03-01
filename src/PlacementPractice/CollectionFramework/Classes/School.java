package PlacementPractice.CollectionFramework.Classes;

import java.util.Objects;

public class School implements Comparable<School>{
    public String name;
    int code;

    School(){}

    public School(String name, int code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public int compareTo(School obj){
        return this.code-obj.code;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null && !(obj instanceof School)) return false;
        
        School school = (School) obj;
        System.out.println("Equals called "+school);
        return (this.name.equals(school.name) && this.code==school.code);

    }

    @Override
    public int hashCode(){
        System.out.println("Hascode Called"+" "+Objects.hash(this.code,this.name));
        return Objects.hash(this.code,this.name);
    }

    @Override
    public String toString() {
        return "School [name=" + name + ", code=" + code + "]";
    }
}