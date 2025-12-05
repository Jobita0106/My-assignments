package week4.day1;

public class JavaConnection implements DatabaseConnection {
	
	public void connect() {
        System.out.println("Connecting");
    }

    public void disconnect() {
        System.out.println("Disconnecting");
    }

    public void executeUpdate() {
        System.out.println("Executing update");
    }
    
    public static void main(String[] args) {
		
    	JavaConnection javacon = new JavaConnection();
        javacon.connect();
        javacon.disconnect();
        javacon.executeUpdate();
        
    }

}
