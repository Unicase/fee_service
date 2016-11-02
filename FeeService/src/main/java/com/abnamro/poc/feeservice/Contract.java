package com.abnamro.poc.feeservice;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

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

        public int getId() {
            return this.id;
        }

	@XmlElement
	public void setVersion(int version) {
		this.version = version;
	}

        public int getVersion() {
            return this.version;
        }
	
	@XmlElement
	public void setSource(String source) {
		this.source = source;
	}

        public String getSource() {
            return this.source;
        }
	
	@XmlElement
	public void setFamily(String family) {
		this.family = family;
	}

        public String getFamily() {
            return this.family;
        }
	
	@XmlElement
	public void setGroup(String group) {
		this.group = group;
	}

        public String getGroup() {
            return this.group;
        }
	
	@XmlElement
	public void setType(String type) {
		this.type = type;
	}

        public String getType() {
            return this.type;
        }
}
