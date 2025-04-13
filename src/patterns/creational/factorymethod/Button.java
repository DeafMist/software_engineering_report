package patterns.creational.factorymethod;

interface Button {
    void render();
}

class WindowsButton implements Button {
    public void render() {
        System.out.println("Render Windows button");
    }
}

class HtmlButton implements Button {
    public void render() {
        System.out.println("Render HTML button");
    }
}

abstract class Dialog {
    abstract Button createButton();

    void renderWindow() {
        Button button = createButton();
        button.render();
    }
}

class WindowsDialog extends Dialog {
    Button createButton() {
        return new WindowsButton();
    }
}

class WebDialog extends Dialog {
    Button createButton() {
        return new HtmlButton();
    }
}

class Main {
    public static void main(String[] args) {
        Dialog windowsDialog = new WindowsDialog();
        // создает button класса WindowsButton и вызывает на нем render()
        windowsDialog.renderWindow();

        Dialog webDialog = new WebDialog();
        // создает button класса HtmlButton и вызывает на нем render()
        webDialog.renderWindow();
    }
}
