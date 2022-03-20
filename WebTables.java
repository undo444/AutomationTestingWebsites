package Register;

import BaseTest.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables  {

    public WebDriver Driver;
    @Test

    public void WebTables(){

        System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\ChromeDriver\\chromedriver.exe");
        Driver = new ChromeDriver();
        Driver.get("https://demoqa.com/text-box");
        Driver.manage().window().maximize();

        String actualResult = "ToolsQA";
        String expectedResult = Driver.getTitle();
        Assert.assertEquals(actualResult,expectedResult);

        WebElement TableBox = Driver.findElement(By.id("item-3"));
        TableBox.click();

        WebElement AddClick = Driver.findElement(By.id("addNewRecordButton"));
        AddClick.click();

        WebElement FirstName = Driver.findElement(By.id("firstName"));
        FirstName.sendKeys("Alex");

        WebElement SecondName = Driver.findElement(By.id("lastName"));
        SecondName.sendKeys("Mano");

        WebElement EmailClick = Driver.findElement(By.id("userEmail"));
        EmailClick.sendKeys("undo444@yahoo.com");

        WebElement Age = Driver.findElement(By.id("age"));
        Age.sendKeys("27");

        WebElement Salary = Driver.findElement(By.id("salary"));
        Salary.sendKeys("5000");

        WebElement Department = Driver.findElement(By.id("department"));
        Department.sendKeys("HR");

        WebElement Submit = Driver.findElement(By.id("submit"));
        Submit.click();

        WebElement Delete = Driver.findElement(By.id("delete-record-2"));
        Delete.click();

        WebElement Edit = Driver.findElement(By.id("edit-record-1"));
        Edit.click();

        WebElement EditName = Driver.findElement(By.xpath("//input[@value='Cierra']"));
        EditName.clear();
        EditName.sendKeys("Ana");

        WebElement EditSecondName = Driver.findElement(By.xpath("//input[@value='Vega']"));
        EditSecondName.clear();
        EditSecondName.sendKeys("Popescu");

        WebElement EditEmail = Driver.findElement(By.xpath("//input[@value='cierra@example.com']"));
        EditEmail.clear();
        EditEmail.sendKeys("ana@yahoo.com");

        WebElement AgeEdit = Driver.findElement(By.xpath("//input[@value='39']"));
        AgeEdit.clear();
        AgeEdit.sendKeys("27");

        WebElement SalaryEdit = Driver.findElement(By.xpath("//input[@value='10000']"));
        SalaryEdit.clear();
        SalaryEdit.sendKeys("5000");

        WebElement DepartmentEdit = Driver.findElement(By.xpath("//input[@value='Insurance']"));
        DepartmentEdit.clear();
        DepartmentEdit.sendKeys("HR");

        WebElement Submitt = Driver.findElement(By.id("submit"));
        Submitt.click();
    }
}
