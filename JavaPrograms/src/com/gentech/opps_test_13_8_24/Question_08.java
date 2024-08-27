package com.gentech.opps_test_13_8_24;
class Bank
{
	private String AccountName;
	private String AccountHolderName;
	public String getAccountName() {
		return AccountName;
	}
	public void setAccountName(String accountName) {
		this.AccountName = accountName;
	}
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.AccountHolderName = accountHolderName;
	}
}
public class Question_08 {

	public static void main(String[] args) {
		Bank o=new Bank();
        o.setAccountName("SBI");
        o.setAccountHolderName("jay");
        
       String v1= o.getAccountHolderName();
        String v2=o.getAccountName();
        System.out.println("AccountHolderName:"+v1);
        System.out.println("AccountName:"+v2);
	}

}
