
//Easy: Create a Student class with private fields name and age. Implement public getters and setters to access and update these fields.
class Student{
    private String name;
    private int age; 
    
    //Getter:
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    // Setter:
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    
}

public class EncapsulationQ1{
    public static void main(String args[]){
        Student obj = new Student();
        obj.setName("Rahul");
        obj.setAge(21);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
