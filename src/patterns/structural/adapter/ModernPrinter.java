package patterns.structural.adapter;

interface ModernPrinter {
    void print(String text);
}

class LegacyPrinter {
    void printDocument(String text) {
        System.out.println("Legacy Printer: " + text);
    }
}

class PrinterAdapter implements ModernPrinter {
    private final LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter printer) {
        this.legacyPrinter = printer;
    }

    @Override
    public void print(String text) {
        legacyPrinter.printDocument(text);
    }
}

class Main {
    public static void main(String[] args) {
        ModernPrinter printer = new PrinterAdapter(new LegacyPrinter());
        // теперь можем работать с интерфейсом
        printer.print("Hello Adapter");
    }
}
