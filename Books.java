package tamilnadu.chennai;

public class Books implements Kp {
	
	private int Price ;
	private String aurthor ;
	
	public String getAurthor() {
		return aurthor;
	}

	public void setAurthor(String aurthor) {
		this.aurthor = aurthor;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public int getPrice()
	{
		return Price ;
		
	}
	
	public static void main(String [] args)
	{
		Books b = new Books();
		Books c = new Books(12,"AAD");
		b.DisplayInfo(156,"JAVA ");
		
		
		System.out.println("Welcome To eclipse ");
	}

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Books(int price, String aurthor) {
		super();
		Price = price;
		this.aurthor = aurthor;
	}

	private void DisplayInfo(int page,String name) {
		// TODO Auto-generated method stub
		System.out.println("Pages " +page);
		System.out.println("BOOK NAME "+name);
	}

	@Override 
	public void test() {
		// TODO Auto-generated method stub
	 
	}
	
	

}
