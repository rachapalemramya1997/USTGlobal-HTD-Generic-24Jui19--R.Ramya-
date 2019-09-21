package com.dev.gmail;

import java.util.HashMap;

public class AccountImpl implements AccountInt{


	HashMap<String, Account> hm = new HashMap<String, Account>();

	@Override
	public boolean addAccount(Account a) {
		if (a != null) {
			hm.put("1", a);
		}
		return false;
	}

	@Override
	public boolean updateAccount() {

		return false;
	}

	@Override
	public void getAccount() {


	}

	@Override
	public boolean removeAccount(Account a) {

		return false;
	}

	@Override
	public boolean containsKey() {

		return false;
	}

	@Override
	public boolean containsValue() {

		return false;
	}

	@Override
	public String put(String string, Account e) {

		return null;
	}

}
