//Create an abstract class Appliance with a concrete method plugIn() and an abstract method work(). Implement work() in a Microwave subclass.

abstract class Appliance {

    void plugIn() {
        System.out.println("Appliance plugged in");
      
    }
    abstract void work();
}
class Microwave extends Appliance {
    void work() {
        System.out.println("Heating food");
    }
}
public class AbstractionQ1 {
    public static void main(String[] args) {
        Microwave m = new Microwave();
        m.plugIn();
        m.work();
    }
  
}

