import java.util.Arrays;
import java.util.stream.Collectors;

class ResistorColorDuo {
    private enum Color {
        BLACK(0),
        BROWN(1),
        RED(2),
        ORANGE(3),
        YELLOW(4),
        GREEN(5),
        BLUE(6),
        VIOLET(7),
        GREY(8),
        WHITE(9);

        private final int value;

        Color(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    int value(String[] colors) {
        return Integer.parseInt(this.getResistanceValue(colors));
    }

    private String getResistanceValue(String[] colors) {
        return Arrays.stream(colors)
                .limit(2)
                .map(color -> String.valueOf(Color.valueOf(color.toUpperCase()).getValue()))
                .collect(Collectors.joining());
    }
}
