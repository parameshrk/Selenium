package TestNGDemos.sites;

import TestNGDemos.sites.util.InitDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites extends InitDriver {



    @Test
    public void naukri()
    {
        driver.get("https://www.naukri.com/");
    }

    @Test
    public void monster()
    {
        driver.get("https://monster.com/");
    }

    @Test
    public void shine()
    {
        driver.get("https://shine.com/");
    }

    @Test
    public void timesjob()
    {
        driver.get("https://timesjob.com/");
    }
}

