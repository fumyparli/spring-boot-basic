package ga.fumyparli.e2;

import ga.fumyparli.e2.member.Grade;
import ga.fumyparli.e2.member.Member;
import ga.fumyparli.e2.member.MemberService;
import ga.fumyparli.e2.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService=new MemberServiceImpl();
        Member member=new Member(1L,"member1", Grade.VIP);
        memberService.join(member);

        Member toFind=memberService.findMember(1L);
        System.out.println("member1: "+member.getName());
        System.out.println("toFind: "+ toFind.getName());
    }
}
