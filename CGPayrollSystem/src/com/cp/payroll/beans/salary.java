package com.cp.payroll.beans;

public class salary{
	int id;
	String basicsalary, hra, conveyenceallowance, 
	otherallowance, personalallowance, monthlytax, epf, companypf, netsalary;

	public salary(){}

	public salary(int id, String basicsalary, String hra, String conveyenceallowance, String otherallowance,
			String personalallowance, String monthlytax, String epf, String companypf, String netsalary) {
		super();
		this.id = id;
		this.basicsalary = basicsalary;
		this.hra = hra;
		this.conveyenceallowance = conveyenceallowance;
		this.otherallowance = otherallowance;
		this.personalallowance = personalallowance;
		this.monthlytax = monthlytax;
		this.epf = epf;
		this.companypf = companypf;
		this.netsalary = netsalary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBasicsalary() {
		return basicsalary;
	}

	public void setBasicsalary(String basicsalary) {
		this.basicsalary = basicsalary;
	}

	public String getHra() {
		return hra;
	}

	public void setHra(String hra) {
		this.hra = hra;
	}

	public String getConveyenceallowance() {
		return conveyenceallowance;
	}

	public void setConveyenceallowance(String conveyenceallowance) {
		this.conveyenceallowance = conveyenceallowance;
	}

	public String getOtherallowance() {
		return otherallowance;
	}

	public void setOtherallowance(String otherallowance) {
		this.otherallowance = otherallowance;
	}

	public String getPersonalallowance() {
		return personalallowance;
	}

	public void setPersonalallowance(String personalallowance) {
		this.personalallowance = personalallowance;
	}

	public String getMonthlytax() {
		return monthlytax;
	}

	public void setMonthlytax(String monthlytax) {
		this.monthlytax = monthlytax;
	}

	public String getEpf() {
		return epf;
	}

	public void setEpf(String epf) {
		this.epf = epf;
	}

	public String getCompanypf() {
		return companypf;
	}

	public void setCompanypf(String companypf) {
		this.companypf = companypf;
	}

	public String getNetsalary() {
		return netsalary;
	}

	public void setNetsalary(String netsalary) {
		this.netsalary = netsalary;
	}
	
}
