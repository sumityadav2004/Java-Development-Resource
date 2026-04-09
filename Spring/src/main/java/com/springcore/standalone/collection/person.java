package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;

public class person {
private List<String> brothers;
private Map<String , Integer> feestructure;
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

@Override
public String toString() {
	return "person [brothers=" + brothers + ", feestructure=" + feestructure + "]";
}



}
