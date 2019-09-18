import framework.ConsoleKihonBase;
import java.util.Scanner;

public class ConsoleKihon extends ConsoleKihonBase {
    @Override
    protected void writeFooBarToTheConsole() {
        System.out.print("FooBar");
    }

    @Override
    protected void writeLineFooBarToTheConsole() {
        System.out.print("\n + FooBar");
    }

    @Override
    protected String readLineFromConsoleAndReturnValue() {
        throw new UnsupportedOperationException();
    }
}
