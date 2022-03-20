package Register;

import BaseTest.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.NoSuchElementException;
import java.util.Set;

public class FrameTest   {
public WebDriver Driver;
    @Test

    public void FrameTest() {

        System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\ChromeDriver\\chromedriver.exe");
        Driver = new ChromeDriver();
        Driver.get("http://demo.automationtesting.in/Frames.html");
        Driver.manage().window().maximize();

        String actualResult = "Frames";
        String expectedResult = Driver.getTitle();
        Assert.assertEquals(actualResult,expectedResult);

        WebElement Iframe = Driver.findElement(By.xpath("//ul[@class='nav nav-tabs ']//li[2]//a"));
        Iframe.click();
        WebElement FirstFrame = Driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
        Driver.switchTo().frame(FirstFrame);

        WebElement SecondFrame = Driver.findElement(By.xpath("//div[@class='container']//iframe"));
        Driver.switchTo().frame(SecondFrame);

        WebElement TextIframe = Driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']/input"));
        TextIframe.sendKeys("Hello");
        Driver.switchTo().defaultContent();

    }
}
