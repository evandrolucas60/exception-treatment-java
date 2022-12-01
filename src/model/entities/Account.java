package model.entities;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawAmount;
	
	//constructors
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawAmount) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawAmount = withdrawAmount;
	}

	//getters and setters
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawAmount() {
		return withdrawAmount;
	}
	
	//methods
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	
	
	
}
