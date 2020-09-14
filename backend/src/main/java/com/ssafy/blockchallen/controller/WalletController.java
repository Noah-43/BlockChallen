package com.ssafy.blockchallen.controller;

import com.ssafy.blockchallen.service.IWalletService;
import com.ssafy.blockchallen.service.impl.WalletService;
import com.ssafy.blockchallen.entity.Wallet;
import com.ssafy.blockchallen.repository.WalletRepository;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/blockchallen")
public class WalletController {
	public static final Logger logger = LoggerFactory.getLogger(WalletController.class);

	@Autowired
	private IWalletService walletService; 

	/**
	 * TODO Sub PJT Ⅱ 과제 1
	 * 지갑 등록
	 * @param wallet
	 */
	@ApiOperation(value = "Register wallet of user")
	@RequestMapping(value = "/wallet/create", method = RequestMethod.POST)
	public Wallet create(@Valid @RequestBody Wallet wallet) {
		return walletService.create(wallet);
	}

	/**
	 * TODO Sub PJT Ⅱ 과제 1
	 * 지갑 조회 by address
	 * @param address 지갑 주소
	 */
	@ApiOperation(value = "Fetch wallet by address")
	@RequestMapping(value = "/wallets/{address}", method = RequestMethod.GET)
	public Wallet findAddress(@PathVariable String address) { // 지갑 주소 전달(address)
		return walletService.findAddress(address);
	}

	/**
	 * TODO Sub PJT Ⅱ 과제 1
	 * 지갑 조회 by user's id
	 * @param uid 사용자 id
	 */
	@ApiOperation(value = "Fetch wallet of user")
	@RequestMapping(value = "/wallets/of/{uid}", method = RequestMethod.GET)
	public Wallet findUserId(@PathVariable long userId) {
		return walletService.findUserId(userId);
	}
	
	/**
	 * TODO Sub PJT Ⅱ 과제 1
	 * 이더 충전 요청
	 * @param address 지갑 주소
	 */
	@ApiOperation(value = "Request ether")
	@RequestMapping(value ="/wallets/{address}", method = RequestMethod.PUT)
	public Wallet requestEth(@PathVariable String address){ // 테스트 가능하도록 일정 개수의 코인을 충전해준다.
		//Wallet newWallet = this.walletService.get(address);
		return null;
	}

}
