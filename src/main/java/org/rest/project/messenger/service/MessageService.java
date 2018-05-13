package org.rest.project.messenger.service;

import java.util.ArrayList;
import java.util.List;
import org.rest.project.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessages(){
		Message m1 = new Message(1, "Hello World 1", "Kushal");
		Message m2 = new Message(2, "Hello World 2", "Kushal");
		
		List<Message> messageList = new ArrayList<Message>();
		messageList.add(m1);
		messageList.add(m2);
		
		return messageList;
	}
}
