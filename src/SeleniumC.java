import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumC {

    public static void main(String args[]) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\danie\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.popuptest.com/popuptest2.html");
        driver.quit();
    }
}
