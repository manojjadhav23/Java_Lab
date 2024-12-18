package com.demo.service;

import java.util.Set;

import com.demo.beans.Account;

public interface AccountService  {
	boolean OpenNewAccount(int ch);

	Set<Account> DisplayAll();

	int WithdrawAmount(String name, int pin,double amt);

	double DepositAmount(String name, int pin, Double amt);

	boolean transferfund(String uname, String duname, int pin, Double amt);

}
