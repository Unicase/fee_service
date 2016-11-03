package com.abnamro.poc.feeservice;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
@XmlRootElement
public class Contract {
	long id;
	int contractId;
	int version;
	String source;
	String family, group, type;
	
	@Id
	@GeneratedValue
	public long getId() {
        return this.id;
	}
	
	public void setId(long id) {
        this.id = id;
	}
	
	@XmlElement(name="identifier")
	public void setContractId(int id) {
		this.contractId = id;
	}

    public int getContractId() {
        return this.contractId;
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

	@Column(name = "fgroup")
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
