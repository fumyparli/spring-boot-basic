package ga.fumyparli.e2.member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}
