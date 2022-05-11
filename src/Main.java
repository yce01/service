import dto.기도음악;
import dto.사람;
import dto.영상;
import dto.원고;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {

    private static final 영상 영상 = null;
    private static final List<영상> 영상들 = null;
    private static final 원고 주일원고 = null;
    private static final 사람 주충익 = null;
    private static final 사람 정태암 = null;
    private static final 사람 정지환 = null;
    private static final 원고 수요원고 = null;
    private static final 사람 주난빛 = null;
    private static final 원고 새벽잠언 = null;
    private static final 사람 주빛치 = null;
    private static final 기도음악 MR = null;

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH");
        String nowString = now.format(formatter);

        DayOfWeek day = now.getDayOfWeek();
        String krDay = "";
        switch(day){
            case SUNDAY:
                krDay = "일";
                break;
            case MONDAY:
                krDay = "월";
                break;
            case TUESDAY:
                krDay = "화";
                break;
            case WEDNESDAY:
                krDay = "수";
                break;
            case THURSDAY:
                krDay = "목";
                break;
            case FRIDAY:
                krDay = "금";
                break;
            case SATURDAY:
                krDay = "토";
                break;
        }
        새벽예배 새벽 = new 새벽예배();
        주일예배 주일 = new 주일예배();
        수요예배 수요 = new 수요예배();

        System.out.println("오늘은 "+krDay+"요일 "+nowString+"시");
        if(day == DayOfWeek.SUNDAY){
            if(6<Integer.parseInt(nowString) && Integer.parseInt(nowString) < 10){
                System.out.println("기도로 준비하세요");
            }else if(10<=Integer.parseInt(nowString) && Integer.parseInt(nowString) <= 13){
                주일.준비찬양하기(영상들);
                주일.신앙고백하기(영상);
                주일.대표기도하기(영상);
                주일.성경봉독하기(영상);
                주일.특송하기(영상);
                주일.말씀듣기(주일원고, 주충익);
                주일.마무리기도하기(주충익);
                주일.헌금하기(영상);
                주일.봉헌기도하기(주충익);
                주일.축도하기(주충익);
                주일.광고하기(정태암);
            }
        } else if(day == DayOfWeek.WEDNESDAY){
            if(6<Integer.parseInt(nowString) && Integer.parseInt(nowString) < 20){
                System.out.println("기도로 준비하세요");
            }else if(20<=Integer.parseInt(nowString) && Integer.parseInt(nowString) <= 22) {
                수요.준비찬양하기(영상들);
                수요.성경봉독하기(영상);
                수요.말씀듣기(수요원고, 정지환);
                수요.마무리기도하기(정지환);
                수요.광고하기(주난빛);
            }
        } else  if (Integer.parseInt(nowString) <= 6){
            새벽.준비찬양하기(영상들);
            새벽.말씀듣기(새벽잠언, 주빛치);
            새벽.마무리기도하기(주빛치);
            새벽.기도하기(MR);
        }
    }
}
