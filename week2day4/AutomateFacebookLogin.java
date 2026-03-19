package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebookLogin {

    public static void main(String[] args) {
        
        ChromeDriver driver = new ChromeDriver();

        //Open Facebook page
        driver.get("https://www.facebook.com/");

        //Enter username and password
        driver.findElement(By.name("email")).sendKeys("testleaf.2023@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Tuna@321");
        driver.findElement(By.xpath("//span[text()='Log in']")).click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        //Click on Findyour account link
        driver.findElement(By.linkText("Find your account and log in.")).click();

        //Display title of landing page
        String title = driver.getTitle();
        System.out.println(title);


    }
    
}
