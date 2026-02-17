class Parent{
    static{// runs once only when class loads
        System.out.println("Parent Static Block.");
    }
    //Instance- 
    {
        System.out.println("Parent Instance Block.");
    }
    //Constructor
    Parent(){
        System.out.println("Parent Constructor.");
    }
}
class Child extends Parent{
    static{
        System.out.println("Child Static Block.");
    }
    {
        System.out.println("Child Instance Block.");
    }
    Child(){
        System.out.println("Child Constructor.");
    }
}
public class InheritanceQ4{
    public static void main(String[] args){
        Child obj = new Child();
    }
}