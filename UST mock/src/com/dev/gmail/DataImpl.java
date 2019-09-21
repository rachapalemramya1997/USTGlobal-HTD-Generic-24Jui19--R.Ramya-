package com.dev.gmail;

import java.util.HashMap;

public class DataImpl implements DataInt{
	HashMap<String, D> hm = new HashMap<String, D>();
	@Override
	public boolean addD(D d) {
		if (d != null) {
			hm.put("1", d);
		}
		return false;
	}

	@Override
	public boolean updateD() {
		
		return false;
	}

	@Override
	public void getD() {
		
		
	}

	@Override
	public boolean removeD(D d) {
		
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
	public String put(String string, D d) {
		
		return null;
	}
	

}
