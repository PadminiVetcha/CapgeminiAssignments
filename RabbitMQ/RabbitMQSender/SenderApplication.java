package org.padmini.rabbitmq;

import org.padmini.rabbitmq.customer.CustomerMgmt;
import org.padmini.rabbitmq.customer.RabbitMQConfiguration;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SenderApplication implements CommandLineRunner {
	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SenderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * CustomerMgmt c1=new CustomerMgmt(); c1.setId(1); c1.setName("Padmini");
		 */
		  CustomerMgmt c2=new CustomerMgmt(); c2.setId(3); c2.setName("Jyothi");
		 
		System.out.println("Sending message.....!!!!");
		rabbitTemplate.convertAndSend(RabbitMQConfiguration.topicExchangeName, "message_routing_key", c2);
		/*
		 * rabbitTemplate.convertAndSend(RabbitMQConfiguration.topicExchangeName,
		 * "message_routing_key",c2);
		 */
		System.out.println("Message is sent successfully....!!!!");
	}

}
