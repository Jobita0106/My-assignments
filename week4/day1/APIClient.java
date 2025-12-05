package week4.day1;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("Sending request to endpoint:" + endpoint);
		
	}
public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		
		System.out.println("Sending the Request:"+endpoint);
		System.out.println("Request the Body:"+requestBody);
		System.out.println("The Request status Done successfully:"+requestStatus);
		
	}
    public static void main(String[] args) {
    	
    	APIClient client = new APIClient();
    	
    	client.sendRequest("login");
    	client.sendRequest("HomePage","SubmitForm",true);
    	
    }


}
