interface A
{
	public int depositeAmount();
	public void withdrawalAmount();
	public void balanceInquiry();
}
public class Practice implements A
{
	public int depositeAmount(){
		return 100;
	}
	public void withdrawalAmount(){
		System.out.println(200);
	}
	public void balanceInquiry(){
		System.out.println(300);
	}
	public static void main(String...args){
		Practice p = new Practice();
		System.out.println(p.depositeAmount());
		p.withdrawalAmount();
		p.balanceInquiry();
	}
}