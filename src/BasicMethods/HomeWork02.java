package BasicMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork02 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://stock.amolujagare.com/");

        /*WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
        username.sendKeys("admin");*/

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");

        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin");

        driver.findElement(By.xpath("//input[@name='submit']")).click();

    }
}
