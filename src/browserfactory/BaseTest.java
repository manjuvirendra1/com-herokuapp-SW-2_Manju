package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;
    //Creating self method
    public void openBrowser(String baseUrl){
        driver = new ChromeDriver();
        //Launch the URL
        driver.get(baseUrl);
        //Maximise window
        driver.manage().window().maximize();
        //Implicit Timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public void tearDown(){
        driver.close();//closing the browser
    }
}
