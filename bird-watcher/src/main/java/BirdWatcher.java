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
        for (int birdsCount : this.birdsPerDay) {
            if (birdsCount == 0) {
                return true;
            }
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        int days = Math.min(numberOfDays, this.birdsPerDay.length);

        for (int i = 0; i < days; i++) {
            total += this.birdsPerDay[i];
        }

        return total;
    }

    public int getBusyDays() {
        int busyDaysCount = 0;

        for (int day : this.birdsPerDay) {
            if (day >= 5) {
                busyDaysCount++;
            }
        }

        return busyDaysCount;
    }
}
