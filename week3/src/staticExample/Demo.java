package staticExample;

public class Demo {
    public static void method1() {
        System.out.println("Method 1 from DEMO");
    }

    public void method2() {
        System.out.println("Method 2 from DEMO");
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Sample();

        System.out.println("== Demo 1 ==");
        d1.method1();
        d1.method2();

        System.out.println("== Demo 2 ==");
        d2.method1();
        d2.method2();
    }
}
