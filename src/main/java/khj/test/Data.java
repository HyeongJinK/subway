package khj.test;

import java.util.Arrays;
import java.util.HashMap;

public class Data {
    private HashMap<Integer, SubwayStation> stationHashMap = new HashMap();

   public HashMap<Integer, SubwayStation> getStationHashMap() {
      return stationHashMap;
   }

   public Data() {
       stationHashMap.put(1,new SubwayStation(1, "소요산", Arrays.asList(new Connect(2, 5)), Arrays.asList(new Schedule(13, 0))));
       stationHashMap.put(2,new SubwayStation(2, "동두천", Arrays.asList(new Connect(1, 5), new Connect(3, 5))));
       stationHashMap.put(3,new SubwayStation(3, "보산", Arrays.asList(new Connect(2, 5), new Connect(4, 5))));
       stationHashMap.put(4,new SubwayStation(4, "동두천중앙", Arrays.asList(new Connect(3, 5), new Connect(5, 5))));
       stationHashMap.put(5,new SubwayStation(5, "지행", Arrays.asList(new Connect(4, 5), new Connect(6, 5))));
       stationHashMap.put(6,new SubwayStation(6, "덕정", Arrays.asList(new Connect(5, 5), new Connect(7, 5))));
       stationHashMap.put(7,new SubwayStation(7, "덕계", Arrays.asList(new Connect(6, 5), new Connect(8, 5))));
       stationHashMap.put(8,new SubwayStation(8, "양주", Arrays.asList(new Connect(7, 5), new Connect(9, 5))));
       stationHashMap.put(9,new SubwayStation(9, "녹양", Arrays.asList(new Connect(8, 5), new Connect(10, 5))));
       stationHashMap.put(10,new SubwayStation(10, "가능", Arrays.asList(new Connect(9, 5), new Connect(11, 5))));
       stationHashMap.put(11,new SubwayStation(11, "의정부", Arrays.asList(new Connect(10, 5), new Connect(12, 5))));
       stationHashMap.put(12,new SubwayStation(12, "회룡", Arrays.asList(new Connect(11, 5), new Connect(13, 5))));
       stationHashMap.put(13,new SubwayStation(13, "망월사", Arrays.asList(new Connect(12, 5), new Connect(14, 5))));
       stationHashMap.put(14,new SubwayStation(14, "도봉산", Arrays.asList(new Connect(13, 5), new Connect(15, 5))));
       stationHashMap.put(15,new SubwayStation(15, "도봉", Arrays.asList(new Connect(14, 5), new Connect(16, 5))));
       stationHashMap.put(16,new SubwayStation(16, "방학", Arrays.asList(new Connect(15, 5), new Connect(17, 5))));
       stationHashMap.put(17,new SubwayStation(17, "창동", Arrays.asList(new Connect(16, 5), new Connect(18, 5))));
       stationHashMap.put(18,new SubwayStation(18, "녹천", Arrays.asList(new Connect(17, 5), new Connect(19, 5))));
       stationHashMap.put(19,new SubwayStation(19, "월계", Arrays.asList(new Connect(18, 5), new Connect(20, 5))));
       stationHashMap.put(20,new SubwayStation(20, "광운대", Arrays.asList(new Connect(19, 5), new Connect(21, 5))));
       stationHashMap.put(21,new SubwayStation(21, "석계", Arrays.asList(new Connect(20, 5), new Connect(22, 5))));
       stationHashMap.put(22,new SubwayStation(22, "신이문", Arrays.asList(new Connect(21, 5), new Connect(23, 5))));
       stationHashMap.put(23,new SubwayStation(23, "외대앞", Arrays.asList(new Connect(22, 5), new Connect(24, 5))));
       stationHashMap.put(24,new SubwayStation(24, "회기", Arrays.asList(new Connect(23, 5), new Connect(25, 5))));
       stationHashMap.put(25,new SubwayStation(25, "청량리", Arrays.asList(new Connect(24, 5), new Connect(26, 5))));
       stationHashMap.put(26,new SubwayStation(26, "제기동", Arrays.asList(new Connect(25, 5), new Connect(27, 5))));
       stationHashMap.put(27,new SubwayStation(27, "신설동", Arrays.asList(new Connect(26, 5), new Connect(28, 5), new Connect(100, 2, true)), Arrays.asList(new Schedule(16, 0))));
       stationHashMap.put(28,new SubwayStation(28, "동묘앞", Arrays.asList(new Connect(27, 5), new Connect(29, 5))));
       stationHashMap.put(29,new SubwayStation(29, "동대문", Arrays.asList(new Connect(28, 5), new Connect(30, 5))));
       stationHashMap.put(30,new SubwayStation(30, "종로5가", Arrays.asList(new Connect(29, 5), new Connect(31, 5))));
       stationHashMap.put(31,new SubwayStation(31, "종로3가", Arrays.asList(new Connect(30, 5), new Connect(32, 5), new Connect(220, 2, true))));
       stationHashMap.put(32,new SubwayStation(32, "종각", Arrays.asList(new Connect(31, 5), new Connect(33, 5))));
       stationHashMap.put(33,new SubwayStation(33, "시청", Arrays.asList(new Connect(32, 5), new Connect(34, 5), new Connect(137, 2, true))));
       stationHashMap.put(34,new SubwayStation(34, "서울역", Arrays.asList(new Connect(33, 5), new Connect(35, 5))));
       stationHashMap.put(35,new SubwayStation(35, "남영", Arrays.asList(new Connect(34, 5), new Connect(36, 5))));
       stationHashMap.put(36,new SubwayStation(36, "용산", Arrays.asList(new Connect(35, 5), new Connect(37, 5))));
       stationHashMap.put(37,new SubwayStation(37, "노량진", Arrays.asList(new Connect(36, 5), new Connect(38, 5))));
       stationHashMap.put(38,new SubwayStation(38, "대방", Arrays.asList(new Connect(37, 5), new Connect(39, 5))));
       stationHashMap.put(39,new SubwayStation(39, "신길", Arrays.asList(new Connect(38, 5), new Connect(40, 5))));
       stationHashMap.put(40,new SubwayStation(40, "영등포", Arrays.asList(new Connect(39, 5), new Connect(41, 5))));
       stationHashMap.put(41,new SubwayStation(41, "신도림", Arrays.asList(new Connect(40, 5), new Connect(42, 5), new Connect(127, 2, true))));
       stationHashMap.put(42,new SubwayStation(42, "구로", Arrays.asList(new Connect(41, 5), new Connect(43, 5))));

       stationHashMap.put(43,new SubwayStation(43, "구일", Arrays.asList(new Connect(42, 5), new Connect(44, 5))));
       stationHashMap.put(44,new SubwayStation(44, "개봉", Arrays.asList(new Connect(43, 5), new Connect(45, 5))));
       stationHashMap.put(45,new SubwayStation(45, "오류동", Arrays.asList(new Connect(44, 5), new Connect(46, 5))));
       stationHashMap.put(46,new SubwayStation(46, "온수", Arrays.asList(new Connect(45, 5), new Connect(47, 5))));
       stationHashMap.put(47,new SubwayStation(47, "역곡", Arrays.asList(new Connect(46, 5), new Connect(48, 5))));
       stationHashMap.put(48,new SubwayStation(48, "소사", Arrays.asList(new Connect(47, 5), new Connect(49, 5))));
       stationHashMap.put(49,new SubwayStation(49, "부천", Arrays.asList(new Connect(48, 5), new Connect(50, 5))));
       stationHashMap.put(50,new SubwayStation(50, "중동", Arrays.asList(new Connect(49, 5), new Connect(51, 5))));
       stationHashMap.put(51,new SubwayStation(51, "송내", Arrays.asList(new Connect(50, 5), new Connect(52, 5))));
       stationHashMap.put(52,new SubwayStation(52, "부개", Arrays.asList(new Connect(51, 5), new Connect(53, 5))));
       stationHashMap.put(53,new SubwayStation(53, "부평", Arrays.asList(new Connect(52, 5), new Connect(54, 5))));
       stationHashMap.put(54,new SubwayStation(54, "백운", Arrays.asList(new Connect(53, 5), new Connect(55, 5))));
       stationHashMap.put(55,new SubwayStation(55, "동암", Arrays.asList(new Connect(54, 5), new Connect(56, 5))));
       stationHashMap.put(56,new SubwayStation(56, "간석", Arrays.asList(new Connect(55, 5), new Connect(57, 5))));
       stationHashMap.put(57,new SubwayStation(57, "주안", Arrays.asList(new Connect(56, 5), new Connect(58, 5))));
       stationHashMap.put(58,new SubwayStation(58, "도화", Arrays.asList(new Connect(57, 5), new Connect(59, 5))));
       stationHashMap.put(59,new SubwayStation(59, "제물포", Arrays.asList(new Connect(58, 5), new Connect(60, 5))));
       stationHashMap.put(60,new SubwayStation(60, "도원", Arrays.asList(new Connect(59, 5), new Connect(61, 5))));
       stationHashMap.put(61,new SubwayStation(61, "동인천", Arrays.asList(new Connect(60, 5), new Connect(62, 5))));
       stationHashMap.put(62,new SubwayStation(62, "인천", Arrays.asList(new Connect(61, 5))));

       stationHashMap.put(63,new SubwayStation(63, "가산디지털단지", Arrays.asList(new Connect(42, 5), new Connect(64, 5))));
       stationHashMap.put(64,new SubwayStation(64, "독산", Arrays.asList(new Connect(63, 5), new Connect(65, 5))));
       stationHashMap.put(65,new SubwayStation(65, "금천구청", Arrays.asList(new Connect(64, 5), new Connect(66, 5))));
       stationHashMap.put(66,new SubwayStation(66, "광명", Arrays.asList(new Connect(65, 5), new Connect(67, 5))));
       stationHashMap.put(67,new SubwayStation(67, "석수", Arrays.asList(new Connect(66, 5), new Connect(68, 5))));
       stationHashMap.put(68,new SubwayStation(68, "관악", Arrays.asList(new Connect(67, 5), new Connect(69, 5))));
       stationHashMap.put(69,new SubwayStation(69, "안양", Arrays.asList(new Connect(68, 5), new Connect(70, 5))));
       stationHashMap.put(70,new SubwayStation(70, "명학", Arrays.asList(new Connect(69, 5), new Connect(71, 5))));
       stationHashMap.put(71,new SubwayStation(71, "금정", Arrays.asList(new Connect(70, 5), new Connect(72, 5))));
       stationHashMap.put(72,new SubwayStation(72, "군포", Arrays.asList(new Connect(71, 5), new Connect(73, 5))));
       stationHashMap.put(73,new SubwayStation(73, "당정", Arrays.asList(new Connect(72, 5), new Connect(74, 5))));
       stationHashMap.put(74,new SubwayStation(74, "의왕", Arrays.asList(new Connect(73, 5), new Connect(75, 5))));
       stationHashMap.put(75,new SubwayStation(75, "성균관대", Arrays.asList(new Connect(74, 5), new Connect(76, 5))));
       stationHashMap.put(76,new SubwayStation(76, "화서", Arrays.asList(new Connect(75, 5), new Connect(77, 5))));
       stationHashMap.put(77,new SubwayStation(77, "수원", Arrays.asList(new Connect(76, 5), new Connect(78, 5))));
       stationHashMap.put(78,new SubwayStation(78, "세류", Arrays.asList(new Connect(77, 5), new Connect(79, 5))));
       stationHashMap.put(79,new SubwayStation(79, "병점", Arrays.asList(new Connect(78, 5), new Connect(80, 5))));
       stationHashMap.put(80,new SubwayStation(80, "서동탄", Arrays.asList(new Connect(79, 5), new Connect(81, 5))));
       stationHashMap.put(81,new SubwayStation(81, "세마", Arrays.asList(new Connect(80, 5), new Connect(82, 5))));
       stationHashMap.put(82,new SubwayStation(82, "오산대", Arrays.asList(new Connect(81, 5), new Connect(83, 5))));
       stationHashMap.put(83,new SubwayStation(83, "오산", Arrays.asList(new Connect(82, 5), new Connect(84, 5))));
       stationHashMap.put(84,new SubwayStation(84, "진위", Arrays.asList(new Connect(83, 5), new Connect(85, 5))));
       stationHashMap.put(85,new SubwayStation(85, "송탄", Arrays.asList(new Connect(84, 5), new Connect(86, 5))));
       stationHashMap.put(86,new SubwayStation(86, "서정리", Arrays.asList(new Connect(85, 5), new Connect(87, 5))));
       stationHashMap.put(87,new SubwayStation(87, "지제", Arrays.asList(new Connect(86, 5), new Connect(88, 5))));
       stationHashMap.put(88,new SubwayStation(88, "평택", Arrays.asList(new Connect(87, 5), new Connect(89, 5))));
       stationHashMap.put(89,new SubwayStation(89, "성환", Arrays.asList(new Connect(88, 5), new Connect(90, 5))));
       stationHashMap.put(90,new SubwayStation(90, "직산", Arrays.asList(new Connect(89, 5), new Connect(91, 5))));
       stationHashMap.put(91,new SubwayStation(91, "두정", Arrays.asList(new Connect(90, 5), new Connect(92, 5))));
       stationHashMap.put(92,new SubwayStation(92, "천안", Arrays.asList(new Connect(91, 5), new Connect(93, 5))));
       stationHashMap.put(93,new SubwayStation(93, "봉명", Arrays.asList(new Connect(92, 5), new Connect(94, 5))));
       stationHashMap.put(94,new SubwayStation(94, "쌍용", Arrays.asList(new Connect(93, 5), new Connect(95, 5))));
       stationHashMap.put(95,new SubwayStation(95, "아산", Arrays.asList(new Connect(94, 5), new Connect(96, 5))));
       stationHashMap.put(96,new SubwayStation(96, "배방", Arrays.asList(new Connect(95, 5), new Connect(97, 5))));
       stationHashMap.put(97,new SubwayStation(97, "온양온천", Arrays.asList(new Connect(96, 5), new Connect(98, 5))));
       stationHashMap.put(98,new SubwayStation(98, "신창", Arrays.asList(new Connect(97, 5))));


       stationHashMap.put(100,new SubwayStation(100, "신설동", Arrays.asList(new Connect(101, 5), new Connect(27, 2, true))));
       stationHashMap.put(101,new SubwayStation(101, "용두", Arrays.asList(new Connect(102, 5), new Connect(100, 5))));
       stationHashMap.put(102,new SubwayStation(102, "신답", Arrays.asList(new Connect(103, 5), new Connect(101, 5))));
       stationHashMap.put(103,new SubwayStation(103, "용답", Arrays.asList(new Connect(104, 5), new Connect(102, 5))));

       stationHashMap.put(104,new SubwayStation(104, "성수", Arrays.asList(new Connect(105, 5), new Connect(103, 5), new Connect(146, 5))));

       stationHashMap.put(105,new SubwayStation(105, "건대입구", Arrays.asList(new Connect(106, 5), new Connect(104, 5))));
       stationHashMap.put(106,new SubwayStation(106, "구의", Arrays.asList(new Connect(107, 5), new Connect(105, 5))));
       stationHashMap.put(107,new SubwayStation(107, "강변", Arrays.asList(new Connect(108, 5), new Connect(106, 5))));
       stationHashMap.put(108,new SubwayStation(108, "잠실나루", Arrays.asList(new Connect(109, 5), new Connect(107, 5))));
       stationHashMap.put(109,new SubwayStation(109, "잠실", Arrays.asList(new Connect(110, 5), new Connect(108, 5))));
       stationHashMap.put(110,new SubwayStation(110, "잠실새내", Arrays.asList(new Connect(111, 5), new Connect(109, 5))));
       stationHashMap.put(111,new SubwayStation(111, "종합운동장", Arrays.asList(new Connect(112, 5), new Connect(110, 5))));
       stationHashMap.put(112,new SubwayStation(112, "삼성", Arrays.asList(new Connect(113, 5), new Connect(111, 5))));
       stationHashMap.put(113,new SubwayStation(113, "선릉", Arrays.asList(new Connect(114, 5), new Connect(112, 5))));
       stationHashMap.put(114,new SubwayStation(114, "역삼", Arrays.asList(new Connect(115, 5), new Connect(113, 5))));
       stationHashMap.put(115,new SubwayStation(115, "강남", Arrays.asList(new Connect(116, 5), new Connect(114, 5))));
       stationHashMap.put(116,new SubwayStation(116, "교대", Arrays.asList(new Connect(117, 5), new Connect(115, 5), new Connect(231, 2, true))));
       stationHashMap.put(117,new SubwayStation(117, "서초", Arrays.asList(new Connect(118, 5), new Connect(116, 5))));
       stationHashMap.put(118,new SubwayStation(118, "방배", Arrays.asList(new Connect(119, 5), new Connect(117, 5))));
       stationHashMap.put(119,new SubwayStation(119, "사당", Arrays.asList(new Connect(120, 5), new Connect(118, 5))));
       stationHashMap.put(120,new SubwayStation(120, "낙성대", Arrays.asList(new Connect(121, 5), new Connect(119, 5))));
       stationHashMap.put(121,new SubwayStation(121, "서울대입구", Arrays.asList(new Connect(122, 5), new Connect(120, 5))));
       stationHashMap.put(122,new SubwayStation(122, "봉천", Arrays.asList(new Connect(123, 5), new Connect(121, 5))));
       stationHashMap.put(123,new SubwayStation(123, "신림", Arrays.asList(new Connect(124, 5), new Connect(122, 5))));
       stationHashMap.put(124,new SubwayStation(124, "신대방", Arrays.asList(new Connect(125, 5), new Connect(123, 5))));
       stationHashMap.put(125,new SubwayStation(125, "구로디지털단지", Arrays.asList(new Connect(126, 5), new Connect(124, 5))));
       stationHashMap.put(126,new SubwayStation(126, "대림", Arrays.asList(new Connect(127, 5), new Connect(125, 5))));

       stationHashMap.put(127,new SubwayStation(127, "신도림", Arrays.asList(new Connect(128, 5), new Connect(126, 5), new Connect(147, 5), new Connect(41, 2, true))));

       stationHashMap.put(128,new SubwayStation(128, "문래", Arrays.asList(new Connect(129, 5), new Connect(127, 5))));
       stationHashMap.put(129,new SubwayStation(129, "영등포구청", Arrays.asList(new Connect(130, 5), new Connect(128, 5))));
       stationHashMap.put(130,new SubwayStation(130, "당산", Arrays.asList(new Connect(131, 5), new Connect(129, 5))));
       stationHashMap.put(131,new SubwayStation(131, "합정", Arrays.asList(new Connect(132, 5), new Connect(130, 5))));
       stationHashMap.put(132,new SubwayStation(132, "홍대입구", Arrays.asList(new Connect(133, 5), new Connect(131, 5))));
       stationHashMap.put(133,new SubwayStation(133, "신촌", Arrays.asList(new Connect(134, 5), new Connect(132, 5))));
       stationHashMap.put(134,new SubwayStation(134, "이대", Arrays.asList(new Connect(135, 5), new Connect(133, 5))));
       stationHashMap.put(135,new SubwayStation(135, "아현", Arrays.asList(new Connect(136, 5), new Connect(134, 5))));
       stationHashMap.put(136,new SubwayStation(136, "충정로", Arrays.asList(new Connect(137, 5), new Connect(135, 5))));
       stationHashMap.put(137,new SubwayStation(137, "시청", Arrays.asList(new Connect(138, 5), new Connect(136, 5), new Connect(136, 2, true))));
       stationHashMap.put(138,new SubwayStation(138, "을지로입구", Arrays.asList(new Connect(139, 5), new Connect(137, 5))));
       stationHashMap.put(139,new SubwayStation(139, "을지로3가", Arrays.asList(new Connect(140, 5), new Connect(138, 5), new Connect(221, 2, true))));
       stationHashMap.put(140,new SubwayStation(140, "을지로4가", Arrays.asList(new Connect(141, 5), new Connect(139, 5))));
       stationHashMap.put(141,new SubwayStation(141, "동대문역사문화공원", Arrays.asList(new Connect(142, 5), new Connect(140, 5))));
       stationHashMap.put(142,new SubwayStation(142, "신당", Arrays.asList(new Connect(143, 5), new Connect(141, 5))));
       stationHashMap.put(143,new SubwayStation(143, "상왕십리", Arrays.asList(new Connect(144, 5), new Connect(142, 5))));
       stationHashMap.put(144,new SubwayStation(144, "왕십리", Arrays.asList(new Connect(145, 5), new Connect(143, 5))));
       stationHashMap.put(145,new SubwayStation(145, "한양대", Arrays.asList(new Connect(146, 5), new Connect(144, 5))));
       stationHashMap.put(146,new SubwayStation(146, "뚝섬", Arrays.asList(new Connect(104, 5), new Connect(145, 5))));

       stationHashMap.put(147,new SubwayStation(147, "도림천", Arrays.asList(new Connect(148, 5), new Connect(127, 5))));
       stationHashMap.put(148,new SubwayStation(148, "양천구청", Arrays.asList(new Connect(149, 5), new Connect(147, 5))));
       stationHashMap.put(149,new SubwayStation(149, "신정네거리", Arrays.asList(new Connect(150, 5), new Connect(148, 5))));
       stationHashMap.put(150,new SubwayStation(150, "까치산", Arrays.asList(new Connect(149, 5))));


       stationHashMap.put(200,new SubwayStation(200, "대화", Arrays.asList(new Connect(201, 5))));
       stationHashMap.put(201,new SubwayStation(201, "주엽", Arrays.asList(new Connect(202, 5), new Connect(200, 5))));
       stationHashMap.put(202,new SubwayStation(202, "정발산", Arrays.asList(new Connect(203, 5), new Connect(201, 5))));
       stationHashMap.put(203,new SubwayStation(203, "마두", Arrays.asList(new Connect(204, 5), new Connect(202, 5))));
       stationHashMap.put(204,new SubwayStation(204, "백석", Arrays.asList(new Connect(205, 5), new Connect(203, 5))));
       stationHashMap.put(205,new SubwayStation(205, "대곡", Arrays.asList(new Connect(206, 5), new Connect(204, 5))));
       stationHashMap.put(206,new SubwayStation(206, "화정", Arrays.asList(new Connect(207, 5), new Connect(205, 5))));
       stationHashMap.put(207,new SubwayStation(207, "원당", Arrays.asList(new Connect(208, 5), new Connect(206, 5))));
       stationHashMap.put(208,new SubwayStation(208, "원흥", Arrays.asList(new Connect(209, 5), new Connect(207, 5))));
       stationHashMap.put(209,new SubwayStation(209, "삼송", Arrays.asList(new Connect(210, 5), new Connect(208, 5))));
       stationHashMap.put(210,new SubwayStation(210, "지축", Arrays.asList(new Connect(211, 5), new Connect(209, 5))));
       stationHashMap.put(211,new SubwayStation(211, "구파발", Arrays.asList(new Connect(212, 5), new Connect(210, 5))));
       stationHashMap.put(212,new SubwayStation(212, "연신내", Arrays.asList(new Connect(213, 5), new Connect(211, 5))));
       stationHashMap.put(213,new SubwayStation(213, "불광", Arrays.asList(new Connect(214, 5), new Connect(212, 5))));
       stationHashMap.put(214,new SubwayStation(214, "녹번", Arrays.asList(new Connect(215, 5), new Connect(213, 5))));
       stationHashMap.put(215,new SubwayStation(215, "홍제", Arrays.asList(new Connect(216, 5), new Connect(214, 5))));
       stationHashMap.put(216,new SubwayStation(216, "무악제", Arrays.asList(new Connect(217, 5), new Connect(215, 5))));
       stationHashMap.put(217,new SubwayStation(217, "독립문", Arrays.asList(new Connect(218, 5), new Connect(216, 5))));
       stationHashMap.put(218,new SubwayStation(218, "경복궁", Arrays.asList(new Connect(219, 5), new Connect(217, 5))));
       stationHashMap.put(219,new SubwayStation(229, "안국", Arrays.asList(new Connect(220, 5), new Connect(218, 5))));
       stationHashMap.put(220,new SubwayStation(220, "종로3가", Arrays.asList(new Connect(221, 5), new Connect(219, 5), new Connect(31, 2, true))));
       stationHashMap.put(221,new SubwayStation(221, "을지로3가", Arrays.asList(new Connect(222, 5), new Connect(220, 5), new Connect(139, 2, true))));
       stationHashMap.put(222,new SubwayStation(222, "충무로", Arrays.asList(new Connect(223, 5), new Connect(221, 5))));
       stationHashMap.put(223,new SubwayStation(223, "동대입구", Arrays.asList(new Connect(224, 5), new Connect(222, 5))));
       stationHashMap.put(224,new SubwayStation(224, "약수", Arrays.asList(new Connect(225, 5), new Connect(223, 5))));
       stationHashMap.put(225,new SubwayStation(225, "금호", Arrays.asList(new Connect(226, 5), new Connect(224, 5))));
       stationHashMap.put(226,new SubwayStation(226, "옥수", Arrays.asList(new Connect(227, 5), new Connect(225, 5))));
       stationHashMap.put(227,new SubwayStation(227, "압구정", Arrays.asList(new Connect(228, 5), new Connect(226, 5))));
       stationHashMap.put(228,new SubwayStation(228, "신사", Arrays.asList(new Connect(229, 5), new Connect(227, 5))));
       stationHashMap.put(229,new SubwayStation(239, "잠원", Arrays.asList(new Connect(230, 5), new Connect(228, 5))));
       stationHashMap.put(230,new SubwayStation(230, "고속터미널", Arrays.asList(new Connect(231, 5), new Connect(229, 5))));
       stationHashMap.put(231,new SubwayStation(231, "교대", Arrays.asList(new Connect(232, 5), new Connect(230, 5), new Connect(116, 2, true))));
       stationHashMap.put(232,new SubwayStation(232, "남부터미널", Arrays.asList(new Connect(233, 5), new Connect(231, 5))));
       stationHashMap.put(233,new SubwayStation(233, "양재", Arrays.asList(new Connect(234, 5), new Connect(232, 5))));
       stationHashMap.put(234,new SubwayStation(234, "매봉", Arrays.asList(new Connect(235, 5), new Connect(233, 5))));
       stationHashMap.put(235,new SubwayStation(235, "도곡", Arrays.asList(new Connect(236, 5), new Connect(234, 5))));
       stationHashMap.put(236,new SubwayStation(236, "대치", Arrays.asList(new Connect(237, 5), new Connect(235, 5))));
       stationHashMap.put(237,new SubwayStation(237, "학여울", Arrays.asList(new Connect(238, 5), new Connect(236, 5))));
       stationHashMap.put(238,new SubwayStation(238, "대청", Arrays.asList(new Connect(239, 5), new Connect(237, 5))));
       stationHashMap.put(239,new SubwayStation(239, "일원", Arrays.asList(new Connect(240, 5), new Connect(238, 5))));
       stationHashMap.put(240,new SubwayStation(240, "수서", Arrays.asList(new Connect(241, 5), new Connect(239, 5))));
       stationHashMap.put(241,new SubwayStation(241, "가락시장", Arrays.asList(new Connect(242, 5), new Connect(240, 5))));
       stationHashMap.put(242,new SubwayStation(242, "경찰병원", Arrays.asList(new Connect(243, 5), new Connect(241, 5))));
       stationHashMap.put(243,new SubwayStation(243, "오금", Arrays.asList(new Connect(242, 5))));

        //stationist.add(new SubwayStation(300, "당고개", Arrays.asList(new Connect(2, 5), new Connect(, 5))));
    }
}
