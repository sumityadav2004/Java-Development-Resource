package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class person {
private List<String> brothers;
private Map<String , Integer> feestructure;
private Properties properties;

public Map<String, Integer> getFeestructure() {
	return feestructure;
}

public void setFeestructure(Map<String, Integer> feestructure) {
	this.feestructure = feestructure;
}

public List<String> getBrothers() {
	return brothers;
}

public void setBrothers(List<String> brothers) {
	this.brothers = brothers;
}



public Properties getProperties() {
	return properties;
}

public void setProperties(Properties properties) {
	this.properties = properties;
}

@Override
public String toString() {
	return "person [brothers=" + brothers + ", feestructure=" + feestructure + ", properties=" + properties + "]";
}





}
