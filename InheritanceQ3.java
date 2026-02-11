class Rectangle {
    int length, width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    int getArea() {
        return length * width;
    }
}

class Box extends Rectangle {
    int height;

    Box(int l, int w, int h) {
        super(l, w);
        height = h;
    }

    // overriding
    int getArea() {
        return 2 * (length*width + width*height + height*length);
    }
}

public class InheritanceQ3 {
    public static void main(String[] args) {
        Box b = new Box(2, 3, 4);
        System.out.println(b.getArea());
    }
}
