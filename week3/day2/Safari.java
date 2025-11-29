package week3.day2;

public class Safari extends Browser{
	public void readerMode() {
		System.out.println(browserName + ":Turning on reader mode");
    }

    public void fullScreenMode() {
        System.out.println(browserName + ":Opening fullscreen mode");
    }

    public static void main(String[] args) {

        Safari safari = new Safari();
        safari.browserName = "Safari";
        safari.browserVersion = "16";

        safari.openURL();
        safari.navigateBack();
        safari.readerMode();
        safari.fullScreenMode();
        safari.closeBrowser();
    }

}
