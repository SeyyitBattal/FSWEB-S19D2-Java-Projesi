package com.security.securityapp.dao;

import com.security.securityapp.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    @Query("SELECT u FROM Member u WHERE u.email=:email")
    Optional<Member> findUserByEmail(String email);
}
