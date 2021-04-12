package ga.fumyparli.e2;

import ga.fumyparli.e2.member.Grade;
import ga.fumyparli.e2.member.Member;
import ga.fumyparli.e2.member.MemberService;
import ga.fumyparli.e2.member.MemberServiceImpl;
import ga.fumyparli.e2.order.Order;
import ga.fumyparli.e2.order.OrderService;
import ga.fumyparli.e2.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService=new MemberServiceImpl();
        OrderService orderService=new OrderServiceImpl();

        Long memberId=1L;
        Member member= new Member(memberId,"member1", Grade.VIP);
        memberService.join(member);

        Order order=orderService.createOrder(memberId,"item1",10000);

        System.out.println("order: "+order.toString()); // println에 객체를 넣으면 객체의 toString이 불림
        System.out.println("orderPrice: "+order.calculatePrice());
    }
}
