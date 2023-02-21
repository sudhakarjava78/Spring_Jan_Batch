package com.sudha;

public class Course {

	private String cid;
	private String cname;
	private Integer ccost;

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getCcost() {
		return ccost;
	}

	public void setCcost(Integer ccost) {
		this.ccost = ccost;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", ccost=" + ccost + "]";
	}

}
