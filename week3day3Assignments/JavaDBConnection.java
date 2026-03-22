package week3.week3day3Assignments;

public class JavaDBConnection extends MySqlConnection {

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

        JavaDBConnection jcon = new JavaDBConnection();
        jcon.connect();
        jcon.executeUpdate();
        jcon.executeQuery();
        jcon.disconnect();
        
    }
    
}
