package TestNGDemos.sites;

import TestNGDemos.sites.util.InitDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialSites extends InitDriver {


    @AfterClass  // method written below this annotation will run after last test method of the class
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }

    @Test (priority = 3)
    public void tutorialsPoint()
    {
        driver.get("https://www.tutorialspoint.com/");
    }

    @Test (priority = 4)
    public void javatpoint()
    {
        driver.get("https://javatpoint.com/");
    }

    @Test (priority = 1)
    public void w3schools()
    {
        driver.get("https://w3schools.com/");
    }

    @Test (priority = 2)
    public void scriptinglogic()
    {
        driver.get("https://scriptinglogic.com/");
    }
}
