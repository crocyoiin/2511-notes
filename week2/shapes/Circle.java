package shapes;

public class Circle extends Shape {
    private static final double pi = 3.14159;
    private static int circleCount = 0;
    private int coolNum = 0;

    // Everytime a circle is created, circleCount should increment for all circles
    // coolNum should only increment per instance so will always return '1'
    public Circle(String color) {
        super(color);
        circleCount++;
        coolNum++;
    }

    // static method to get pi means we can get it without making an instance of circle
    public static double getPi() {
        return pi;
    }

    // gets coolNum 
    public int getCircleCount() {
        return circleCount;
    }

    public int getNum() {
        return coolNum;
    }

    public static void main(String[] args) {
        System.out.println("I can print pi without making an instance of a circle! " + Circle.getPi());

        Circle c1 = new Circle("red");
        System.out.println("c1 circleCount: " + c1.getCircleCount());
        System.out.println("c1 coolNum: " + c1.getNum());

        Circle c2 = new Circle("blue");
        System.out.println("c2 circleCount: " + c2.getCircleCount());
        System.out.println("c2 coolNum: " + c2.getNum());

        Circle c3 = new Circle("green");
        System.out.println("c3 circleCount: " + c3.getCircleCount());
        System.out.println("c3 coolNum: " + c3.getNum());
        
    }
}
