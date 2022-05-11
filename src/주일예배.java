import dto.*;

import java.util.List;

class 주일예배 implements 예배{

    private 기도 기도;
    private 성경 성경;
    private 찬양 찬양;
    private 헌금 헌금;
    private 광고 광고;

    @Override
    public 찬양 준비찬양하기(List<영상> 영상들) {
        System.out.println("주일 미듣찬");
        return null;
    }

    public 기도 신앙고백하기(영상 영상){System.out.println("신앙고백"); return 기도;}
    public 기도 대표기도하기(영상 영상){System.out.println("대표기도"); return 기도;}
    public 성경 성경봉독하기(영상 영상){System.out.println("성경 구절"); return 성경;}
    public 찬양 특송하기(영상 영상){System.out.println("성가대"); return 찬양;}

    @Override
    public 말씀 말씀듣기(원고 원고, 사람 설교자) {
        System.out.println("주일 설교");
        return null;
    }

    @Override
    public 기도 마무리기도하기(사람 설교자) {
        System.out.println("주일 말씀 마무리");
        return null;
    }

    public 헌금 헌금하기(영상 영상){System.out.println("봉헌송"); return 헌금;}
    public 기도 봉헌기도하기(사람 설교자){System.out.println("봉헌기도"); return 기도;}
    public 기도 축도하기(사람 설교자){System.out.println("축도송"); return 기도;}
    public 광고 광고하기(사람 사회자){System.out.println("광고"); return 광고;}
}
