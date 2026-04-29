package com.bhushan.sbeans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApplianceFactory {

	
	  @Autowired
	    private Map<String, Appliance> applianceMap;

	    public Appliance getAppliance(String type) {
	        return applianceMap.get(type);
	    }
}
