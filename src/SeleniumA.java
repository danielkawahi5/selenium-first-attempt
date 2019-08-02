import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumA {

    //private static WebDriver driver;
    private static WebDriver driver;

    public static void main(String args[]){

        //System.setProperty("webdriver.firefox.marionette", "C:\\Users\\danie\\drivers\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\danie\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        driver.get(baseUrl);


        actualTitle = driver.getTitle();

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test passed!!");
        } else {
            System.out.println("Test Failed!!");
        }

        driver.close();
    }
}
