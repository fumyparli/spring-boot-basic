package ga.fumyparli.e2;

import ga.fumyparli.e2.discount.DiscountPolicy;
import ga.fumyparli.e2.discount.FixDiscountPolicy;
import ga.fumyparli.e2.member.MemberRepository;
import ga.fumyparli.e2.member.MemberService;
import ga.fumyparli.e2.member.MemberServiceImpl;
import ga.fumyparli.e2.member.MemoryMemberRepository;
import ga.fumyparli.e2.order.OrderService;
import ga.fumyparli.e2.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
