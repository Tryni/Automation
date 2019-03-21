import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.*;

public class BadCodeExample {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
        element.sendKeys("Selenium");
        element.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        List<WebElement> result = driver.findElements(By.xpath("//div[@class='g']"));
        for(int i=0;i<result.size();i++)
        {
            System.out.println(i+". "+result.get(i).getText());
        }
        driver.close();
        System.out.println("Quantity of links that have in a title word SELENIUM is  "+result.size());

    }
}



