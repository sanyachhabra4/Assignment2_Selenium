
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class session_storage{
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.voot.com/");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String AF_BANNERS_SESSION_ID = (String) js.executeScript(String.format("return window.sessionStorage.getItem('%s');", "AF_BANNERS_SESSION_ID"));

        System.out.println("Retrieving Data of Session Storage of BookMyShow");
        System.out.println("AF_BANNERS_SESSION_ID :" + AF_BANNERS_SESSION_ID);

        driver.quit();
    }
}
