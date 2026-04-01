package com.springcore.standalone.collection;

import java.util.List;

public class person {
private List<String> brothers;

public List<String> getBrothers() {
	return brothers;
}

public void setBrothers(List<String> brothers) {
	this.brothers = brothers;
}

@Override
public String toString() {
	return "person [brothers=" + brothers + "]";
}

}
