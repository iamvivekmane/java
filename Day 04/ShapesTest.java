public class ShapesTest {
    public static void main(String[] args) {
        System.out.println("Triangle");
        Shape s1 = new Triangle(5, 10, 5);
        s1.calculateArea();
        s1.calculatePerimeter();
        s1.display();
        System.out.println("--------------");

        System.out.println("Rectangle");
        Shape s2 = new Rectangle(10, 5);
        s2.calculateArea();
        s2.calculatePerimeter();
        s2.display();
        System.out.println("--------------");

        System.out.println("Circle");
        Shape s3 = new Circle(7);
        s3.calculateArea();
        s3.calculatePerimeter();
        s3.display();
        System.out.println("--------------");

        System.out.println("Cube");
        Shape s4 = new Cube(4);
        s4.calculateArea();
        s4.calculatePerimeter();
        s4.display();
        System.out.println("--------------");

        System.out.println("Square");
        Shape s5 = new Square(5);
        s5.calculateArea();
        s5.calculatePerimeter();
        s5.display();
    }
}
