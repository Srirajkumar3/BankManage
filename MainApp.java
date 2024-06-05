import java.util.Map.Entry;
import java.util.*;

public class MainApp {
public static void main(String[] args) throws UserNotYetAddedException, AccountsNotYetCreatedException {
	Scanner sc=new Scanner(System.in);
	Bank b=new Bank();
	User u=new User();
	Map<Account,User> details=new HashMap<Account, User>();
	Account a=new Account();
	boolean next=true;
	while(next) {
		System.out.println();
		System.out.println("Enter 1 to create account for user");
		System.out.println("enter 2 to display account details"); 
		System.out.println("Enter 3 to display user deatails");
		System.out.println("Enter 4 to deposit amount");
		System.out.println("Enter 5 to withdraw amount");
		System.out.println("Enter 6 to show balance ");
		System.out.println("Enter 7 to search user with name ");
		System.out.println("Enter 8 update mobile no based on account no");
		System.out.println("Enter 9 remove user based on aadhar no");
		System.out.println("Enter 10 to exit");
		int n=sc.nextInt();
	switch(n){
	
	
	case 1:
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Mobile no");
		String number=sc.next();
		System.out.println("Enter AadharNo");
		int aadarNo=sc.nextInt();
		System.out.println("Enter Address");
		String address=sc.next();
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		System.out.println("Enter Account Type:");
        String acType = sc.next();
        System.out.println("Enter Date of Join:");
        String date = sc.next();
        details.put(new Account(acType, date),new User(name,number,aadarNo,address,age));
        for(Entry<Account,User> entry:details.entrySet()) {
        	Account ac=entry.getKey();
        	User us=entry.getValue();
        	if(ac.getDateOfJoin().equals(date)&&us.getAadharNo()==aadarNo&&us.getMobileNo().equals(number)) {
            b.addUser(us);
            u.addAccount(ac);
        	}
        }
		break;
	case 2: u.showAccountDetails();
//	for(Map.Entry<Account, User> entry:details.entrySet()) {
// 	   Account a1=entry.getKey();
// 	   a1.display();
// 	   
// 	   }
	
	        break;   
    case 3:b.showUser();
            break;
    case 4: if( b.u.isEmpty()) {
    	    System.out.println("Account not yet Created Account");
            }
    else {
    	    System.out.print("Enter the amount to deposit to each user");
            int deposit=sc.nextInt();
            u.deposit(deposit);
           
    } break;
    case 5: if( b.u.isEmpty()) {
	         System.out.println("Account not yet Created Account");
            }
           else {
	       System.out.print("Enter the amount to withdraw to each user");
           int withdraw=sc.nextInt();
           u.withdraw(withdraw);
       
           } break;
    case 6: if( b.u.isEmpty()) {
        System.out.println("Account not yet Created Account");
       }
      else {
    	  u.showBalance();
      }
    break;
    case 7: if( b.u.isEmpty()) {
        System.out.println("User not yet Created Account");
       }
      else {
      System.out.print("Enter the name to search");
      String name1=sc.next();
      if(b.searchUser(name1)){
    	  System.out.println("User Found");
      }
      else {
    	  System.out.println("User not found");
      }
  
      } break;
    
    case 8:System.out.println("Enter the Account no");
           int acNo=sc.nextInt();
           for(Entry<Account,User> entry:details.entrySet()) {
        	   Account a2=entry.getKey();
        	   if(a2.getAccountNumber()==acNo) {
        		   System.out.print("Enter the number to Update");
        		   String num=sc.next();
        		   User e=entry.getValue();
        		   b.upDateMobileNo(e.getName(),num);
        		   break;
        		   
        	   }
        	   
        	   
        	  
           }
           
           break;
           
    case 9:System.out.println("Enter the aadhar number");
           int n1=sc.nextInt();
    	   b.removeUser(n1);
    	   break;
           
    case 10: System.out.println("Thank you visit again");
         	next=false;
	        break;
	        default:System.err.println("Enter the valid input");
	      
	        
	          
	       
	}
	}
}
}
