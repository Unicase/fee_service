package com.abnamro.poc.feeservice;

import java.io.File;
import java.io.FileInputStream;
import org.apache.commons.io.IOUtils;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.camel.CamelContext;
import org.apache.camel.spring.SpringCamelContext;
import org.apache.camel.ProducerTemplate;

public class FeeService {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext appContext = new ClassPathXmlApplicationContext("file:SpringFeeService.xml");
		
		CamelContext camelContext = (SpringCamelContext) appContext.getBean("mycamel");
		
		camelContext.start();
	}
}
