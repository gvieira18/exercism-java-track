import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class ResistorColorDuo {
    private final Map<String, Integer> colorEntries = Map.ofEntries(Map.entry("BLACK", 0), Map.entry("BROWN", 1), Map.entry("RED", 2), Map.entry("ORANGE", 3), Map.entry("YELLOW", 4), Map.entry("GREEN", 5), Map.entry("BLUE", 6), Map.entry("VIOLET", 7), Map.entry("GREY", 8), Map.entry("WHITE", 9));

    int value(String[] colors) {
        return Integer.parseInt(this.calculateActualResistance(colors));
    }

    private String calculateActualResistance(String[] colors) {
        return Arrays.stream(colors)
                .limit(2)
                .map(color -> this.colorEntries.get(color.toUpperCase()).toString())
                .collect(Collectors.joining());
    }
}
