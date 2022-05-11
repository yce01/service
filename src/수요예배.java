import dto.*;

import java.util.List;

class 수요예배 implements 예배{
    private 성경 성경;
    private 광고 광고;

    @Override
    public 찬양 준비찬양하기(List<영상> 영상) {
        System.out.println("수요 미듣찬 포함 네 개");
        return null;
    }

    public 성경 성경봉독하기(영상 영상){
        System.out.println("성경 구절");
        return 성경;
    }

    @Override
    public 말씀 말씀듣기(원고 원고, 사람 설교자) {
        System.out.println("수요설교");
        return null;
    }

    @Override
    public 기도 마무리기도하기(사람 설교자) {
        System.out.println("수요 말씀 마무리");
        return null;
    }

    public 광고 광고하기(사람 사회자){
        System.out.println("광고");
        return 광고;
    }
}
