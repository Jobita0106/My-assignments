package week3.day2;

public class TestData {

	public void enterCredentials() {
        System.out.println("enterCredentials");
    }

    public void navigateToHomePage() {
        System.out.println("navigateToHomePage");
    }

    public static void main(String[] args) {
        TestData testdataOptions = new TestData();
        testdataOptions.enterCredentials();
        testdataOptions.navigateToHomePage();
    }
}
