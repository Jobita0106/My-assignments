package week3.day2;

public class Browser {

	String browserName;
    String browserVersion;

    public void openURL() {
        System.out.println(browserName + ":Opening URL");
    }

    public void closeBrowser() {
        System.out.println(browserName + ":Closing browser");
    }

    public void navigateBack() {
        System.out.println(browserName + ":Navigating back");
    }
   
}


