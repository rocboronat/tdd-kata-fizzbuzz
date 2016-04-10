import translations.*;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzTranslator {

    private List<Translation> translations = new ArrayList(Arrays.asList(
            new FizzBuzzTranslation(),
            new FizzTranslation(),
            new BuzzTranslation(),
            new CommonTranslation()));

    public String translate(int input) {
        if (input <= 0) {
            throw new InvalidParameterException();
        }

        for (Translation translation : translations) {
            if (translation.meetsCondition(input)) {
                return translation.translate(input);
            }
        }
        throw new RuntimeException("There is any translator to translate this value");
    }
}
