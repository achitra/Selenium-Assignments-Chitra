package week3.week3day3Assignments;

public class JavaConnection implements DatabaseConnection{

    public void connect()
    {
        System.out.println("Database connected successfully.");
    }

    public void disconnect()
    {
        System.out.println("Database disconnected successfully.");
    }

    public void executeUpdate()
    {
        System.out.println("Update Query executed successfully.");
    }

    public static void main(String[] args) {

        JavaConnection jcon = new JavaConnection();
        jcon.connect();
        jcon.executeUpdate();
        jcon.disconnect();
        
    }
}
