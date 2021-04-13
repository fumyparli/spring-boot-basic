package ga.fumyparli.e2;

import ga.fumyparli.e2.discount.DiscountPolicy;
import ga.fumyparli.e2.discount.FixDiscountPolicy;
import ga.fumyparli.e2.member.MemberRepository;
import ga.fumyparli.e2.member.MemberService;
import ga.fumyparli.e2.member.MemberServiceImpl;
import ga.fumyparli.e2.member.MemoryMemberRepository;
import ga.fumyparli.e2.order.OrderService;
import ga.fumyparli.e2.order.OrderServiceImpl;

public class AppConfig {

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
