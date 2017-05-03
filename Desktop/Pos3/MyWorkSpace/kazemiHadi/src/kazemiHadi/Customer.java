package kazemiHadi;

public class Customer {
	
	private int[][] wert;
	
	public Customer()
	{
		wert = new int[2][3];
		
		wert[0][0] = 9;
		wert[0][1] = 10;
		wert[0][2] = 19;
		
		print();
	}
	
	public void print()
	{
		System.out.println(wert[0][0]);
	}
	
	
	
	
	public static void main(String[] args) 
	{
		new Customer();
	}
	
	

}
