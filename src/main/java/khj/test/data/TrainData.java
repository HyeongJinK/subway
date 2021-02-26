package khj.test.data;

import khj.test.Line;
import khj.test.Train;

import java.util.*;

public class TrainData {
    HashMap<Integer, Train> trainHashMap = new HashMap<>();


    public TrainData() {
        Line line1 = new Line(1, "1호선");
        Line line2 = new Line(2, "2호선");
        Line line3 = new Line(3, "3호선");
        List<Train> trainList = new ArrayList<>();
        /**
            , Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49
                ,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98)));
         **/
        /**
         * 1호선
         * 급행 4개 특급 1개 생략
         * */
        trainList.add(new Train(100, line1, "소요산 - 인천"
                , Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49
                ,50,51,52,53,54,55,56,57,58,59,60,61,62)));
        trainList.add(new Train(101, line1, "동두천 - 인천"
                , Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49
                ,50,51,52,53,54,55,56,57,58,59,60,61,62)));
        trainList.add(new Train(102, line1, "양주 - 인천"
                , Arrays.asList(8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49
                ,50,51,52,53,54,55,56,57,58,59,60,61,62)));
        trainList.add(new Train(103, line1, "의정부 - 인천"
                , Arrays.asList(11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49
                ,50,51,52,53,54,55,56,57,58,59,60,61,62)));
        trainList.add(new Train(104, line1, "창동 - 인천"
                , Arrays.asList(17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49
                ,50,51,52,53,54,55,56,57,58,59,60,61,62)));
        trainList.add(new Train(105, line1, "광운대 - 인천"
                , Arrays.asList(20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49
                ,50,51,52,53,54,55,56,57,58,59,60,61,62)));
        trainList.add(new Train(106, line1, "동묘앞 - 인천"
                , Arrays.asList(28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49
                ,50,51,52,53,54,55,56,57,58,59,60,61,62)));
        trainList.add(new Train(107, line1, "구로 - 인천"
                , Arrays.asList(42,43,44,45,46,47,48,49
                ,50,51,52,53,54,55,56,57,58,59,60,61,62)));

        trainList.add(new Train(108, line1, "의정부 - 서동탄"
                , Arrays.asList(11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42
                ,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79,80)));
        trainList.add(new Train(109, line1, "창동 - 서동탄"
                , Arrays.asList(17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42
                ,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79,80)));
        trainList.add(new Train(110, line1, "광운대 - 서동탄"
                , Arrays.asList(20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42
                ,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79,80)));
        trainList.add(new Train(111, line1, "청량리 - 서동탄"
                , Arrays.asList(25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42
                ,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79,80)));
        trainList.add(new Train(112, line1, "동묘앞 - 서동탄"
                , Arrays.asList(28,29,30,31,32,33,34,35,36,37,38,39,40,41,42
                ,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79,80)));
        trainList.add(new Train(113, line1, "구로 - 서동탄"
                , Arrays.asList(42,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79,80)));

        trainList.add(new Train(114, line1, "의정부 - 병점"
                , Arrays.asList(11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42
                ,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79)));
        trainList.add(new Train(115, line1, "창동 - 병점"
                , Arrays.asList(17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42
                ,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79)));
        trainList.add(new Train(116, line1, "광운대 - 병점"
                , Arrays.asList(20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42
                ,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79)));
        trainList.add(new Train(117, line1, "청량리 - 병점"
                , Arrays.asList(25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42
                ,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79)));
        trainList.add(new Train(118, line1, "동묘앞 - 병점"
                , Arrays.asList(28,29,30,31,32,33,34,35,36,37,38,39,40,41,42
                ,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79)));
        trainList.add(new Train(119, line1, "구로 - 병점"
                , Arrays.asList(42,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79)));

        trainList.add(new Train(120, line1, "광운대 - 천안"
                , Arrays.asList(20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42
                ,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79,81,82,83,84,85,86,87,88,89,90,91,92)));
        trainList.add(new Train(121, line1, "청량리 - 천안"
                , Arrays.asList(25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42
                ,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79,81,82,83,84,85,86,87,88,89,90,91,92)));
        trainList.add(new Train(122, line1, "구로 - 천안"
                , Arrays.asList(42,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79,81,82,83,84,85,86,87,88,89,90,91,92)));
        trainList.add(new Train(123, line1, "병점 - 천안"
                , Arrays.asList(79,81,82,83,84,85,86,87,88,89,90,91,92)));

        trainList.add(new Train(124, line1, "광운대 - 신창"
                , Arrays.asList(20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42
                ,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98)));
        trainList.add(new Train(125, line1, "청량리 - 신창"
                , Arrays.asList(25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42
                ,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98)));
        trainList.add(new Train(126, line1, "구로 - 신창"
                , Arrays.asList(42,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98)));
        trainList.add(new Train(127, line1, "병점 - 신창"
                , Arrays.asList(79,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98)));

        trainList.add(new Train(128, line1, "소요산 - 구로"
                , Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42)));
        trainList.add(new Train(129, line1, "동두천 - 구로"
                , Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42)));
        trainList.add(new Train(130, line1, "양주 - 구로"
                , Arrays.asList(8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42)));
        trainList.add(new Train(131, line1, "의정부 - 구로"
                , Arrays.asList(11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42)));
        trainList.add(new Train(132, line1, "광운대 - 구로"
                , Arrays.asList(20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42)));
        trainList.add(new Train(133, line1, "청량리 - 구로"
                , Arrays.asList(25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42)));

        trainList.add(new Train(134, line1, "양주 - 서울역"
                , Arrays.asList(8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34)));
        trainList.add(new Train(135, line1, "광운대 - 서울역"
                , Arrays.asList(20,21,22,23,24,25,26,27,28,29,30,31,32,33,34)));
        trainList.add(new Train(136, line1, "청량리 - 서울역"
                , Arrays.asList(25,26,27,28,29,30,31,32,33,34)));
        trainList.add(new Train(137, line1, "동묘앞 - 서울역"
                , Arrays.asList(28,29,30,31,32,33,34)));

        trainList.add(new Train(138, line1, "소요산 - 광운대"
                , Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)));
        trainList.add(new Train(139, line1, "동두천 - 광운대"
                , Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)));
        trainList.add(new Train(140, line1, "양주 - 광운대"
                , Arrays.asList(8,9,10,11,12,13,14,15,16,17,18,19,20)));

        trainList.add(new Train(141, line1, "용산 - 구로"
                , Arrays.asList(36,37,38,39,40,41,42)));

        trainList.add(new Train(142, line1, "영등포 - 광명"
                , Arrays.asList(40,41,42,63,64,65,66)));

        /**
         * 2호선 급행 생략
         * */

        trainList.add(new Train(200, line2, "을지로 순환선"
                , Arrays.asList(104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146)));
        trainList.add(new Train(201, line2, "성수지선"
                , Arrays.asList(100,101,102,103,104)));
        trainList.add(new Train(202, line2, "신정지선"
                , Arrays.asList(127,146,147,148,149,150)));

        /**
         * 3호선 급행 생략
         * */

        trainList.add(new Train(300, line3, "대화 - 삼송"
                , Arrays.asList(200,201,202,203,204,205,206,207,208,209)));
        trainList.add(new Train(301, line3, "대화 - 구파발"
                , Arrays.asList(200,201,202,203,204,205,206,207,208,209,210,211)));
        trainList.add(new Train(302, line3, "대화 - 약수"
                , Arrays.asList(200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224)));
        trainList.add(new Train(303, line3, "대화 - 도곡"
                , Arrays.asList(200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235)));
        trainList.add(new Train(304, line3, "대화 - 수서"
                , Arrays.asList(200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240)));
        trainList.add(new Train(305, line3, "대화 - 오금"
                , Arrays.asList(200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243)));
        trainList.add(new Train(306, line3, "구파발 - 수서"
                , Arrays.asList(211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240)));
        trainList.add(new Train(307, line3, "구파발 - 오금"
                , Arrays.asList(211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243)));
        trainList.add(new Train(308, line3, "독립문 - 오금"
                , Arrays.asList(217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243)));
        trainList.add(new Train(309, line3, "압구정 - 오금"
                , Arrays.asList(227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243)));




        for (Train train : trainList) {
            trainHashMap.put(train.getIdx(), train);
        }
    }

    public HashMap<Integer, Train> getTrainHashMap() {
        return trainHashMap;
    }
}
