import java.util.Objects;

public class Twofer {
    public String twofer(String name) {
        return "One for " + (!Objects.isNull(name) ? name : "you") + ", one for me.";
    }
}
