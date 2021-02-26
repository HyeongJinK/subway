package khj.test;

import khj.test.data.StationData;
import khj.test.data.TrainData;

import java.util.Arrays;
import java.util.HashMap;

public class App
{
    static HashMap<Integer, Station> stationList;
    static HashMap<Integer, Train> trainHashMap;
    static long[] min = new long[300];
    static TrainData trainData = new TrainData();
    static int train;

    public static void main( String[] args )
    {
        final int START = 200;
        final int END = 212;


        StationData stationData = new StationData();
        stationList = stationData.getStationHashMap();
        trainHashMap = trainData.getTrainHashMap();
        Arrays.fill(min, 99999);


        min[START] = 0;
        //start(START, END, 0, 0, "");
        start2(START, END, 0, 0, "", 12, 57, true);
    }

    static void start2(int start, int end, int weight, int tr, String path, int hour, int mi, boolean ride) {
        Station station = stationList.get(start);

        if (ride) { // 처음 혹은 환승시 열차 시간표에 맞게 시간 추가
            for (Schedule sc : station.getSchedules()) {
                if (sc.hour == hour && sc.min >= mi) {
                    weight += (sc.min - mi);
                    train = sc.train;
                    break;
                } else if (sc.hour > hour) {
                    weight += ((sc.hour - hour) * 60 + (sc.min - mi));
                    train = sc.train;
                    break;
                }
            }
        }

        for (Connect connect : station.getConnects()) {
            Train st = trainHashMap.get(train);
            Boolean test = st.possibleStations.get(connect.idx);

            if (test != null && test) {
                int w = weight + connect.weight;
                if (w < min[connect.idx]) {
                    min[connect.idx] = w;   // 현재 위치까지 오는 데 걸린 가중치 저장

                    if (connect.transfer) { // 환승 카운트
                        ++tr;
                    }

                    if (connect.idx == end) {   // 도착지에 도착했을 경우
                        path += connect.idx;
                        resultPrint(tr, path, w);
                    } else {
                        path += start + " - ";
                        int resultM = mi + connect.weight;
                        if (resultM >= 60) {    // 시간 설정
                            hour += 1;
                            resultM -= 60;
                        }
                        start2(connect.idx, end, w, tr, path, hour, resultM, connect.transfer);
                    }
                } else {
                }
            } else {    // 해당 경로가 더 이상 갈 수 없을 때 다음 열차를 탄다.
                ++tr;
                int resultM = mi + 1;
                if (resultM >= 60) {    // 시간 설정
                    hour += 1;
                    resultM -= 60;
                }
                start2(start, end, weight, tr, path, hour, resultM, true);
            }
        }
    }


    static void start(int start, int end, int weight, int tr, String path, int hour, int mi, boolean ride) {
        Station station = stationList.get(start);

        if (ride) { // 처음 혹은 환승시 열차 시간표에 맞게 시간 추가
            for (Schedule sc : station.getSchedules()) {
                if (sc.hour == hour && sc.min >= mi) {
                    weight += (sc.min - mi);
                    break;
                } else if (sc.hour > hour) {
                    weight += ((sc.hour - hour) * 60 + (sc.min - mi));
                    break;
                }
            }
        }

        for (Connect connect : station.getConnects()) {
            int w = weight + connect.weight;
            if (w < min[connect.idx]) {
                min[connect.idx] = w;   // 현재 위치까지 오는 데 걸린 가중치 저장

                if (connect.transfer) { // 환승 카운트
                    ++tr;
                }

                if (connect.idx == end) {   // 도착지에 도착했을 경우
                    path += connect.idx;
                    resultPrint(tr, path, w);
                } else {
                    path += start + " - ";
                    int resultM = mi + connect.weight;
                    if (resultM >= 60) {    // 시간 설정
                        hour += 1;
                        resultM -= 60;
                    }
                    start(connect.idx, end, w, tr, path, hour, resultM, connect.transfer);
                }
            } else {
            }
        }
    }

    static void start(int start, int end, int weight, int tr, String path) {
        Station station = stationList.get(start);
        for (Connect connect : station.getConnects()) {
            int w = weight + connect.weight;
            if (w < min[connect.idx]) {
                if (connect.transfer) ++tr;
                min[connect.idx] = w;
                if (connect.idx == end) {
                    path += connect.idx;
                    resultPrint(tr, path, w);
                } else {
                    path += start + " - ";
                    start(connect.idx, end, w, tr, path);
                }
            } else {
            }
        }
    }

    private static void resultPrint(int tr, String path, int w) {
        System.out.print("가중치: " + w);
        System.out.println("  환승: " + tr);
        System.out.println(path);
    }
}
