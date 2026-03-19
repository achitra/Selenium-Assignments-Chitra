package week3.week3day1Assignments;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EditLead {
    
    public static void main(String args[])
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

        //Click on Create Lead link
        driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

        //Enter Company name
        driver.findElement(By.xpath("//input[@class='inputBox' and @name='companyName']")).sendKeys("XYZ");

        //Enter First Name
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName' and @name='firstName']")).sendKeys("Chitra");

        //Enter Last Name
        driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Vijayakumar");

        //Enter First Name(Local)
        driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("CV");

        //Enter Department Name
        driver.findElement(By.name("departmentName")).sendKeys("Software");

        //Enter Description
        driver.findElement(By.name("description")).sendKeys("Test Lead");

        //Enter Email ID
        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail' and @ name='primaryEmail']")).sendKeys("testabc@test.com");

        //Select State as 'New York'
        WebElement stateDD = driver.findElement(By.name("generalStateProvinceGeoId"));
        Select state = new Select(stateDD);
        state.selectByVisibleText("New York");

        //Click on Create Lead button
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();

        //Click on Edit Lead
        driver.findElement(By.linkText("Edit")).click();

        //Clear Description field
        driver.findElement(By.name("description")).clear();

        //Fill Important Note field
        driver.findElement(By.name("importantNote")).sendKeys("Test Priority - High");

        //Click on Update button
        driver.findElement(By.xpath("//input[@value='Update']")).click();

        //Print Title of landing page
        System.out.println("Page Title :"+driver.getTitle());

        driver.close();

    }

}
