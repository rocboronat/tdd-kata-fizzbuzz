import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzTranslatorTest {

    FizzBuzzTranslator translator;

    @Before
    public void setUp() {
        translator = new FizzBuzzTranslator();
    }

    @Test(expected = InvalidParameterException.class)
    public void shouldReturnIllegalParameterException_forInput0() {
        int input = 0;
        translator.translate(input);
    }

    @Test(expected = InvalidParameterException.class)
    public void shouldReturnIllegalParameterException_forMinus1() {
        int input = -1;
        translator.translate(input);
    }

    @Test
    public void shouldReturn1_forInput1() {
        int input = 1;
        String result = translator.translate(input);
        assertEquals("1", result);
    }

    @Test
    public void shouldReturn2_forInput2() {
        int input = 2;
        String result = translator.translate(input);
        assertEquals("2", result);
    }


    @Test
    public void shouldReturnFizz_forInput3() {
        int input = 3;
        String result = translator.translate(input);
        assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzz_forInput5() {
        int input = 5;
        String result = translator.translate(input);
        assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnFizz_forInput6() {
        int input = 6;
        String result = translator.translate(input);
        assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnFizz_forInput9() {
        int input = 9;
        String result = translator.translate(input);
        assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzz_forInput10() {
        int input = 10;
        String result = translator.translate(input);
        assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnFizzBuzz_forInput15() {
        int input = 15;
        String result = translator.translate(input);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void shouldReturnFizzBuzz_forInput30() {
        int input = 30;
        String result = translator.translate(input);
        assertEquals("FizzBuzz", result);
    }
}