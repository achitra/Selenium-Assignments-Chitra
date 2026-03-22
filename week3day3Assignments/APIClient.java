package week3.week3day3Assignments;

public class APIClient {

    public void sendRequest(String endpoint)
    {
        System.out.println("Request Endpoint : "+endpoint);
    }

    //Overloaded Method
    public void sendRequest(String endpoint,String requestBody,boolean requestStatus)
    {
        System.out.println("Request Endpoint : "+endpoint);
        System.out.println("Request Body : "+requestBody);

        if(requestStatus)
            System.out.println("Request Status : Success");
        else
            System.out.println("Request Status : Fail");
    }

    public static void main(String[] args) {

        APIClient client = new APIClient();
        client.sendRequest("testleaf.com");
        client.sendRequest("testleaf.com", "{course : Selenium,batch: March}", true);
        
    }
    
}
