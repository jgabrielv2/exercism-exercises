import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }


    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[6] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay).anyMatch(quantidade -> quantidade == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays > 7) numberOfDays = 7;
        return Arrays.stream(birdsPerDay, 0, numberOfDays).sum();
    }

    public int getBusyDays() {
        return (int) Arrays.stream(birdsPerDay).filter(quantidade -> quantidade >= 5).count();
    }
}
