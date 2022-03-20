package Register;

import BaseTest.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegisterTest extends Base {


    @Test

    public void RegisterTest() {

        WebElement SkipButton = Driver.findElement(By.id("btn2"));
        SkipButton.click();

        String actualResult1 = "Register";
        String expectedResult1 = Driver.getTitle();
        Assert.assertEquals(actualResult1,expectedResult1);

        WebElement FirstNameField = Driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        FirstNameField.sendKeys("Manolache");

        WebElement SecondNameField = Driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        SecondNameField.sendKeys("Alexandru");

        WebElement AdressField = Driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']/textarea"));
        AdressField.sendKeys("Stefan cel Mare nr:95B");

        WebElement AdresaMail = Driver.findElement(By.xpath("//input[@type='email']"));
        AdresaMail.sendKeys("undo444@yahoo.com");

        WebElement NrTelefon = Driver.findElement(By.xpath("//input[@type='tel']"));
        NrTelefon.sendKeys("0754940939");

        WebElement MaleTest = Driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']//label//input"));
        MaleTest.click();

        WebElement CricketCheckbox = Driver.findElement(By.id("checkbox1"));
        CricketCheckbox.click();

        WebElement MoviesCheckbox = Driver.findElement(By.id("checkbox2"));
        MoviesCheckbox.click();

        WebElement HockeyCheckBox = Driver.findElement(By.id("checkbox3"));
        HockeyCheckBox.click();

        WebElement Skills = Driver.findElement(By.id("Skills"));
        Skills.click();

        Select Skils = new Select(Skills);
        Skils.selectByVisibleText("Design");

        WebElement SelectCountry = Driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
        SelectCountry.click();

        WebElement SearchCountryOptions = Driver.findElement(By.className("select2-search__field"));
        SearchCountryOptions.sendKeys("Hong Kong");
        SearchCountryOptions.sendKeys(Keys.ENTER);

        WebElement Parola = Driver.findElement(By.id("firstpassword"));
        Parola.sendKeys("1234");

        WebElement ConfirmareParola = Driver.findElement(By.id("secondpassword"));
        ConfirmareParola.sendKeys("1234");

        WebElement LanguageTest = Driver.findElement(By.id("msdd"));
        LanguageTest.click();

        WebElement Year = Driver.findElement(By.id("yearbox"));
        Select year = new Select(Year);
        year.selectByVisibleText("1945");

        WebElement Month = Driver.findElement(By.xpath("//select[@placeholder='Month']"));
        Select month = new Select(Month);
        month.selectByVisibleText("March");

        WebElement Day = Driver.findElement(By.id("daybox"));
        Select day = new Select(Day);
        day.selectByVisibleText("13");

        WebElement LanguageDropDown = Driver.findElement(By.id("msdd"));
        LanguageDropDown.click();

        List<WebElement> Lista = Driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li/a"));
        for (int i = 0; i < Lista.size(); i++) {

            String CurentElement = Lista.get(i).getText();
            if (CurentElement.equals("Czech") || CurentElement.equals("Romanian")) {
                Lista.get(i).click();
            }

        }

    }
}
