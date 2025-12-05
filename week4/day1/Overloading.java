package week4.day1;

public class Overloading {

	public void reportStep(String msg, String status) {
        System.out.println("MessageSMS: " + msg);
        System.out.println("Whatsupstatus: " + status);
    }

    public void reportStep(String msg, String status, boolean snap) {
        System.out.println("MessageSMS: " + msg);
        System.out.println("Whatsupstatus: " + status);
        System.out.println("SnapChat: " + snap);
    }

    public static void main(String[] args) {
    	Overloading report = new Overloading();
        report.reportStep("Register button","PASS");
        report.reportStep("Invalid email","FAIL", true);
    }
}
