import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class CreateCustomerProfile {

	public static void main(String[] args) 
	{
		createCustomerProfile ();
		//getAge (2000);

	}
	
	public static void createCustomerProfile ()
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println("Input first name : ");
		String firstName = input.nextLine();
		System.out.println("Input last name : ");
		String LasttName = input.nextLine();
		System.out.println("Input date of birth name : ");
		String dateOfBirth = input.nextLine();
		System.out.println("Input month of birth name : ");
		String monOfBirth = input.nextLine();
		System.out.println("Input year of birth name : ");
		String yearOfBirth = input.nextLine();
		
		
		Date l_date = new Date(); 
		SimpleDateFormat DateString = new SimpleDateFormat("dd/MM/yyyy");
		String stringDate= DateString.format(l_date);
		//System.out.println("Date : "+stringDate);
		int currentyear = Integer.parseInt(stringDate.substring(6));
		//System.out.println("Customer age : "+(currentyear- Integer.parseInt(yearOfBirth)));
		//System.out.println("Current year : "+currentyear);
		
		//System.out.print("\033[H\033[2J");  
		System.out.flush();  
		
		System.out.println(":: Customer Profile ::");
		System.out.println("Full Name : "+(firstName+" "+LasttName));
		System.out.println("DOB : "+(dateOfBirth+"/"+monOfBirth+"/"+yearOfBirth));
		System.out.println("Age : "+(getAge(Integer.parseInt(yearOfBirth))));
		
	}
	
	public static int getAge (int yearOfBirth)
	{
		Date l_date = new Date(); 
		SimpleDateFormat DateString = new SimpleDateFormat("dd/MM/yyyy");
		String stringDate= DateString.format(l_date);
		//System.out.println("Date : "+stringDate);
		int currentyear = Integer.parseInt(stringDate.substring(6));
		System.out.println("Age : "+(currentyear- yearOfBirth));
		
		return (currentyear- yearOfBirth);
	}

}
