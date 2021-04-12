package ga.fumyparli.e2.discount;

import ga.fumyparli.e2.member.Grade;
import ga.fumyparli.e2.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 되어야 함")
    void forVip() {
        Member member = new Member(1L, "member1", Grade.VIP);

        int discount = discountPolicy.discount(member, 12000);

        assertThat(discount).isEqualTo(1200);
    }

    @Test
    @DisplayName("VIP는 10% 할인이 되어야 함")
    void forBasic() {
        Member member = new Member(1L, "member1", Grade.BASIC);

        int discount = discountPolicy.discount(member, 12000);

        assertThat(discount).isEqualTo(1200);
    }
}