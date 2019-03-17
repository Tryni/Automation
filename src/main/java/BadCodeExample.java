import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class BadCodeExample {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Selenium");
        element.submit();


 
    }

}
