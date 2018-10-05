
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationBankDetails {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String customerId;
		String name;
		String emailId;
		String mobileNo;
		String accountNo;
		String openingDate;
		
		Pattern pattern;
		Matcher matcher;
		
		System.out.println("Enter customer id: ");
		customerId=sc.next();
		pattern=Pattern.compile("[0-9]{6}{10}");
		matcher=pattern.matcher(customerId);
		while(!matcher.find())
		{
			System.out.println("Enter valid customer id: ");
			customerId=sc.next();
			matcher=pattern.matcher(customerId);
		}
		
		System.out.println("Enter customer name: ");
		name=sc.next();
		pattern=Pattern.compile("[a-zA-Z]");
		matcher=pattern.matcher(name);
		while(!matcher.find())
		{
			System.out.println("Enter valid customer name: ");
			name=sc.next();
			matcher=pattern.matcher(name);
		}
		
		System.out.println("Enter the email id: ");
		emailId=sc.next();
		pattern=Pattern.compile("\b[a-z0-9._]@[a-z0-9._]+.[a-z]{2,}\b");
		matcher=pattern.matcher(emailId);
		while(!matcher.find())
		{
			System.out.println(" please Enter valid email id: ");
			emailId=sc.next();
			matcher=pattern.matcher(emailId);
		}
		
		System.out.println("Enter the mobile no: ");
		mobileNo=sc.next();
		pattern=Pattern.compile("[0-9]{10}");
		matcher=pattern.matcher(mobileNo);
		while(!matcher.find())
		{
			System.out.println(" please Enter valid mobile no: ");
			mobileNo=sc.next();
			matcher=pattern.matcher(mobileNo);
		}
		
		System.out.println("Enter account no: ");
		accountNo=sc.next();
		pattern=Pattern.compile("[0-9]{3}{6}");
		matcher=pattern.matcher(accountNo);
		while(!matcher.find())
		{
			System.out.println("Enter valid account no: ");
			accountNo=sc.next();
			matcher=pattern.matcher(accountNo);
		}
		
		System.out.println("Enter opening date: ");
		openingDate=sc.next();
		pattern=Pattern.compile("[0-9]{2}\\[0-9]{2}\\[0-9]{4}");
		matcher=pattern.matcher(openingDate);
		while(!matcher.find())
		{
			System.out.println("Enter valid opening date: ");
			openingDate=sc.next();
			matcher=pattern.matcher(openingDate);
		}
		
	}

}
