import java.util.ArrayList;

public class Transaction {
	
	private String accNum;
	private double credit;
	private double debit;
	
	public void setCredit (String accNum, double credit)
	{
		this.accNum=accNum;
		this.credit=credit;
		
	}
	
	public void setDebit (String accNum, double debit)
	{
		this.accNum=accNum;
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
	
	public void performDeposit (String accNum, double amount, ArrayList<Transaction> tranData)
	{
		Transaction tran = new Transaction();
		tran.setCredit(accNum,amount);
		tranData.add(tran);
	}
	
	public void performWithdrawal (String accNum, double amount, ArrayList<Transaction> tranData)
	{
		Transaction tran = new Transaction();
		tran.setDebit(accNum, amount);
		tranData.add(tran);
	}

	public static void main(String[] args) 
	{
		ArrayList<Transaction> tranData = new ArrayList<Transaction> ();
		
		Transaction trans = new Transaction();
		Account acc = new Account();
		
		acc.setAccountInfo("234", "Zairul Mazwan", 10.00, 0.00, 0.00);
		trans.performDeposit("234", 10.0, tranData);
		
		acc.deposit(500.50);
		trans.performDeposit("234", 500.5, tranData);
		
		acc.deposit(200.00);
		trans.performDeposit("234", 200.00, tranData);
		
		acc.withdraw(100.00);
		trans.performWithdrawal("234", 100.00, tranData);
		
		System.out.println("Current bal : "+acc.getBal());
		
		System.out.println("Debit\t\tCredit");
		for (int i=0; i<tranData.size(); i++)
		{
			System.out.print(tranData.get(i).getWithdrawal());
			System.out.print("\t\t");
			System.out.print(tranData.get(i).getDeposit());
			System.out.println();
		}

	}

}
