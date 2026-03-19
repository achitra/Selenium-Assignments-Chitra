package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

    public static void main(String[] args) {

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

        //Click on Accounts tab
        driver.findElement(By.linkText("Accounts")).click();

        //Click on Create Account
        driver.findElement(By.linkText("Create Account")).click();

        //Enter account name
        String accountName = "Chitra";

        driver.findElement(By.id("accountName")).sendKeys(accountName);

        //Enter Account Description
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

        //Select Computer Science from the Industry Dropdown
        WebElement industryDD = driver.findElement(By.name("industryEnumId"));
        Select industry = new Select(industryDD);
        industry.selectByValue("IND_SOFTWARE");

        //Select Ownership as s-Corporation
        WebElement OwnershipDD = driver.findElement(By.name("ownershipEnumId"));
        Select ownership = new Select(OwnershipDD);
        ownership.selectByVisibleText("S-Corporation");

        //Select Employee as the source
       WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
       Select source = new Select(sourceDD);
       source.selectByValue("LEAD_EMPLOYEE");

       //Select Marketing Campaign
       WebElement marketingDD = driver.findElement(By.id("marketingCampaignId"));
       Select marketing = new Select(marketingDD);
       marketing.selectByIndex(6);

       //Select State as Texas
       WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
       Select state = new Select(stateDD);
       state.selectByValue("TX");

       //Click on Create Account button
        driver.findElement(By.className("smallSubmit")).click();

        //Verify account name
        String accName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
        System.out.println(accName);
        if(accName.contains(accountName))
            System.out.println("Account Name Verification : Success");
        else
            System.out.println("Account Name Verification : Fail");

        driver.close();

    }
    
}
