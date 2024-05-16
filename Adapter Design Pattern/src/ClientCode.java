// Client
public class ClientCode {
    public static void main(String[] args) {
        LegacyPrinter legacyPrinter = new LegacyPrinter();
        Printer modernPrinter = new PrinterAdapter(legacyPrinter);

        modernPrinter.print("Hello, World!");
    }
}
