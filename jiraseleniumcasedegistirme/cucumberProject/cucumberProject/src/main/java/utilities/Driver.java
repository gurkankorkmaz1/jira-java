package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver driver;


    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("http://www.automationpractice.pl/index.php");
            driver.manage().window().maximize();

        }
        return driver;

    }
public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
}


}