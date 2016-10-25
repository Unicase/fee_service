package com.abnamro.poc.feeservice;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class Contract {
	int id;
	int version;
	String source;
	String family, group, type;
	
	@XmlElement(name="identifier")
	public void setId(int id) {
		this.id = id;
	}

	@XmlElement
	public void setVersion(int version) {
		this.version = version;
	}
	
	@XmlElement
	public void setSource(String source) {
		this.source = source;
	}
	
	@XmlElement
	public void setFamily(String family) {
		this.family = family;
	}
	
	@XmlElement
	public void setGroup(String group) {
		this.group = group;
	}
	
	@XmlElement
	public void setType(String type) {
		this.type = type;
	}
}
