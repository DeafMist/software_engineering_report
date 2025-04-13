package patterns.behavioral.command;

interface Command {
    void execute();
}

class Light {
    void turnOn() { System.out.println("Light is ON"); }
    void turnOff() { System.out.println("Light is OFF"); }
}

class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}

class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

class Main {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        control.setCommand(new LightOnCommand(new Light()));
        control.pressButton();
    }
}
