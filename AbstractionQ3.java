abstract class Game {
    void play() {
        initialize();
        start();
        end();
    }
    abstract void initialize();
    abstract void start();
    abstract void end();
}

class Chess extends Game {
    void initialize() {
        System.out.println("Chess initialized");
    }
    void start() {
        System.out.println("Chess started");
    }
    void end() {
        System.out.println("Chess ended");
    }



}


public class AbstractionQ3 {
    public static void main(String[] args) {
        Game g = new Chess();

        g.play();
    }
}



