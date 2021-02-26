package khj.test;

import java.util.Arrays;
import java.util.HashMap;

public class App
{
    static HashMap<Integer, SubwayStation> stationList;
    static long[] min = new long[300];

    public static void main( String[] args )
    {
        Data data = new Data();
        stationList = data.getStationHashMap();
        Arrays.fill(min, 99999);

        min[1] = 0;
        //start(1, 100, 0, 0, "");
        start(1, 100, 0, 0, "", 12, 58);
    }
    static void start(int start, int end, int weight, int tr, String path, int hour, int mi) {
        SubwayStation station = stationList.get(start);

        if (station.getSchedules() != null) {
            for (Schedule sc : station.getSchedules()) {
                if (sc.hour == hour && sc.min >= mi) {
                    weight += (sc.min - mi);
                    break;
                } else if (sc.hour > hour) {
                    weight += ((sc.hour - hour) * 60 + (sc.min - mi));
                }
            }
        }

        for (Connect connect : station.getConnects()) {
            int w = weight + connect.weight;
            if (w < min[connect.idx]) {
                if (connect.transfer) ++tr;
                min[connect.idx] = w;
                if (connect.idx == end) {
                    path += connect.idx;
                    System.out.print("가중치: " + w);
                    System.out.println("  환승: " + tr);
                    System.out.println(path);
                } else {
                    path += start + " - ";
                    start(connect.idx, end, w, tr, path);
                }
            } else {
            }
        }
    }

    static void start(int start, int end, int weight, int tr, String path) {
        SubwayStation station = stationList.get(start);
        for (Connect connect : station.getConnects()) {
            int w = weight + connect.weight;
            if (w < min[connect.idx]) {
                if (connect.transfer) ++tr;
                min[connect.idx] = w;
                if (connect.idx == end) {
                    path += connect.idx;
                    System.out.print("가중치: " + w);
                    System.out.println("  환승: " + tr);
                    System.out.println(path);
                } else {
                    path += start + " - ";
                    start(connect.idx, end, w, tr, path);
                }
            } else {
            }
        }
    }
}
