package com.bhushan.main;


import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bhushan.sbeans.ServiceCenter;

public class MainApp {
      public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/bhushan/config/SpringConfig.xml");
		   ServiceCenter objCenter = (ServiceCenter) ctx.getBean(ServiceCenter.class);
		   objCenter.performService();
		   ctx.close();
		}
		
	}

