public class Lasagna {
    private final int MINUTES_TO_PREPARE_LAYER = 2;
    private int minutes;

    public Lasagna() {
        this.setMinutes(40);
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int expectedMinutesInOven() {
        return this.getMinutes();
    }

    public int remainingMinutesInOven(int minutes) {
        return this.expectedMinutesInOven() - minutes;
    }

    public int preparationTimeInMinutes(int totalOfLayers) {
        return this.MINUTES_TO_PREPARE_LAYER * totalOfLayers;
    }

    public int totalTimeInMinutes(int layers, int actualMinutes) {
        return this.preparationTimeInMinutes(layers) + actualMinutes;
    }
}
