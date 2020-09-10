package com.ssafy.blockchallen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssafy.blockchallen.entity.Wallet;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {
	
}
