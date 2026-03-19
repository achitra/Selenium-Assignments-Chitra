package week3.week3day1Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DeleteLead {

    public static void main(String args[]) throws InterruptedException
    {
    
        FirefoxDriver driver = new FirefoxDriver();

        //Load URL
        driver.get("http://leaftaps.com/opentaps/");

        //Maximise Window
        driver.manage().window().maximize();

        //Enter Login Credentials
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

         //Click on CRM/SFA link
        driver.findElement(By.partialLinkText("CRM/SFA")).click();

        //Click on Leads tab
        driver.findElement(By.linkText("Leads")).click();

        //Click on Find Leads 
        driver.findElement(By.linkText("Find Leads")).click();
        
        //Click on the "Phone" tab.
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        
        //Enter the phone number.
        driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
        driver.findElement(By.name("phoneAreaCode")).sendKeys("123");
        driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
        
        //Click the "Find leads" button.
        driver.findElement(By.linkText("Find Leads")).click();

        //Capture the lead ID of the first resulting lead.
        String leadID = driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-partyId')]/a)[1]")).getText();
        System.out.println("Lead Id : "+leadID);
        
        //Click the first resulting lead.
        driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-partyId')]/a)[1]")).click();
        
        //Click the "Delete" button.
        driver.findElement(By.linkText("Delete")).click();

        //Click "Find leads" again.
        driver.findElement(By.linkText("Find Leads")).click();

        //Enter the captured lead ID.
        driver.findElement(By.name("id")).sendKeys(leadID);

        //Click the "Find leads" button.
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

        Thread.sleep(5000);
        
        //Verify the presence of the message "No records to display" in the Lead List
        String actualMessage = driver.findElement(By.className("x-paging-info")).getText();
        String expectedMessage = "No records to display";

        System.out.println(actualMessage);

        if(actualMessage.equals(expectedMessage))
            System.out.println("Lead Deletion Successful!");

        else
            System.out.println("Lead Deletion Failed!");

        //driver.close();

    }
    
}
