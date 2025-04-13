package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

interface Graphic {
    void draw();
}

class Circle implements Graphic {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Graphic {
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class CompositeGraphic implements Graphic {
    private final List<Graphic> graphics = new ArrayList<>();

    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    public void draw() {
        for (Graphic graphic : graphics) {
            graphic.draw();
        }
    }
}

class Main {
    public static void main(String[] args) {
        CompositeGraphic composite = new CompositeGraphic();
        composite.add(new Circle());
        composite.add(new Square());
        composite.draw();
    }
}
