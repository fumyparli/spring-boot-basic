package ga.fumyparli.e2;

import ga.fumyparli.e2.discount.FixDiscountPolicy;
import ga.fumyparli.e2.member.MemberService;
import ga.fumyparli.e2.member.MemberServiceImpl;
import ga.fumyparli.e2.member.MemoryMemberRepository;
import ga.fumyparli.e2.order.OrderService;
import ga.fumyparli.e2.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }

}
