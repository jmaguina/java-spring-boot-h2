package com.srm.test.clientinfo.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Cesar.
 * @version 1.0
 */
@Entity
public class Client {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String limitCredit;
	private String type;
	private String result;

	public Client() {
		super();
	}

	public Client(Long id, String name, String limitCredit, String type, String result) {
		super();
		this.id = id;
		this.name = name;
		this.limitCredit = limitCredit;
		this.type = type;
		this.result = result;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLimitCredit() {
		return limitCredit;
	}

	public void setLimitCredit(String limitCredit) {
		this.limitCredit = limitCredit;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getType() {

		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
