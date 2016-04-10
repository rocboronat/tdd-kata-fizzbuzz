package translations;

public class CommonTranslation implements Translation {
    @Override
    public boolean meetsCondition(Integer value) {
        return true;
    }

    @Override
    public String translate(Integer value) {
        return Integer.toString(value);
    }
}
