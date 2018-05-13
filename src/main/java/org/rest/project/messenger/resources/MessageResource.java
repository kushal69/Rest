package org.rest.project.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.rest.project.messenger.model.Message;
import org.rest.project.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage() {
		MessageService messageService = new MessageService();

		return messageService.getAllMessages();
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long messageId){
		MessageService messageService = new MessageService();
		return messageService.getMessage(messageId);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message addMessages(Message message){
		MessageService messageService = new MessageService();
		return messageService.addMessage(message);
	}

}
