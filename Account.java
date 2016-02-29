import java.util.ArrayList;

public class Account {

	String name;
	private int id;
	private double balance = 0;
	double withdraw = 0;
	double deposit = 0;
	private char type;
	private double amount;
	private double annualInterest;
	double annualInterestRate = 0;
	private double monthlyInterestRate;
	private double MonthlyInterest;
	private double primitivebalance;
	ArrayList transactions = new ArrayList();


	Account(){

	}

	Account(String newName ,int newId , double newBalance) {

		name = newName;
		id = newId;
		balance = newBalance;
	
	}

	String getName(){
		return name;
	}

	int getId (){
		return id ;
	}

//	ArrayList transactions = new ArrayList();


	void setAnnualInterestRate (double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate / 100 ;
	}
	double getAnnualInterest() {
		return annualInterest;
	}
	double getAnnualInterestRate() {
		annualInterest = primitivebalance * annualInterestRate;
		return annualInterestRate;
	}

/*
	void setMonthlyInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate ;
		monthlyInterestRate = annualInterestRate / (12 * 100);
	}


	void getMonthlyInterestRate(){
		MonthlyInterest = primitivebalance * monthlyInterestRate ;
	}
	double getMonthlyInterest(){
		return MonthlyInterest;
	}
	

*/
	void getdeposit(double amount){
		balance += amount ;
		transactions.add(new Transaction('D',amount,balance));
	}
	void getwithdraw(double amount){
		balance -= amount ;
		transactions.add(new Transaction('W',amount,balance));
	}

	double endBalance(){
		return balance ; 
	}	

	ArrayList getTransactions() {
		return transactions;
	}

}


class Transaction {

	private char type;
	private double amount;
	private double balance;
	private String description;



	Transaction (char newType,double newAmount,double newBalance) {

		type = newType;
		amount = newAmount;
		balance = newBalance;

	}



	char getType(){
		return type;
	}
	double getAmount() {
		return amount;
	}
	double getBalance() {
		return balance;
	}
	String getDescription() {
		return description;
	}

}