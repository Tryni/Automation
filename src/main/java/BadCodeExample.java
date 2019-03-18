import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class BadCodeExample {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        //ве операции : 1- обявляем переменную WebDriver driver and 2- b присвоение значения переменнной chromeDriver
        WebDriver driver = new ChromeDriver();
        //посредник между кодом и браузером
        driver.get("https://www.google.com");
        //записываем текст ноды в переменную элемент
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Selenium");
        //submit by click on the enter
        element.submit();
    }
}
//alt enter - import of the web elementh
//driver-
/*public class BadCodeExample{
    public static void main(String[] args) {
        System.out.println("FirstLogIn");
        WebDriver driver=new ChromeDriver();
            driver.get("https://easyxpress.com.ua/log-in");
        WebElement usernameElement = driver.findElement(By.id("loginform-email"));
        WebElement passwordElement = driver.findElement(By.id("loginform-pass"));
        usernameElement.sendKeys("etrunova89@gmail.com");
        passwordElement.sendKeys("Sid0renk089");
        passwordElement.submit();


        // Conclude a test
        driver.quit();

*/




    }
}