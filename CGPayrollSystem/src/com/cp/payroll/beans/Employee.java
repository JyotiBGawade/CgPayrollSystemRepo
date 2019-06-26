package com.cp.payroll.beans;

public class Employee {
	int id;
	String firstname, lastname, emailid, pancard, designation, department;
	private Bankdetails bank;
	private salary sal;

	public Employee(){}

	public Employee(int id, String firstname, String lastname, String emailid, String pancard, String designation,
			String department, Bankdetails bank, salary sal) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.pancard = pancard;
		this.designation = designation;
		this.department = department;
		this.bank = bank;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Bankdetails getBank() {
		return bank;
	}

	public void setBank(Bankdetails bank) {
		this.bank = bank;
	}

	public salary getSal() {
		return sal;
	}

	public void setSal(salary sal) {
		this.sal = sal;
	}


	
}


