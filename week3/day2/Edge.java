package week3.day2;

public class Edge extends Browser {

	public void takeSnap() {
        System.out.println("Take Snapshot");
    }

    public void clearCookies() {
        System.out.println("Clear Cookies");
    }

    public static void main(String[] args) {
        Edge ed = new Edge();
        ed.browserName = "Edge";
        ed.browserVersion = "118";
        ed.openURL();
        ed.navigateBack();
        ed.takeSnap();
        ed.clearCookies();
        ed.closeBrowser();
    }
}
