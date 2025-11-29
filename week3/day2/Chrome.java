package week3.day2;

public class Chrome extends Browser{
	 public void openIncognito() {
	        System.out.println(browserName + ":Opening incognito mode");
	    }

	    public void clearCache() {
	        System.out.println(browserName + ":Clearing cache");
	    }

	    public static void main(String[] args) {

	        Chrome chrome = new Chrome();
	        chrome.browserName = "Chrome";
	        chrome.browserVersion = "119";

	        chrome.openURL();
	        chrome.navigateBack();
	        chrome.openIncognito();
	        chrome.clearCache();
	        chrome.closeBrowser();
	    }

}
