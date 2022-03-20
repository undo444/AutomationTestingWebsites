package BaseTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    public WebDriver Driver;

    @Before

    public void BaseTest(){

        System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\ChromeDriver\\chromedriver.exe");
        Driver = new ChromeDriver();
        Driver.get("http://demo.automationtesting.in/");
        Driver.manage().window().maximize();

        String actualResult = "Index";
        String expectedResult = Driver.getTitle();
        Assert.assertEquals(actualResult,expectedResult);
    }
}
