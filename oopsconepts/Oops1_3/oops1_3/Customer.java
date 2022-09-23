package com.oops1_3;

public class Customer {
	//CustId, accountno, custname, cust_address, cust_dob, cust_account_opening_date, 
		//Branch_Obj. 
		int CustId;
		long accountno;
		String custname;
		String cust_address;
		String cust_dob;
		String cust_account_opening_date;
		Branch branch;
		
		
		public int getCustId() {
			return CustId;
		}
		public void setCustId(int custId) {
			CustId = custId;
		}
		public long getAccountno() {
			return accountno;
		}
		public void setAccountno(long accountno) {
			this.accountno = accountno;
		}
		public String getCustname() {
			return custname;
		}
		public void setCustname(String custname) {
			this.custname = custname;
		}
		public String getCust_address() {
			return cust_address;
		}
		public void setCust_address(String cust_address) {
			this.cust_address = cust_address;
		}
		public String getCust_dob() {
			return cust_dob;
		}
		public void setCust_dob(String cust_dob) {
			this.cust_dob = cust_dob;
		}
		public String getCust_account_opening_date() {
			return cust_account_opening_date;
		}
		public void setCust_account_opening_date(String cust_account_opening_date) {
			this.cust_account_opening_date = cust_account_opening_date;
		}
		public Branch getBranch() {
			return branch;
		}
		public void setBranch(Branch branch) {
			this.branch = branch;
		}
		@Override
		public String toString() {
			return "Customer [CustId=" + CustId + ", accountno=" + accountno + ", custname=" + custname
					+ ", cust_address=" + cust_address + ", cust_dob=" + cust_dob + ", cust_account_opening_date="
					+ cust_account_opening_date + ", branch=" + branch + "]";
		}
		
}
