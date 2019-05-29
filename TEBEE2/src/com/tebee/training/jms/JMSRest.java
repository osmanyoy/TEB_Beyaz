package com.tebee.training.jms;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.Queue;
import javax.jms.Topic;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/jms")
public class JMSRest {
	
	@Inject
	private JMSContext context;
	
	@Resource(lookup = "java:/jms/queue/JMSQueue")
	private Queue queue;
	
	@Resource(lookup = "java:/jms/queue/JMSTopic")
	private Topic topic;

	@Path("/queue/{msg}")
	@GET
	public String sendTextMessage(@PathParam("msg") String msg) {
		context.createProducer().send(queue, msg);
		return "OK";
	}

	@Path("/topic/{msg}")
	@GET
	public String sendTextMessageTopic(@PathParam("msg") String msg) {
		context.createProducer().send(topic, msg);
		return "OK";
	}

}
