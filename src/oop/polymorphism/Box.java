package oop.polymorphism;

class Box<T> {
    private final T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(10);
        System.out.println(intBox.getContent());

        Box<String> stringBox = new Box<>("Hello");
        System.out.println(stringBox.getContent());
    }
}
