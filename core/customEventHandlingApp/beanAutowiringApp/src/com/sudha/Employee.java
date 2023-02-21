package com.sudha;

public class Employee {

	private String eid;
	private String ename;
	private Address addr;
	private Account acc;
	
	public Employee() {
		
	}

	public Employee(String eid, String ename, Address addr, Account acc) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.addr = addr;
		this.acc = acc;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public void getEmployeeDetails() {
		System.out.println("Employee Details");
		System.out.println("===================");
		System.out.println("Employee Id :" + eid);
		System.out.println("Employee Name :" + ename);
		System.out.println();
		System.out.println("Employee Address Details");
		System.out.println("===========================");
		System.out.println("Plot Number :" + addr.getPno());
		System.out.println("Street Name :" + addr.getStreet());
		System.out.println("City :" + addr.getCity());
		System.out.println("Country Name :" + addr.getCountry());
		System.out.println();
		System.out.println("Employee Account Details");
		System.out.println("====================");
		System.out.println("Account Number :" + acc.getAccNo());
		System.out.println("Account Name :" + acc.getAccName());
		System.out.println("Account Type :" + acc.getAccType());
		System.out.println("Account Balance :" + acc.getBalance());
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", addr=" + addr + ", acc=" + acc + "]";
	}

}
