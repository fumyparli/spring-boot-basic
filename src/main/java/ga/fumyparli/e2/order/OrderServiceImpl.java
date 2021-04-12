package ga.fumyparli.e2.order;

import ga.fumyparli.e2.discount.DiscountPolicy;
import ga.fumyparli.e2.discount.FixDiscountPolicy;
import ga.fumyparli.e2.member.Member;
import ga.fumyparli.e2.member.MemberRepository;
import ga.fumyparli.e2.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository=new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy=new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member= memberRepository.findById(memberId);
        int discountPrice=discountPolicy.discount(member,itemPrice);

        return new Order(memberId,itemName,itemPrice,discountPrice);
    }
}
