package week4.day1;

public class Amazon extends CanaraBank{

	public void cashOnDelivery() {
        System.out.println("Cash on Delivery accepted.");
    }

    public void upiPayments() {
        System.out.println("UPI payment is processed.");
    }
    
    public void cardPayments() {
        System.out.println("Card payment is used.");
    }

    public void internetBanking() {
        System.out.println("Payment through the Internet banking.");
    }
   
    public void recordPaymentDetails() {
        System.out.println("Record the Payment details.");
    }
    public static void main(String[] args) {
    	Amazon products = new Amazon();
    	products.cashOnDelivery();
    	products.upiPayments();
    	products.cardPayments();
    	products.internetBanking();
    	products.recordPaymentDetails();
	}
}
