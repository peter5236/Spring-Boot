package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// JpaRepository에서 기본적인 method, CRUD 등 기본 제공
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    @Override
    // 공통으로 할 수 없는 것들은 개별적으로 생성
    // select m from Member m where m.name = ?
    Optional<Member> findByName(String name);
}
