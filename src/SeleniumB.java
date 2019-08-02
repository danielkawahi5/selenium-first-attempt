import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumB {

    private static WebDriver driver;

    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\danie\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        String baseUrl = "http://www.facebook.com";

        String tagName = "";

        driver.get(baseUrl);

        tagName = driver.findElement(By.id("email")).getTagName();

        System.out.println(tagName);

        driver.close();

        System.exit(0);

    }
}
