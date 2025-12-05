package week4.day1;

public class JavaConnections extends MySqlConnection{
    public void connect() {
        System.out.println("Connecting");
    }
    public void disconnect() {
        System.out.println("Disconnecting");
    }
    public void executeUpdate() {
        System.out.println("Executing update");
    }
    public void executeQuery() {
        System.out.println("Executing query");
    }
    public static void main(String[] args) {
    	JavaConnections javacon = new JavaConnections();
    	javacon.connect();
    	javacon.disconnect();
    	javacon.executeUpdate();
    	javacon.executeQuery();
	}
	
}
