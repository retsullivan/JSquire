import framework.ConsoleKihonBase;
import java.util.Scanner;

public class ConsoleKihon extends ConsoleKihonBase {
    @Override
    protected void writeFooBarToTheConsole() {
        System.out.print("FooBar");
    }

    @Override
    protected void writeLineFooBarToTheConsole() {
        System.out.println("FooBar");
    }

    @Override
    protected String readLineFromConsoleAndReturnValue() {
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            return input;
        }
}
