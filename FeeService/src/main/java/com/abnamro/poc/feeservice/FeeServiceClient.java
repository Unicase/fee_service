package com.abnamro.poc.feeservice;

import java.io.File;
import java.io.FileInputStream;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.commons.io.IOUtils;


public class FeeServiceClient {

	public static void main(String[] args) throws Exception {
		String filename = args[0];
		
		FileInputStream fis = new FileInputStream(new File(filename));
		String xmlcontent = IOUtils.toString(fis);
		
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://feeservice.hopto.org:61616");
		 
        Connection connection = connectionFactory.createConnection();
        connection.start();

        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        Destination destination = session.createQueue("test");

        MessageProducer producer = session.createProducer(destination);
        producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

        TextMessage message = session.createTextMessage(xmlcontent);
        
        producer.send(message);

        session.close();
        connection.close();
	}
}
