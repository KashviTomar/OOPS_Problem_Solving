
class MathUtil {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}


class AdvancedMath extends MathUtil {
    int add(int a, int b) {
        return a + b + 10;  
      
    }
  
}
public class PolymorphismQ3 {
     public static void main(String[] args) {
        MathUtil m = new AdvancedMath();
        System.out.println(m.add(2, 3));       
        System.out.println(m.add(2.5, 3.5));   
    }
    
}
