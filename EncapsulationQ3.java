//Create an Employee class where id is read-only (set only in the constructor) and department is read-write. Demonstrate that id cannot be modified after object creation.

class Employee{
    private final String id;  //read only
    private String department;
    
    public Employee(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }
}

public class EncapsulationQ3{
    public static void main(String[] args){
        Employee e = new Employee("E1234");
        e.setDepartment("IT Department");
        System.out.println("Employee ID: "+e.getId());
        System.out.println("Department: "+e.getDepartment());
    }
}


