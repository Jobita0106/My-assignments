package week3.day2;

public class LoginTestData extends TestData {
	
	 public void enterUsername() {
	        System.out.println("enterUsername");
	    }

	    public void enterPassword() {
	        System.out.println("enterPassword");
	    }

	    public static void main(String[] args) {
	        LoginTestData loginOptions = new LoginTestData();
	        loginOptions.enterUsername();
	        loginOptions.enterPassword();
	        loginOptions.enterCredentials();   
	        loginOptions.navigateToHomePage();
	    }

}
