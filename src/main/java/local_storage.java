import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class local_storage {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.voot.com/");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String WZRK_ARP = (String) js.executeScript(String.format("return window.localStorage.getItem('%s');", "WZRK_ARP"));
        String WZRK_G = (String) js.executeScript(String.format("return window.localStorage.getItem('%s');", "WZRK_G"));
        String WZRK_META = (String) js.executeScript(String.format("return window.localStorage.getItem('%s');", "WZRK_META"));

        System.out.println("Retrieving Data of Local Storage of VOOT");
        System.out.println("WZRK_ARP :" + WZRK_ARP);
        System.out.println("WZRK_G :" + WZRK_G);
        System.out.println("WZRK_META :" + WZRK_META);
        driver.quit();
    }
}

