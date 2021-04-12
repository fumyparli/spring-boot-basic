package ga.fumyparli.e2.discount;

import ga.fumyparli.e2.member.Member;

public interface DiscountPolicy {
//    return: 할인 대상 금액
    int discount(Member member,int price);
}
