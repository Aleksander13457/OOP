interface Shape {

    void draw();

}

class Circle implements Shape {

    public void draw() {
        System.out.println("I am drawing a Circle!");
    }

}

class Rectangle implements Shape {

    public void draw() {
        System.out.println("I am drawing a Rectangle!");
    }

}

class Square implements Shape {

    public void draw() {
        System.out.println("I am drawing a Square!");
    }

}


class ShapeDrawer {

    private Shape shape;

    public ShapeDrawer(Shape shape) {
        this.shape = shape;
    }

    public void process() {
        System.out.println("Starting drawing choosen shape...");
        this.shape.draw();
        System.out.println("Shape has been drawed");
    }

}

class App1 {

    public static void main(String args[]) {

        Shape circle = new Circle();

        ShapeDrawer shapeDrawer = new ShapeDrawer(circle);

        shapeDrawer.process();

    }

}