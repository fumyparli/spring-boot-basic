package ga.fumyparli.e2.member;

import ga.fumyparli.e2.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join() {
        //given
        Member member = new Member(1L, "member1", Grade.VIP);

        //when
        memberService.join(member);
        Member toFind = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(toFind);
    }
}
