public class FizzBuzzTranslation implements Translation {
    @Override
    public boolean meetsCondition(Integer value) {
        return value % 3 == 0 && value % 5 == 0;
    }

    @Override
    public String translate(Integer value) {
        return "FizzBuzz";
    }
}
