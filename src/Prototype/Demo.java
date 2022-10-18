package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 15;
        circle.radius = 21;
        circle.color = "blue";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 13;
        rectangle.height = 13;
        rectangle.color = "red";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Это разные объекты");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": Они идентичны");
                } else {
                    System.out.println(i + ": Они не идентичны");
                }
            } else {
                System.out.println(i + ": Объекты одинаковые!");
            }
        }
    }
}
