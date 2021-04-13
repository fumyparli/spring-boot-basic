package ga.fumyparli.e2;

import ga.fumyparli.e2.member.Grade;
import ga.fumyparli.e2.member.Member;
import ga.fumyparli.e2.member.MemberService;
import ga.fumyparli.e2.order.Order;
import ga.fumyparli.e2.order.OrderService;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "member1", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "item1", 12000);

        System.out.println("order: " + order.toString()); // println에 객체를 넣으면 객체의 toString이 불림
        System.out.println("orderPrice: " + order.calculatePrice());
    }
}
