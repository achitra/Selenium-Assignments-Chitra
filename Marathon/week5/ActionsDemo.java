package Marathon.week5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class ActionsDemo {

    public static void main(String[] args) throws InterruptedException
    {

        ChromeDriver driver = new ChromeDriver();

        //Load URL
        driver.get("https://www.tatacliq.com/");


        //Maximise Window
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.id("moe-dontallow_button")).click();

        Actions action = new Actions(driver);

        //MouseHover on 'Brands'
        action.moveToElement(driver.findElement(By.xpath("//div[text()='Brands']"))).perform();

        //MouseHover on 'Watches & Accessories'
        action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Watches')]"))).perform();

        //Choose the first option from the'Featured brands'
        driver.findElement(By.xpath("//div[@class='DesktopHeader__featureBrands']/div[2]")).click();

        //Select sortby: New Arrivals 
        Select sortDD = new Select(driver.findElement(By.className("SelectBoxDesktop__hideSelect")));
        sortDD.selectByVisibleText("New Arrivals");

        //Choose men from catagories filter
        driver.findElement(By.xpath("//div[text()='Men']/preceding-sibling::div")).click();
        Thread.sleep(5000);

        //Print all price of watches 
        List<WebElement> priceList= driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));

        System.out.println("Prices of Watches :");
        for(WebElement price:priceList)
        {
            System.err.println(price.getText().replaceAll("[^0-9]", ""));
        }

        //Click on the first resulting watch
        driver.findElement(By.xpath("(//div[@class=\"ProductModule__dummyDiv\"])[1]")).click();

        //Compare two price are similar
        String priceOnSortedPage = priceList.get(0).getText().replaceAll("[^0-9]", "");

        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowHandlesList = new ArrayList<>(windowHandles);

        driver.switchTo().window(windowHandlesList.get(1));
        String priceOnProductPage = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText().replaceAll("[^0-9]", "");
        priceOnProductPage.replaceAll("^[0-9]", "");

        if(priceOnSortedPage.equals(priceOnProductPage))
        {
            System.out.println("Price Matches!");
        }
        else
        {
            System.out.println("Price Mismatch!");
        }

        //Click Add to cart and get count from the cart icon
        driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();

        String cartCount = driver.findElement(By.className("DesktopHeader__cartCount")).getText();
        System.out.println("Cart Count is : "+cartCount);

        //Click on the cart 
        driver.findElement(By.xpath("//div[@class='DesktopHeader__rightTabHolder']/div[3]")).click();

        driver.close();

        driver.switchTo().window(windowHandlesList.get(0));

        driver.close();

    }   

}
