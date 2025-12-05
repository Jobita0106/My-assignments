package week4.day1;

public class LoginPage extends BasePage{
	
	public void performCommonTasks() {
        super.performCommonTasks();
        System.out.println("Performing the tasks");
    }

	public static void main(String[] args) {
        LoginPage login = new LoginPage();
        login.findElement();
        login.clickElement();
        login.enterText();
        login.performCommonTasks();   
    }

}
