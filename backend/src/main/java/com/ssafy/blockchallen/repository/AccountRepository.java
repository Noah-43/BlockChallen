package com.ssafy.blockchallen.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssafy.blockchallen.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
	Optional<Account> findByEmail(String email);
	Optional<Account> findById(Long id);
	Optional<Account> findByNickname(String nickname);
}
