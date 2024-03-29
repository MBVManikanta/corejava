package j3;
class Customer{
	private String cuctomerName;
	private int creditpoints;
	public Customer(String cuctomerName, int creditpoints) {
		super();
		this.cuctomerName = cuctomerName;
		this.creditpoints = creditpoints;
	}
	@Override
	public String toString() {
		return "Customer [cuctomerName=" + cuctomerName + "]";
	}
	public int getCreditPoints() {
		return creditpoints;
	}
	
	
}
class CardType{
	private Customer customer;
	private String cardType;
	public CardType(Customer customer, String cardType) {
		super();
		this.customer = customer;
		this.cardType = cardType;
	}
//	@Override
//	public String toString() {
//		return "the customer"+customer.toString()+"is Eligible For"+cardType+"card";
//	}
	@Override
	public String toString() {
		return "CardType [customer=" + customer + ", cardType=" + cardType + "]";
	}
	
	
}
class CardOnOffer{
	public static CardType getOfferCard(Customer customer) {
		String Type="";
		if(customer.getCreditPoints()>=100&&customer.getCreditPoints()<=500)
			Type="Sliver";
		else if(customer.getCreditPoints()>500&&customer.getCreditPoints()<=1000)
			Type="Gold";
		else if(customer.getCreditPoints()>1000)
				Type="platinum";
		else
			Type="EMI";
		CardType result=new CardType(customer,Type);
		return result;
		
	}
	
	 
}

public class CardTypeTest {

	public static void main(String[] args) {
		Customer customer=new Customer("Rajav",800);
		CardType cardtype= CardOnOffer.getOfferCard(customer);
		System.out.println(cardtype);
		
		

	}

}



