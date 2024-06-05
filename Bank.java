import java.util.ArrayList;
import java.util.Iterator;
public class Bank {

	private String banKName="BankOfHyderabad";
	private String ifsc="BOH123456";
	private String branch="KPHB";
    public Bank() {
    	
    }
    
	public Bank(String banKName, String ifsc, String branch) {
		this.banKName = banKName;
		this.ifsc = ifsc;
		this.branch = branch;
	}

	public String getBanKName() {
		return banKName;
	}
	public void setBanKName(String banKName) {
		this.banKName = banKName;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

	ArrayList<User> u=new ArrayList<User>();
	public void addUser(User m) {
		u.add(m);
	}
	public void showUser() throws UserNotYetAddedException {
		if(u.isEmpty()) {
			throw new UserNotYetAddedException();
		}
		for(User s:u) {
			s.displayUser();
		}
	}
	public boolean searchUser(String name) throws UserNotYetAddedException {
		if(u.isEmpty()) {
			throw new UserNotYetAddedException();
		}
		for(User s:u) {
			if(s.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	public void upDateMobileNo(String name,String num) {
		for(User s:u) {
			if(s.getName().equals(name)) {
				s.setMobileNo(num);
				System.out.println("Mobile no Updated :"+s.getMobileNo());
				
			}
		}
		
	}
	public void removeUser(int aadharNum) {
		
		Iterator<User> userIterator = u.iterator();
		boolean userRemoved = false;
        while (userIterator.hasNext()) {
            User user = userIterator.next();
            if (user.getAadharNo() == aadharNum) {
                userIterator.remove();
                userRemoved = true;
                System.out.println("User removed successfully.");
            }
        }
        if (!userRemoved) {
            System.out.println("No user found with the given aadhar number.");
        }
		
				
			
		
	}
	
	public void display() {
		System.out.println(this.banKName);
		System.out.println(this.ifsc);
		System.out.println(this.branch);
	}
	
	
	
	
}
