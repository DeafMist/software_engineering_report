package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class NewsSubscriber implements Observer {
    private final String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received news: " + message);
    }
}

class NewsPublisher {
    private final List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String news) {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
}

class Main {
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();
        publisher.subscribe(new NewsSubscriber("John"));
        publisher.subscribe(new NewsSubscriber("Katy"));
        publisher.notifyObservers("Java 21 released!");
    }
}
