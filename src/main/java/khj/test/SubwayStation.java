package khj.test;

import java.util.List;

public class SubwayStation {
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

    public SubwayStation(int idx, String name, List<Connect> connects) {
        this.idx = idx;
        this.name = name;
        this.connects = connects;
    }

    public SubwayStation(int idx, String name, List<Connect> connects, List<Schedule> schedules) {
        this.idx = idx;
        this.name = name;
        this.connects = connects;
        this.schedules = schedules;
    }
}
