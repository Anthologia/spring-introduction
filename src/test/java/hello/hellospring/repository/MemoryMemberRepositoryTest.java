package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MemoryMemberRepositoryTest {
    // 순서에 의존적인 설계는 지양하자
    // 테스트가 하나 끝나면 항상 데이터를 클리어 시켜야 한다.

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    public void save() {
        Member member = new Member();
        member.setName("anthologia");

        repository.save(member);
        Member result = repository.findById(member.getId()).get();
        // Assertions.assertEquals(member, result);
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("anthologia1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("anthologia2");
        repository.save(member2);

        Member result = repository.findByName("anthologia1").get();
        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("anthologia1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("anthologia2");
        repository.save(member2);

        List<Member> result = repository.findAll();
        assertThat(result.size()).isEqualTo(2);
    }

}
