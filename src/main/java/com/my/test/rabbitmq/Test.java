package com.my.test.rabbitmq;

import java.io.IOException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Test {

//	private final static String QUEUE_NAME = "hello";

	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();

		
//		channel.exchangeDeclare("logs", "fanout");
//		
//		
//		channel.queueDeclare(QUEUE_NAME, false, false, false, null);
//		String message = "Hello World!";
//		channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
//		System.out.println(" [x] Sent '" + message + "'");

		channel.close();
		connection.close();

	}

}
