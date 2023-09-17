package shapes;

public class Rectangle extends Shape {
    public int height;
    public int width;

    public Rectangle(String color) {
        super(color);
        System.out.println("Inside Rectangle constructor with one argument");
    }

    public Rectangle(String name, int width, int height) {
        this(name);
        this.width = width;
        this.height = height;
        System.out.println("Inside Rectangle constructor with three arguments");
    }

    // ToString demo
    // @Override
    // public String toString() {
    //     return "Rectangle with [ width = " + width + ", height = " + height + "]";
    // }

    public static void main(String[] args) {
        Rectangle r = new Rectangle("red", 10, 20);
        // tostring demo
        //System.out.println(r);
    }
}
