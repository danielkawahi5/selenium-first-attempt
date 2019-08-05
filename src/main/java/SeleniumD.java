import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumD {


    /*public static void main(String[] args) {
        System.setProperty("webdriver.firefox.marionette","C:\\Users\\danie\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.guru99.com/selenium/deprecated.html");
        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Deprecated")).click();
        driver.close();
    }*/


    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\danie\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/selenium/deprecated.html");
        //driver.switchTo().parentFrame();
        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("AbstractWebDriverEventListener")).click();
        driver.close();
    }
}
