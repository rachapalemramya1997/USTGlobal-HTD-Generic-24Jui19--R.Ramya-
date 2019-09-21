package com.dev.gmail;

import java.util.HashMap;

public class InboxData {

	public static void main(String[] args) {
		HashMap<String, Inbox> m = new HashMap<String, Inbox>();

		Inbox i = new Inbox();
		i.setMessage_Id(4);
		i.setUser_id(1);
		i.setMessages("I am ramya from ust global");

		Inbox i1 = new Inbox();
		i1.setMessage_Id(5);
		i1.setUser_id(2);
		i1.setMessages("Reddy likes himalayas");

		Inbox i2 = new Inbox();
		i2.setMessage_Id(6);
		i2.setUser_id(3);
		i2.setMessages("Hello world i am ram welcome to j");

		System.out.println(".....Inbox.....");

		m.put("1", i);
		m.put("2", i1);
		m.put("3", i2);
		System.out.println(m);

		m.getClass();
		System.out.println(m);
		System.out.println("Output of containsKey(): "
				+m.containsKey(1));

		//		Inbox p = m.remove("1");
		//		System.out.println(p);

		System.out.println("Output of containsValue(): "
				+m.containsValue(i2));


	}

}
