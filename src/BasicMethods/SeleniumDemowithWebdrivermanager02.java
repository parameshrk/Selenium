package BasicMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemowithWebdrivermanager02 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        /*  WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver(); */

      /*  WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();*/

        /*WebDriverManager.operadriver().setup();
        WebDriver driver =new OperaDriver();*/

    }
}
