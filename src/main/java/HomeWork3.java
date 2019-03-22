import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        WebDriver driverLinkedin = new ChromeDriver();
        driverLinkedin.get("https://www.linkedin.com/");
        driverLinkedin.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
       driverLinkedin.findElement(By.xpath("//*[contains(@class,'login-email reg-field__input')]")).sendKeys("otru@ciklum.com");
       driverLinkedin.findElement(By.xpath("//*[contains(@class,'login-password reg-field__input')]")).sendKeys("qwer1234!");
       driverLinkedin.findElement(By.xpath("//*[contains(@class,'login submit-button')]")).submit();
       driverLinkedin.close();
    }


    }

