//Create an Animal class with a method sound(). Override this in Dog ("Bark") and Cat ("Meow"). Instantiate both as Animal types and call sound().
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
      
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
      
    }
}



public class PolymorphismQ1 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.sound();
        a2.sound();
    }

}
