import dto.*;

import java.util.List;

class 새벽예배 implements 예배{

    @Override
    public 찬양 준비찬양하기(List<영상> 영상들) {
        System.out.println("가사만 나오는 영상");
        return null;
    }

    @Override
    public 말씀 말씀듣기(원고 원고, 사람 설교자) {
        System.out.println("새벽 설교");
        return null;
    }

    @Override
    public 기도 마무리기도하기(사람 설교자) {
        System.out.println("새벽말씀 마무리");
        return null;
    }

    public 기도 기도하기(기도음악 mr){
        System.out.println("다같이 기도하시겠습니다.");
        return null;
    }
}

