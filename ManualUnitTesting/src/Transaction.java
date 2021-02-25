import java.util.ArrayList;

public class Transaction {
	
	private String accNum;
	private double credit;
	private double debit;
	
	public void setTrans (String accNum, double debit, double credit)
	{
		this.accNum=accNum;
		this.credit=credit;
		this.debit=debit;
	}
	
	public double getDeposit ()
	{
		return credit;
	}
	
	public double getWithdrawal ()
	{
		return debit;
	}
	
	

	public static void main(String[] args) 
	{
		ArrayList<Transaction> tranData = new ArrayList<Transaction> ();
		
		Transaction trans = new Transaction();
		

	}

}
