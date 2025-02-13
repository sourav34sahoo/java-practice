public interface Banking
{
	public void openAccount(String accountNo,double balance);
	public void cashDeposite(String accountNo,double amount);
	public void cashWithdraw(String accountNo,double amount);
	public void checkBalance(String accountNo);
	public void closeAccount(String accountNo);
	public void allAcountRecords(String accountNo);
}