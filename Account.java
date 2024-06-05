<<<<<<< HEAD
import java.util.Random;

public class Account {
	private int accountBalance;
	private int accountNumber;
	private String accountType;
	private String dateOfJoin;
	public Account() {
		
	}
	public Account(String accountType, String dateOfJoin) {
		this.accountNumber = genAcNo();
		this.dateOfJoin = dateOfJoin;
		this.accountType = accountType;
		this.accountBalance=genAcBal();
		
	}
//	genAc
	private int genAcNo() {
		
		Random R = new Random();
		return R.nextInt(10000000,99999999);
	}
	
// 
private int genAcBal() {
		
		Random R = new Random();
		return R.nextInt(10000,99999);
	}
	
	
	public int getAccountBalance() {
		
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber() {
		this.accountNumber = genAcNo();
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	
	public void display() {
		System.out.println("Account balance : "+accountBalance);
		System.out.println("Account Type : "+accountType);
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Date of join : "+dateOfJoin);
	}
	
	

}

=======
hi
  
>>>>>>> 250fd10f1903fbbbd8e6702d9e605e5f8334adfd
