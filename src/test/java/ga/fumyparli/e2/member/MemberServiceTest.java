package ga.fumyparli.e2.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){
        //given
        Member member = new Member(1L,"member1",Grade.VIP);

        //when
        memberService.join(member);
        Member toFind=memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(toFind);
    }
}
