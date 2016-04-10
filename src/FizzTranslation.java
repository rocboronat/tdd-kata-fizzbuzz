public class FizzTranslation implements Translation {
    @Override
    public boolean meetsCondition(Integer value) {
        return value % 3 == 0;
    }

    @Override
    public String translate(Integer value) {
        return "Fizz";
    }
}
