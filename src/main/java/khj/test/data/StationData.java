package khj.test.data;

import khj.test.Connect;
import khj.test.Station;

import java.util.Arrays;
import java.util.HashMap;

public class StationData {
    private HashMap<Integer, Station> stationHashMap = new HashMap();

   public HashMap<Integer, Station> getStationHashMap() {
      return stationHashMap;
   }

   public StationData() {
       /**
        * 1호선
        * */
       stationHashMap.put(1,new Station(1, "소요산", Arrays.asList(new Connect(2, 5)), 100));
       stationHashMap.put(2,new Station(2, "동두천", Arrays.asList(new Connect(1, 5), new Connect(3, 5)), 100));
       stationHashMap.put(3,new Station(3, "보산", Arrays.asList(new Connect(2, 5), new Connect(4, 5)), 100));
       stationHashMap.put(4,new Station(4, "동두천중앙", Arrays.asList(new Connect(3, 5), new Connect(5, 5)), 100));
       stationHashMap.put(5,new Station(5, "지행", Arrays.asList(new Connect(4, 5), new Connect(6, 5)), 100));
       stationHashMap.put(6,new Station(6, "덕정", Arrays.asList(new Connect(5, 5), new Connect(7, 5)), 100));
       stationHashMap.put(7,new Station(7, "덕계", Arrays.asList(new Connect(6, 5), new Connect(8, 5)), 100));
       stationHashMap.put(8,new Station(8, "양주", Arrays.asList(new Connect(7, 5), new Connect(9, 5)), 100));
       stationHashMap.put(9,new Station(9, "녹양", Arrays.asList(new Connect(8, 5), new Connect(10, 5)), 100));
       stationHashMap.put(10,new Station(10, "가능", Arrays.asList(new Connect(9, 5), new Connect(11, 5)), 100));
       stationHashMap.put(11,new Station(11, "의정부", Arrays.asList(new Connect(10, 5), new Connect(12, 5)), 100));
       stationHashMap.put(12,new Station(12, "회룡", Arrays.asList(new Connect(11, 5), new Connect(13, 5)), 100));
       stationHashMap.put(13,new Station(13, "망월사", Arrays.asList(new Connect(12, 5), new Connect(14, 5)), 100));
       stationHashMap.put(14,new Station(14, "도봉산", Arrays.asList(new Connect(13, 5), new Connect(15, 5)), 100));
       stationHashMap.put(15,new Station(15, "도봉", Arrays.asList(new Connect(14, 5), new Connect(16, 5)), 100));
       stationHashMap.put(16,new Station(16, "방학", Arrays.asList(new Connect(15, 5), new Connect(17, 5)), 100));
       stationHashMap.put(17,new Station(17, "창동", Arrays.asList(new Connect(16, 5), new Connect(18, 5)), 100));
       stationHashMap.put(18,new Station(18, "녹천", Arrays.asList(new Connect(17, 5), new Connect(19, 5)), 100));
       stationHashMap.put(19,new Station(19, "월계", Arrays.asList(new Connect(18, 5), new Connect(20, 5)), 100));
       stationHashMap.put(20,new Station(20, "광운대", Arrays.asList(new Connect(19, 5), new Connect(21, 5)), 100));
       stationHashMap.put(21,new Station(21, "석계", Arrays.asList(new Connect(20, 5), new Connect(22, 5)), 100));
       stationHashMap.put(22,new Station(22, "신이문", Arrays.asList(new Connect(21, 5), new Connect(23, 5)), 100));
       stationHashMap.put(23,new Station(23, "외대앞", Arrays.asList(new Connect(22, 5), new Connect(24, 5)), 100));
       stationHashMap.put(24,new Station(24, "회기", Arrays.asList(new Connect(23, 5), new Connect(25, 5)), 100));
       stationHashMap.put(25,new Station(25, "청량리", Arrays.asList(new Connect(24, 5), new Connect(26, 5)), 100));
       stationHashMap.put(26,new Station(26, "제기동", Arrays.asList(new Connect(25, 5), new Connect(27, 5)), 100));
       stationHashMap.put(27,new Station(27, "신설동", Arrays.asList(new Connect(26, 5), new Connect(28, 5), new Connect(100, 2, true)), 100));
       stationHashMap.put(28,new Station(28, "동묘앞", Arrays.asList(new Connect(27, 5), new Connect(29, 5)), 100));
       stationHashMap.put(29,new Station(29, "동대문", Arrays.asList(new Connect(28, 5), new Connect(30, 5)), 100));
       stationHashMap.put(30,new Station(30, "종로5가", Arrays.asList(new Connect(29, 5), new Connect(31, 5)), 100));
       stationHashMap.put(31,new Station(31, "종로3가", Arrays.asList(new Connect(30, 5), new Connect(32, 5), new Connect(220, 2, true)), 100));
       stationHashMap.put(32,new Station(32, "종각", Arrays.asList(new Connect(31, 5), new Connect(33, 5)), 100));
       stationHashMap.put(33,new Station(33, "시청", Arrays.asList(new Connect(32, 5), new Connect(34, 5), new Connect(137, 2, true)), 100));
       stationHashMap.put(34,new Station(34, "서울역", Arrays.asList(new Connect(33, 5), new Connect(35, 5)), 100));
       stationHashMap.put(35,new Station(35, "남영", Arrays.asList(new Connect(34, 5), new Connect(36, 5)), 100));
       stationHashMap.put(36,new Station(36, "용산", Arrays.asList(new Connect(35, 5), new Connect(37, 5)), 100));
       stationHashMap.put(37,new Station(37, "노량진", Arrays.asList(new Connect(36, 5), new Connect(38, 5)), 100));
       stationHashMap.put(38,new Station(38, "대방", Arrays.asList(new Connect(37, 5), new Connect(39, 5)), 100));
       stationHashMap.put(39,new Station(39, "신길", Arrays.asList(new Connect(38, 5), new Connect(40, 5)), 100));
       stationHashMap.put(40,new Station(40, "영등포", Arrays.asList(new Connect(39, 5), new Connect(41, 5)), 100));
       stationHashMap.put(41,new Station(41, "신도림", Arrays.asList(new Connect(40, 5), new Connect(42, 5), new Connect(127, 2, true)), 100));
       stationHashMap.put(42,new Station(42, "구로", Arrays.asList(new Connect(41, 5), new Connect(43, 5)), 100));

       stationHashMap.put(43,new Station(43, "구일", Arrays.asList(new Connect(42, 5), new Connect(44, 5)), 100));
       stationHashMap.put(44,new Station(44, "개봉", Arrays.asList(new Connect(43, 5), new Connect(45, 5)), 100));
       stationHashMap.put(45,new Station(45, "오류동", Arrays.asList(new Connect(44, 5), new Connect(46, 5)), 100));
       stationHashMap.put(46,new Station(46, "온수", Arrays.asList(new Connect(45, 5), new Connect(47, 5)), 100));
       stationHashMap.put(47,new Station(47, "역곡", Arrays.asList(new Connect(46, 5), new Connect(48, 5)), 100));
       stationHashMap.put(48,new Station(48, "소사", Arrays.asList(new Connect(47, 5), new Connect(49, 5)), 100));
       stationHashMap.put(49,new Station(49, "부천", Arrays.asList(new Connect(48, 5), new Connect(50, 5)), 100));
       stationHashMap.put(50,new Station(50, "중동", Arrays.asList(new Connect(49, 5), new Connect(51, 5)), 100));
       stationHashMap.put(51,new Station(51, "송내", Arrays.asList(new Connect(50, 5), new Connect(52, 5)), 100));
       stationHashMap.put(52,new Station(52, "부개", Arrays.asList(new Connect(51, 5), new Connect(53, 5)), 100));
       stationHashMap.put(53,new Station(53, "부평", Arrays.asList(new Connect(52, 5), new Connect(54, 5)), 100));
       stationHashMap.put(54,new Station(54, "백운", Arrays.asList(new Connect(53, 5), new Connect(55, 5)), 100));
       stationHashMap.put(55,new Station(55, "동암", Arrays.asList(new Connect(54, 5), new Connect(56, 5)), 100));
       stationHashMap.put(56,new Station(56, "간석", Arrays.asList(new Connect(55, 5), new Connect(57, 5)), 100));
       stationHashMap.put(57,new Station(57, "주안", Arrays.asList(new Connect(56, 5), new Connect(58, 5)), 100));
       stationHashMap.put(58,new Station(58, "도화", Arrays.asList(new Connect(57, 5), new Connect(59, 5)), 100));
       stationHashMap.put(59,new Station(59, "제물포", Arrays.asList(new Connect(58, 5), new Connect(60, 5)), 100));
       stationHashMap.put(60,new Station(60, "도원", Arrays.asList(new Connect(59, 5), new Connect(61, 5)), 100));
       stationHashMap.put(61,new Station(61, "동인천", Arrays.asList(new Connect(60, 5), new Connect(62, 5)), 100));
       stationHashMap.put(62,new Station(62, "인천", Arrays.asList(new Connect(61, 5)), 100));

       stationHashMap.put(63,new Station(63, "가산디지털단지", Arrays.asList(new Connect(42, 5), new Connect(64, 5)), 100));
       stationHashMap.put(64,new Station(64, "독산", Arrays.asList(new Connect(63, 5), new Connect(65, 5)), 100));
       stationHashMap.put(65,new Station(65, "금천구청", Arrays.asList(new Connect(64, 5), new Connect(66, 5)), 100));
       stationHashMap.put(66,new Station(66, "광명", Arrays.asList(new Connect(65, 5), new Connect(67, 5)), 100));
       stationHashMap.put(67,new Station(67, "석수", Arrays.asList(new Connect(66, 5), new Connect(68, 5)), 100));
       stationHashMap.put(68,new Station(68, "관악", Arrays.asList(new Connect(67, 5), new Connect(69, 5)), 100));
       stationHashMap.put(69,new Station(69, "안양", Arrays.asList(new Connect(68, 5), new Connect(70, 5)), 100));
       stationHashMap.put(70,new Station(70, "명학", Arrays.asList(new Connect(69, 5), new Connect(71, 5)), 100));
       stationHashMap.put(71,new Station(71, "금정", Arrays.asList(new Connect(70, 5), new Connect(72, 5)), 100));
       stationHashMap.put(72,new Station(72, "군포", Arrays.asList(new Connect(71, 5), new Connect(73, 5)), 100));
       stationHashMap.put(73,new Station(73, "당정", Arrays.asList(new Connect(72, 5), new Connect(74, 5)), 100));
       stationHashMap.put(74,new Station(74, "의왕", Arrays.asList(new Connect(73, 5), new Connect(75, 5)), 100));
       stationHashMap.put(75,new Station(75, "성균관대", Arrays.asList(new Connect(74, 5), new Connect(76, 5)), 100));
       stationHashMap.put(76,new Station(76, "화서", Arrays.asList(new Connect(75, 5), new Connect(77, 5)), 100));
       stationHashMap.put(77,new Station(77, "수원", Arrays.asList(new Connect(76, 5), new Connect(78, 5)), 100));
       stationHashMap.put(78,new Station(78, "세류", Arrays.asList(new Connect(77, 5), new Connect(79, 5)), 100));
       stationHashMap.put(79,new Station(79, "병점", Arrays.asList(new Connect(78, 5), new Connect(80, 5)), 100));
       stationHashMap.put(80,new Station(80, "서동탄", Arrays.asList(new Connect(79, 5), new Connect(81, 5)), 100));
       stationHashMap.put(81,new Station(81, "세마", Arrays.asList(new Connect(80, 5), new Connect(82, 5)), 100));
       stationHashMap.put(82,new Station(82, "오산대", Arrays.asList(new Connect(81, 5), new Connect(83, 5)), 100));
       stationHashMap.put(83,new Station(83, "오산", Arrays.asList(new Connect(82, 5), new Connect(84, 5)), 100));
       stationHashMap.put(84,new Station(84, "진위", Arrays.asList(new Connect(83, 5), new Connect(85, 5)), 100));
       stationHashMap.put(85,new Station(85, "송탄", Arrays.asList(new Connect(84, 5), new Connect(86, 5)), 100));
       stationHashMap.put(86,new Station(86, "서정리", Arrays.asList(new Connect(85, 5), new Connect(87, 5)), 100));
       stationHashMap.put(87,new Station(87, "지제", Arrays.asList(new Connect(86, 5), new Connect(88, 5)), 100));
       stationHashMap.put(88,new Station(88, "평택", Arrays.asList(new Connect(87, 5), new Connect(89, 5)), 100));
       stationHashMap.put(89,new Station(89, "성환", Arrays.asList(new Connect(88, 5), new Connect(90, 5)), 100));
       stationHashMap.put(90,new Station(90, "직산", Arrays.asList(new Connect(89, 5), new Connect(91, 5)), 100));
       stationHashMap.put(91,new Station(91, "두정", Arrays.asList(new Connect(90, 5), new Connect(92, 5)), 100));
       stationHashMap.put(92,new Station(92, "천안", Arrays.asList(new Connect(91, 5), new Connect(93, 5)), 100));
       stationHashMap.put(93,new Station(93, "봉명", Arrays.asList(new Connect(92, 5), new Connect(94, 5)), 100));
       stationHashMap.put(94,new Station(94, "쌍용", Arrays.asList(new Connect(93, 5), new Connect(95, 5)), 100));
       stationHashMap.put(95,new Station(95, "아산", Arrays.asList(new Connect(94, 5), new Connect(96, 5)), 100));
       stationHashMap.put(96,new Station(96, "배방", Arrays.asList(new Connect(95, 5), new Connect(97, 5)), 100));
       stationHashMap.put(97,new Station(97, "온양온천", Arrays.asList(new Connect(96, 5), new Connect(98, 5)), 100));
       stationHashMap.put(98,new Station(98, "신창", Arrays.asList(new Connect(97, 5)), 100));

        /**
         * 2호선
         * */

       stationHashMap.put(100,new Station(100, "신설동", Arrays.asList(new Connect(101, 5), new Connect(27, 2, true)), 200));
       stationHashMap.put(101,new Station(101, "용두", Arrays.asList(new Connect(102, 5), new Connect(100, 5)), 200));
       stationHashMap.put(102,new Station(102, "신답", Arrays.asList(new Connect(103, 5), new Connect(101, 5)), 200));
       stationHashMap.put(103,new Station(103, "용답", Arrays.asList(new Connect(104, 5), new Connect(102, 5)), 200));

       stationHashMap.put(104,new Station(104, "성수", Arrays.asList(new Connect(105, 5), new Connect(103, 5), new Connect(146, 5)), 200));

       stationHashMap.put(105,new Station(105, "건대입구", Arrays.asList(new Connect(106, 5), new Connect(104, 5)), 200));
       stationHashMap.put(106,new Station(106, "구의", Arrays.asList(new Connect(107, 5), new Connect(105, 5)), 200));
       stationHashMap.put(107,new Station(107, "강변", Arrays.asList(new Connect(108, 5), new Connect(106, 5)), 200));
       stationHashMap.put(108,new Station(108, "잠실나루", Arrays.asList(new Connect(109, 5), new Connect(107, 5)), 200));
       stationHashMap.put(109,new Station(109, "잠실", Arrays.asList(new Connect(110, 5), new Connect(108, 5)), 200));
       stationHashMap.put(110,new Station(110, "잠실새내", Arrays.asList(new Connect(111, 5), new Connect(109, 5)), 200));
       stationHashMap.put(111,new Station(111, "종합운동장", Arrays.asList(new Connect(112, 5), new Connect(110, 5)), 200));
       stationHashMap.put(112,new Station(112, "삼성", Arrays.asList(new Connect(113, 5), new Connect(111, 5)), 200));
       stationHashMap.put(113,new Station(113, "선릉", Arrays.asList(new Connect(114, 5), new Connect(112, 5)), 200));
       stationHashMap.put(114,new Station(114, "역삼", Arrays.asList(new Connect(115, 5), new Connect(113, 5)), 200));
       stationHashMap.put(115,new Station(115, "강남", Arrays.asList(new Connect(116, 5), new Connect(114, 5)), 200));
       stationHashMap.put(116,new Station(116, "교대", Arrays.asList(new Connect(117, 5), new Connect(115, 5), new Connect(231, 2, true)), 200));
       stationHashMap.put(117,new Station(117, "서초", Arrays.asList(new Connect(118, 5), new Connect(116, 5)), 200));
       stationHashMap.put(118,new Station(118, "방배", Arrays.asList(new Connect(119, 5), new Connect(117, 5)), 200));
       stationHashMap.put(119,new Station(119, "사당", Arrays.asList(new Connect(120, 5), new Connect(118, 5)), 200));
       stationHashMap.put(120,new Station(120, "낙성대", Arrays.asList(new Connect(121, 5), new Connect(119, 5)), 200));
       stationHashMap.put(121,new Station(121, "서울대입구", Arrays.asList(new Connect(122, 5), new Connect(120, 5)), 200));
       stationHashMap.put(122,new Station(122, "봉천", Arrays.asList(new Connect(123, 5), new Connect(121, 5)), 200));
       stationHashMap.put(123,new Station(123, "신림", Arrays.asList(new Connect(124, 5), new Connect(122, 5)), 200));
       stationHashMap.put(124,new Station(124, "신대방", Arrays.asList(new Connect(125, 5), new Connect(123, 5)), 200));
       stationHashMap.put(125,new Station(125, "구로디지털단지", Arrays.asList(new Connect(126, 5), new Connect(124, 5)), 200));
       stationHashMap.put(126,new Station(126, "대림", Arrays.asList(new Connect(127, 5), new Connect(125, 5)), 200));

       stationHashMap.put(127,new Station(127, "신도림", Arrays.asList(new Connect(128, 5), new Connect(126, 5), new Connect(147, 5), new Connect(41, 2, true)), 200));

       stationHashMap.put(128,new Station(128, "문래", Arrays.asList(new Connect(129, 5), new Connect(127, 5)), 200));
       stationHashMap.put(129,new Station(129, "영등포구청", Arrays.asList(new Connect(130, 5), new Connect(128, 5)), 200));
       stationHashMap.put(130,new Station(130, "당산", Arrays.asList(new Connect(131, 5), new Connect(129, 5)), 200));
       stationHashMap.put(131,new Station(131, "합정", Arrays.asList(new Connect(132, 5), new Connect(130, 5)), 200));
       stationHashMap.put(132,new Station(132, "홍대입구", Arrays.asList(new Connect(133, 5), new Connect(131, 5)), 200));
       stationHashMap.put(133,new Station(133, "신촌", Arrays.asList(new Connect(134, 5), new Connect(132, 5)), 200));
       stationHashMap.put(134,new Station(134, "이대", Arrays.asList(new Connect(135, 5), new Connect(133, 5)), 200));
       stationHashMap.put(135,new Station(135, "아현", Arrays.asList(new Connect(136, 5), new Connect(134, 5)), 200));
       stationHashMap.put(136,new Station(136, "충정로", Arrays.asList(new Connect(137, 5), new Connect(135, 5)), 200));
       stationHashMap.put(137,new Station(137, "시청", Arrays.asList(new Connect(138, 5), new Connect(136, 5), new Connect(136, 2, true)), 200));
       stationHashMap.put(138,new Station(138, "을지로입구", Arrays.asList(new Connect(139, 5), new Connect(137, 5)), 200));
       stationHashMap.put(139,new Station(139, "을지로3가", Arrays.asList(new Connect(140, 5), new Connect(138, 5), new Connect(221, 2, true)), 200));
       stationHashMap.put(140,new Station(140, "을지로4가", Arrays.asList(new Connect(141, 5), new Connect(139, 5)), 200));
       stationHashMap.put(141,new Station(141, "동대문역사문화공원", Arrays.asList(new Connect(142, 5), new Connect(140, 5)), 200));
       stationHashMap.put(142,new Station(142, "신당", Arrays.asList(new Connect(143, 5), new Connect(141, 5)), 200));
       stationHashMap.put(143,new Station(143, "상왕십리", Arrays.asList(new Connect(144, 5), new Connect(142, 5)), 200));
       stationHashMap.put(144,new Station(144, "왕십리", Arrays.asList(new Connect(145, 5), new Connect(143, 5)), 200));
       stationHashMap.put(145,new Station(145, "한양대", Arrays.asList(new Connect(146, 5), new Connect(144, 5)), 200));
       stationHashMap.put(146,new Station(146, "뚝섬", Arrays.asList(new Connect(104, 5), new Connect(145, 5)), 200));

       stationHashMap.put(147,new Station(147, "도림천", Arrays.asList(new Connect(148, 5), new Connect(127, 5)), 200));
       stationHashMap.put(148,new Station(148, "양천구청", Arrays.asList(new Connect(149, 5), new Connect(147, 5)), 200));
       stationHashMap.put(149,new Station(149, "신정네거리", Arrays.asList(new Connect(150, 5), new Connect(148, 5)), 200));
       stationHashMap.put(150,new Station(150, "까치산", Arrays.asList(new Connect(149, 5)), 200));

       /**
        * 3호선
        * */

       stationHashMap.put(200,new Station(200, "대화", Arrays.asList(new Connect(201, 5)), 301));
       stationHashMap.put(201,new Station(201, "주엽", Arrays.asList(new Connect(202, 5), new Connect(200, 5)), 305));
       stationHashMap.put(202,new Station(202, "정발산", Arrays.asList(new Connect(203, 5), new Connect(201, 5)), 305));
       stationHashMap.put(203,new Station(203, "마두", Arrays.asList(new Connect(204, 5), new Connect(202, 5)), 305));
       stationHashMap.put(204,new Station(204, "백석", Arrays.asList(new Connect(205, 5), new Connect(203, 5)), 305));
       stationHashMap.put(205,new Station(205, "대곡", Arrays.asList(new Connect(206, 5), new Connect(204, 5)), 305));
       stationHashMap.put(206,new Station(206, "화정", Arrays.asList(new Connect(207, 5), new Connect(205, 5)), 305));
       stationHashMap.put(207,new Station(207, "원당", Arrays.asList(new Connect(208, 5), new Connect(206, 5)), 305));
       stationHashMap.put(208,new Station(208, "원흥", Arrays.asList(new Connect(209, 5), new Connect(207, 5)), 305));
       stationHashMap.put(209,new Station(209, "삼송", Arrays.asList(new Connect(210, 5), new Connect(208, 5)), 305));
       stationHashMap.put(210,new Station(210, "지축", Arrays.asList(new Connect(211, 5), new Connect(209, 5)), 305));
       stationHashMap.put(211,new Station(211, "구파발", Arrays.asList(new Connect(212, 5), new Connect(210, 5)), 305));
       stationHashMap.put(212,new Station(212, "연신내", Arrays.asList(new Connect(213, 5), new Connect(211, 5)), 305));
       stationHashMap.put(213,new Station(213, "불광", Arrays.asList(new Connect(214, 5), new Connect(212, 5)), 305));
       stationHashMap.put(214,new Station(214, "녹번", Arrays.asList(new Connect(215, 5), new Connect(213, 5)), 305));
       stationHashMap.put(215,new Station(215, "홍제", Arrays.asList(new Connect(216, 5), new Connect(214, 5)), 305));
       stationHashMap.put(216,new Station(216, "무악제", Arrays.asList(new Connect(217, 5), new Connect(215, 5)), 305));
       stationHashMap.put(217,new Station(217, "독립문", Arrays.asList(new Connect(218, 5), new Connect(216, 5)), 305));
       stationHashMap.put(218,new Station(218, "경복궁", Arrays.asList(new Connect(219, 5), new Connect(217, 5)), 305));
       stationHashMap.put(219,new Station(229, "안국", Arrays.asList(new Connect(220, 5), new Connect(218, 5)), 305));
       stationHashMap.put(220,new Station(220, "종로3가", Arrays.asList(new Connect(221, 5), new Connect(219, 5), new Connect(31, 2, true)), 305));
       stationHashMap.put(221,new Station(221, "을지로3가", Arrays.asList(new Connect(222, 5), new Connect(220, 5), new Connect(139, 2, true)), 305));
       stationHashMap.put(222,new Station(222, "충무로", Arrays.asList(new Connect(223, 5), new Connect(221, 5)), 305));
       stationHashMap.put(223,new Station(223, "동대입구", Arrays.asList(new Connect(224, 5), new Connect(222, 5)), 305));
       stationHashMap.put(224,new Station(224, "약수", Arrays.asList(new Connect(225, 5), new Connect(223, 5)), 305));
       stationHashMap.put(225,new Station(225, "금호", Arrays.asList(new Connect(226, 5), new Connect(224, 5)), 305));
       stationHashMap.put(226,new Station(226, "옥수", Arrays.asList(new Connect(227, 5), new Connect(225, 5)), 305));
       stationHashMap.put(227,new Station(227, "압구정", Arrays.asList(new Connect(228, 5), new Connect(226, 5)), 305));
       stationHashMap.put(228,new Station(228, "신사", Arrays.asList(new Connect(229, 5), new Connect(227, 5)), 305));
       stationHashMap.put(229,new Station(239, "잠원", Arrays.asList(new Connect(230, 5), new Connect(228, 5)), 305));
       stationHashMap.put(230,new Station(230, "고속터미널", Arrays.asList(new Connect(231, 5), new Connect(229, 5)), 305));
       stationHashMap.put(231,new Station(231, "교대", Arrays.asList(new Connect(232, 5), new Connect(230, 5), new Connect(116, 2, true)), 305));
       stationHashMap.put(232,new Station(232, "남부터미널", Arrays.asList(new Connect(233, 5), new Connect(231, 5)), 305));
       stationHashMap.put(233,new Station(233, "양재", Arrays.asList(new Connect(234, 5), new Connect(232, 5)), 305));
       stationHashMap.put(234,new Station(234, "매봉", Arrays.asList(new Connect(235, 5), new Connect(233, 5)), 305));
       stationHashMap.put(235,new Station(235, "도곡", Arrays.asList(new Connect(236, 5), new Connect(234, 5)), 305));
       stationHashMap.put(236,new Station(236, "대치", Arrays.asList(new Connect(237, 5), new Connect(235, 5)), 305));
       stationHashMap.put(237,new Station(237, "학여울", Arrays.asList(new Connect(238, 5), new Connect(236, 5)), 305));
       stationHashMap.put(238,new Station(238, "대청", Arrays.asList(new Connect(239, 5), new Connect(237, 5)), 305));
       stationHashMap.put(239,new Station(239, "일원", Arrays.asList(new Connect(240, 5), new Connect(238, 5)), 305));
       stationHashMap.put(240,new Station(240, "수서", Arrays.asList(new Connect(241, 5), new Connect(239, 5)), 305));
       stationHashMap.put(241,new Station(241, "가락시장", Arrays.asList(new Connect(242, 5), new Connect(240, 5)), 305));
       stationHashMap.put(242,new Station(242, "경찰병원", Arrays.asList(new Connect(243, 5), new Connect(241, 5)), 305));
       stationHashMap.put(243,new Station(243, "오금", Arrays.asList(new Connect(242, 5)), 305));

       /**
        * 4호선
        * */

       //stationist.add(new SubwayStation(300, "당고개", Arrays.asList(new Connect(2, 5), new Connect(, 5))));
    }
}
