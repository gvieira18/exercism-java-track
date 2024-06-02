import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(this.birdsPerDay).filter(day -> day == 0).findAny().isPresent();
    }

    public int getCountForFirstDays(int numberOfDays) {
        return Arrays.stream(this.birdsPerDay).limit(numberOfDays).sum();
    }

    public int getBusyDays() {
        return Math.toIntExact(Arrays.stream(this.birdsPerDay).filter(day -> day >= 5).count());
    }
}
