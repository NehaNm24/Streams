
public class BankAccount {
	private int accNo;
	private String accname;
	private double accBalance;
	public BankAccount(int accNo, String accname, double accBalance) {
		super();
		this.accNo = accNo;
		this.accname = accname;
		this.accBalance = accBalance;
	}
	public int getAccNo() {
		return accNo;
	}
	public String getAccname() {
		return accname;
	}
	public double getAccBalance() {
		return accBalance;
	}
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", accname=" + accname + ", accBalance=" + accBalance + "]";
	}
	
	
}
