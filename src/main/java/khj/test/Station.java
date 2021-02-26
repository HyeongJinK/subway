package khj.test;

import java.util.Arrays;
import java.util.List;

public class Station {
    private int idx;
    private String name;
    private List<Connect> connects;
    private List<Schedule> schedules;

    public List<Connect> getConnects() {
        return connects;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public Station(int idx, String name, List<Connect> connects) {
        this.idx = idx;
        this.name = name;
        this.connects = connects;
        this.schedules = Arrays.asList(new Schedule(13, 0), new Schedule(13, 5), new Schedule(13, 10), new Schedule(13, 15), new Schedule(13, 20), new Schedule(13, 25)
                , new Schedule(13, 30), new Schedule(13, 35), new Schedule(13, 40), new Schedule(13, 45), new Schedule(13, 50), new Schedule(13, 55)
                , new Schedule(14, 0), new Schedule(14, 5), new Schedule(14, 10), new Schedule(14, 15), new Schedule(14, 20), new Schedule(14, 25)
                , new Schedule(14, 30), new Schedule(14, 35), new Schedule(14, 40), new Schedule(14, 45), new Schedule(14, 50), new Schedule(14, 55)
                , new Schedule(15, 0), new Schedule(15, 5), new Schedule(15, 10), new Schedule(15, 15), new Schedule(15, 20), new Schedule(15, 25)
                , new Schedule(15, 30), new Schedule(15, 35), new Schedule(15, 40), new Schedule(15, 45), new Schedule(15, 50), new Schedule(15, 55));
    }

    public Station(int idx, String name, List<Connect> connects, List<Schedule> schedules) {
        this.idx = idx;
        this.name = name;
        this.connects = connects;
        this.schedules = schedules;
    }

    public Station(int idx, String name, List<Connect> connects, int train) {
        this.idx = idx;
        this.name = name;
        this.connects = connects;
        this.schedules = Arrays.asList(new Schedule(13, 0, train), new Schedule(13, 5, train), new Schedule(13, 10, train), new Schedule(13, 15, train), new Schedule(13, 20, train), new Schedule(13, 25, train)
                , new Schedule(13, 30, train), new Schedule(13, 35, train), new Schedule(13, 40, train), new Schedule(13, 45, train), new Schedule(13, 50, train), new Schedule(13, 55, train)
                , new Schedule(14, 0, train), new Schedule(14, 5, train), new Schedule(14, 10, train), new Schedule(14, 15, train), new Schedule(14, 20, train), new Schedule(14, 25, train)
                , new Schedule(14, 30, train), new Schedule(14, 35, train), new Schedule(14, 40, train), new Schedule(14, 45, train), new Schedule(14, 50, train), new Schedule(14, 55, train)
                , new Schedule(15, 0, train), new Schedule(15, 5, train), new Schedule(15, 10, train), new Schedule(15, 15, train), new Schedule(15, 20, train), new Schedule(15, 25, train)
                , new Schedule(15, 30, train), new Schedule(15, 35, train), new Schedule(15, 40, train), new Schedule(15, 45, train), new Schedule(15, 50, train), new Schedule(15, 55, train));
    }
}
