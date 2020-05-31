package Generics;

// Student class that inherits from Person interface
public class Student implements Person {

    String id;
    String name;
    int age;

    // default constructor
    public Student(String identification, String nme, int ag){
        this.id = identification;
        this.name = nme;
        this.age = ag;
    }

    protected int studyHours(){ return age/2;}
    public String getId(){ return id;}
    public String getName(){ return name;}
    public int getAge(){ return age;}

    public boolean equalTo(Person other){
        Student otherStudent = (Student) other;
        return (id.equals(otherStudent.getId())); // compare id of person and student
    }

    public String toString(){
        return "Student ID: " + this.id + "\nName: " + this.name + "\nAge: " + this.age;
    }

}
