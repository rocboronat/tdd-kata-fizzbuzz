package translations;

public interface Translation {
    boolean meetsCondition(Integer value);
    String translate(Integer value);
}
