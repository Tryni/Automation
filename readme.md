# Automation
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class BadCodeExample {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String searchTerm="Selenium";
        WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
        element.sendKeys(searchTerm);
        element.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        ////div[@class='srg']/divх[@class='g']

        List<WebElement> result = driver.findElements(By.xpath("//div[@class='g']"));

       /* for (WebElement result: result) {
            System.out.println(result.getText());
        }
        */
        //for (int i = 0; i < result.size(); i++) System.out.println(i + ". " + result.get(i).getText());

        System.out.println("Quantity of links that have in a title word SELENIUM is  " + result.size());

        for (int i = 0; i < result.size(); i++) {
            String resultString = result.get(i).getText();
            System.out.println(i + ". " + result.get(i).getText());
            if (resultString.contains(searchTerm.toLowerCase())) {
                System.out.println("Serch Term found");
            } else {
                System.out.println("Search term not found");
            }
            driver.close();
        }
    }
}

        /*System.out.println("Quantity of links that have in a title word SELENIUM is  " + result.size());
        for (int i = 0; i < result.size(); i++) {
            if (driver.findElement(By.linkText("Selenium")).isDisplayed()) {
                System.out.println("The Selenium is here");
            } else {
                System.out.println("The word is not here");
            }

        }
        */


import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.WebElement;

        import java.util.List;
        import java.util.Set;
        import java.util.concurrent.TimeUnit;


public class BadCodeExample {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String searchTerm="Selenium";
        WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
        element.sendKeys(searchTerm);
        element.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        ////div[@class='srg']/divх[@class='g']

        List<WebElement> result = driver.findElements(By.xpath("//div[@class='g']"));

       /* for (WebElement result: result) {
            System.out.println(result.getText());
        }
        */
        //for (int i = 0; i < result.size(); i++) System.out.println(i + ". " + result.get(i).getText());

        System.out.println("Quantity of links that have in a title word SELENIUM is  " + result.size());

        for (int i = 0; i < result.size(); i++) {
            String resultString = result.get(i).getText();
            System.out.println(i + ". " + result.get(i).getText());
            if (resultString.contains(searchTerm.toLowerCase())) {
                System.out.println("Serch Term found");
            } else {
                System.out.println("Search term not found");
            }
            driver.close();
        }
    }
}

        /*System.out.println("Quantity of links that have in a title word SELENIUM is  " + result.size());
        for (int i = 0; i < result.size(); i++) {
            if (driver.findElement(By.linkText("Selenium")).isDisplayed()) {
                System.out.println("The Selenium is here");
            } else {
                System.out.println("The word is not here");
            }

        }
        */




