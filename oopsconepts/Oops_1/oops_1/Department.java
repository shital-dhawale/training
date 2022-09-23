package com.oops_1;

public class Department {
	private String deptid;
	private String dname;

	public Department(String deptid, String dname) {
		super();
		this.deptid = deptid;
		this.dname = dname;
	}

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}
}
