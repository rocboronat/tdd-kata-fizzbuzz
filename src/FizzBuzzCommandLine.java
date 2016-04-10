import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class will be useful to showcase how to test an app without a testing class.
 * That's how people who are not used to unit testing are used to work: input a
 * value by keyboard (or his client code) and review it using their human-force powered eyes.
 */
public class FizzBuzzCommandLine {
    public static void main(String[] args) {
        System.out.println("Hello! Welcome to FizzBuzzTranslator!");
        System.out.print("Input a value and I'll convert to its FizzBuzz value: ");

        String input = readValueFromConsoleInput();

        FizzBuzzTranslator translator = new FizzBuzzTranslator();
        String translatedValue = translator.translate(Integer.parseInt(input));

        System.out.println("The translated value is: " + translatedValue);
    }

    private static String readValueFromConsoleInput() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }
}
