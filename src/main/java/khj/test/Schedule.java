package khj.test;

public class Schedule {
    int hour;
    int min;
    int train;

    public Schedule(int hour, int min) {
        this.hour = hour;
        this.min = min;
    }

    public Schedule(int hour, int min, int train) {
        this.hour = hour;
        this.min = min;
        this.train = train;
    }
}
