import java.text.DecimalFormat;

public class Account {
	
	private String accNum;
	private String accHolder;
	private double bal;
	private double recentTran;
	private double accumInterest;
	final double interest = 0.35;
	
	 public void setAccountInfo(String accNum, String accHolder, double bal, double recentTran, double accumInterest)
	 {
		    this.accNum = accNum;
		    this.accHolder = accHolder;
		    this.bal = bal;
		    this.recentTran = recentTran;
		    this.accumInterest = accumInterest;
	 }
	 
	 public void setBal (double bal)
	 {
		 this.bal=bal;
	 }
	 
	 public double getBal ()
	 {
		 return bal;
	 }
	 
	 public void withdraw(double amount)
	 {
		 double bal = getBal();
		 
		 bal -= amount;
		 if (bal>0) 
		 {
			 setBal (bal); 
		 }	 
		 else
		 {
			 System.out.println("Insufficient balance!");
		 }
			 
	 }
	 
	 public void setInterest (double amount)
	 {
		 this.accumInterest=amount;
	 }
	
	 public double getInterest ()
	 {
		 return accumInterest;
	 }
	
	 
	 public void computeInterest ()
	 {
		 double bal = getBal();
		 double interestEarn = interest*bal/100;
		 bal+=interestEarn;
		 setBal (bal); 
		 setInterest (interestEarn);
		 
	 }
	 
	 public void deposit(double amount)
	 {
		 double bal = getBal();
		 bal+=amount;
		 setBal(bal);
	 }
	
	
	public static void main(String[] args) 
	{
		Account acc = new Account();
		acc.setAccountInfo("123", "Zairul", 300.50, 10.45, 0.0);
		
		System.out.println(acc.getBal());
		
		acc.withdraw(100.00);
		System.out.println(acc.getBal());
		
		acc.computeInterest ();
		
		DecimalFormat df = new DecimalFormat("####0.00");
		//df.format(value)
		System.out.println(df.format(acc.getBal()));
		System.out.println("Accummulated interest : "+acc.getInterest());

	}

}
