public class BuzzTranslation implements Translation {
    @Override
    public boolean meetsCondition(Integer value) {
        return value % 5 == 0;
    }

    @Override
    public String translate(Integer value) {
        return "Buzz";
    }
}
