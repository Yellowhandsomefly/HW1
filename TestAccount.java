import java.util.ArrayList;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestAccount{
	public static void main(String[] args){

		Account account = new Account("George",1122,1000);

		account.setAnnualInterestRate(1.65);
		account.getdeposit(30);
		account.getdeposit(40);
		account.getdeposit(50);
		account.getwithdraw(5);	
		account.getwithdraw(4);
		account.getwithdraw(2);
		account.getAnnualInterestRate();

		ArrayList list = account.getTransactions();

		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/ddHH:mm:ss.SSS");
	       	Date current = new Date();

         	System.out.println(sdFormat.format(current));
		System.out.println("Your name is " + account.getName() + "Your AnnualInterestRate is " + account.getAnnualInterestRate());
		System.out.println(account.transactions);
	}

} 