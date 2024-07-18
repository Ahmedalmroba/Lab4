public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 8);

        System.out.println(" Height: " + rectangle.getHeight());
        System.out.println(" Width: " + rectangle.getWidth());
        rectangle.setHeight(6);
        rectangle.setWidth(10);
        System.out.println("Updated Height: " + rectangle.getHeight());
        System.out.println("Updated Width: " + rectangle.getWidth());
        double area1 = rectangle.calculateArea();
        System.out.println("Area: " + area1);
        double circumference1 = rectangle.calculateCircumference();
        System.out.println("Circumference: " + circumference1);

        System.out.println("...................................................");

                Circle circle = new Circle(6);

                System.out.println(" Radius: " + circle.getRadius());
                circle.setRadius(7.0);
                System.out.println("Updated Radius: " + circle.getRadius());
                double area2 = circle.calculateArea();
                System.out.println("Area: " + area2);
                double circumference2 = circle.calculateCircumference();
                System.out.println("Circumference: " + circumference2);

        System.out.println("...................................................");

        Triangle triangle = new Triangle(5, 7);

        System.out.println(" Height: " + triangle.getHeight());
        System.out.println(" Base: " + triangle.getBase());
        triangle.setHeight(6);
        triangle.setBase(9);
        System.out.println("Updated Height: " + triangle.getHeight());
        System.out.println("Updated Base: " + triangle.getBase());
        double area3 = triangle.calculateArea();
        System.out.println("Area: " + area3);
        double circumference3 = triangle.calculateCircumference();
        System.out.println("Circumference: " + circumference3);}}










