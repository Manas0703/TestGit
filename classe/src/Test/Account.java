package Test;

public class Account {

	private String accountnumber;
	private double balance;
	private String Name;
	private String email;
	private String phoneNumber;

	public void deposit(double depositAmount) {
		this.balance +=depositAmount; 
		System.out.println("Deopsit of" + depositAmount + "done. Total balance= " +this.balance);
	}
	public void withdraw(double withdrawalAmount) {
		if(this.balance- withdrawalAmount <0 ) {
			System.out.println("Only" + this.balance + "available. Withdrawal not processed");
		} else {
			this.balance -= withdrawalAmount;
			System.out.println("Withdrawal of" + withdrawalAmount + "done. Remaining balance= " +this.balance);
		}
	}

	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



}
