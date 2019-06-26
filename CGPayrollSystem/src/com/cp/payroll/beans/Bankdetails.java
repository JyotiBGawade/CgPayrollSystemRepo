package com.cp.payroll.beans;

public class Bankdetails{
	int id;
	String accountno, bankname, ifscode;

	public Bankdetails(){}

	public Bankdetails(int id, String accountno, String bankname, String ifscode) {
		super();
		this.id = id;
		this.accountno = accountno;
		this.bankname = bankname;
		this.ifscode = ifscode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getIfscode() {
		return ifscode;
	}

	public void setIfscode(String ifscode) {
		this.ifscode = ifscode;
	}
	
}

