//Create a Person class (name, age). Extend it with a Student class (studentId). Use the super keyword in the Student constructor to initialize the parent fields.

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}   

class Student extends Person {
    int studentId;
    Student(String name, int age, int studentId){
        super(name, age);
        this.studentId = studentId;
    }
    
    void display(){
        System.out.println(name+ " "+age+ " "+studentId);
    }
}


public class InheritanceQ2{
    public static void main(String[] args){
        Student s = new Student("Aditya", 21, 13265);
        s.display();
    }
}



