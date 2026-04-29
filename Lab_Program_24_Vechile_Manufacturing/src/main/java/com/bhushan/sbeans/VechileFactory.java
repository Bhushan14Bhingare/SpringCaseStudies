package com.bhushan.sbeans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VechileFactory {
    
	@Autowired
	private Map<String,Vechile> vechileMap;
	
    public Vechile getVechile(String type) {
    	return vechileMap.get(type);
    }
	
}
