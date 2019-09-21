package com.dev.gmail;

public interface AccountInt {
	public boolean addAccount(Account a);	
	public boolean updateAccount();
	public void getAccount();
	public boolean removeAccount(Account a);
	public boolean containsKey();
	public boolean containsValue();
	public String put(String string, Account e);

}
