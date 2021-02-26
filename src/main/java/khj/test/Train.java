package khj.test;

import java.util.HashMap;
import java.util.List;

public class Train {
    int idx;
    Line line;
    String name;
    List<Integer> possibleStation;
    HashMap<Integer, Boolean> possibleStations = new HashMap<>();

    public Train(int idx, Line line, String name, List<Integer> possibleStation) {
        this.idx = idx;
        this.line = line;
        this.name = name;
        this.possibleStation = possibleStation;
        for(Integer station : possibleStation) {
            possibleStations.put(station, true);
        }
    }

    public int getIdx() {
        return idx;
    }

    public Line getLine() {
        return line;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getPossibleStation() {
        return possibleStation;
    }

    public HashMap<Integer, Boolean> getPossibleStations() {
        return possibleStations;
    }
}
