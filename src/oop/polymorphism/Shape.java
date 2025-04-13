package oop.polymorphism;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

class ShapeMain {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Square());
        for (Shape shape : shapes) {
            // безопасно, так как каждый наследник класса oop.polymorphism.Shape имеет метод draw()
            shape.draw();
        }
    }
}
