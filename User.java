import java.util.ArrayList;

public class User {
	private String name;
	private String mobileNo;
	private int aadharNo;
	private String address;
	private int age;
	Bank b;
	
	public User() {
		
	}
	public User(String name, String mobileNo, int aadharNo, String address, int age) {
		this.name = name;
		this.mobileNo = mobileNo;
		this.aadharNo = aadharNo;
		this.address = address;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	ArrayList<Account> a=new ArrayList<Account>();
	public void addAccount(Account ac) {
		a.add(ac);
	}
	
	public void showAccountDetails() throws AccountsNotYetCreatedException {
		if(a.isEmpty()) {
			throw new AccountsNotYetCreatedException();
		}
		for(Account ac:a) {
			ac.display();
		    
		}
	}
	public void deposit(int amoumt) throws UserNotYetAddedException {
		if(a.isEmpty()) {
			throw new UserNotYetAddedException();
		}
		for(Account ac:a) {
//			System.out.println("Old Balance : "+ac.getAccountBalance());
			ac.setAccountBalance(ac.getAccountBalance()+amoumt);
//			System.out.println("Updated account balance : "+ac.getAccountBalance());
		}
		System.out.println("balance updated");
		
	}
	public void withdraw(int amoumt) throws UserNotYetAddedException {
		if(a.isEmpty()) {
			throw new UserNotYetAddedException();
		}
		for(Account ac:a) {
			int currentBal=ac.getAccountBalance();
			if(currentBal<amoumt) {
				System.out.println("Invalid amout to withdraw ,Enter the amount  upto: "+currentBal);
			    return;
			}
			else {
//			System.out.println("Old Balance : "+currentBal);
			ac.setAccountBalance(ac.getAccountBalance()-amoumt);
//			System.out.println("Updated balance : "+ac.getAccountBalance());
		}
			
		}
		System.out.println("balance updated");
		
	}
	public void showBalance() throws UserNotYetAddedException  {
		if(a.isEmpty()) {
			throw new UserNotYetAddedException();
		}
		for(Account ac:a) {
			
			System.out.println("account has : "+ac.getAccountBalance()+" rupees");
		}
		
		
	}
	
	
	public void displayUser() {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Mobile Number : "+this.mobileNo);
		System.out.println("AAdhar number : "+this.aadharNo);
		System.out.println("Address : "+this.address);
	}
	
	

}
