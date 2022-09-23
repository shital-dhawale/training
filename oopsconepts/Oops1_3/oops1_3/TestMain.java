package com.oops1_3;
//Create Class Customer which will have following class members: - 
//CustId, accountno, custname, cust_address, cust_dob, cust_account_opening_date, 
//Branch_Obj. 
//Class Branch  :- branch_id, branch_name, branch_address.
//Class Customer_Account_Statement:-  CAID, CustId, amount, deposit_withdrawl, 
//deposit_date. 
// Now you have to create Customer, Branch and CustomerAccountStatement class object. 
// CustomerAccountStatement will have multiple records as one customer will deposit 
// and withdrawal the amount. So you need to print the statement as per the CustomerId.
//What is expected:- you will create multiple object of customer class. 
//Also you have to create multiple object of the CustomerAccountStatement and 
//while printing detail of CustomerAccountStatement you have to print detail of Customer. 

public class TestMain {
	public static void main(String[] args) {
		Branch branch1 = new Branch();
		branch1.setBranch_id(1011);
		branch1.setBranch_address("Chinchwad-Pune");
		branch1.setBranch_name("Chinchwad");
		Customer customer1 = new Customer();
		Customer_Account_Statement cas = new Customer_Account_Statement(); 
		cas.setCAID(101);
		cas.setCustId(1);
		cas.setAmount(5000);
		cas.setDeposit_withdrawl("deposit");
		cas.setDeposit_date("30/07/2022");
		cas.setCustname("shital dhawale");
		cas.setAccountno(121973);
		cas.setCust_dob("05/01/1995");
		cas.setCust_account_opening_date("20/07/2022");
		cas.setCust_address("Chinchwad-411033");
		cas.setBranch(branch1);
		System.out.println(cas);
		
	}
}
