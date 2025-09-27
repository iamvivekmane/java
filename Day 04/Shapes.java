abstract class Shape {
    int side;
    double area;
    double perimiter;

    abstract void calculateArea();

    abstract void calculatePerimeter();

    void display() {
        System.out.printf("Area         :   %.2f\n", area);
        System.out.printf("Perimiter    :   %.2f\n", perimiter);
    }
}

class Triangle extends Shape {
    int base;
    int height;

    Triangle(int s, int b, int h) {
        this.side = s;
        this.base = b;
        this.height = h;
    }

    void calculateArea() {
        area = 0.5f * base * height;
    }

    void calculatePerimeter() {
        perimiter = side + base + height;
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    void calculateArea() {
        area = length * breadth;
    }

    void calculatePerimeter() {
        perimiter = 2 * (length + breadth);
    }

}

class Circle extends Shape {
    int radius;

    Circle(int r) {
        this.radius = r;
    }

    void calculateArea() {
        area = Math.PI * (radius * radius);
    }

    void calculatePerimeter() {
        perimiter = 2 * Math.PI * radius;
    }

}

class Cube extends Shape {
    Cube(int s) {
        this.side = s;
    }

    void calculateArea() {
        area = 6 * (side * side);
    }

    void calculatePerimeter() {
        perimiter = 12 * side;
    }

}

class Square extends Shape {
    Square(int s) {
        this.side = s;
    }

    void calculateArea() {
        area = side * side;
    }

    void calculatePerimeter() {
        perimiter = 4 * side;
    }

}
