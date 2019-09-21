package com.dev.gmail;

public class Inbox {
	private int Message_Id;
	private int User_id;
	private String Messages;
	public int getMessage_Id() {
		return Message_Id;
	}
	public void setMessage_Id(int message_Id) {
		Message_Id = message_Id;
	}
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	public String getMessages() {
		return Messages;
	}
	public void setMessages(String messages) {
		Messages = messages;
	}
	@Override
	public String toString() {
		return "Inbox [Message_Id=" + Message_Id + ", User_id=" + User_id + ", Messages=" + Messages + "]";
	}



}
