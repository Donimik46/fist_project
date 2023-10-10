package text_box_tests;

import browses.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.base.BasePage;

import java.time.Duration;

import static constants.Constant.URLS.START_PAGE_URL;

public class Test1 {
    private WebDriver driver;
    private BasePage basePage;

    @BeforeClass
    public void beforeClass(){
        driver = Browser.createDriver();
        basePage = new BasePage((driver));
        basePage.openStartPage();
    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
    @Test
    public void step_01(){
        basePage.click("//div[@class='card mt-4 top-card']/div[div/h5[text()='Elements']]");
        String text = basePage.getText("//li[span[text()='Text Box']]");




        //WebElement blockElements = driver.findElement(By.xpath("//div[@class='card mt-4 top-card']/div[div/h5[text()='Elements']]"));
        //WebElement textBoxElements = driver.findElement(By.xpath("//li[span[text()='Text Box']]"));
       // JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("arguments[0].scrollIntoView();",blockElements);
      //  blockElements.click();
       // WebElement textResultElement = driver.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']"));
       // js.executeScript("arguments[0].scrollIntoView();",textResultElement);
      //  String text = textResultElement.getText();
       String textResult = "Please select an item from left to start practice.";
       Assert.assertTrue(text.equals(textResult));
       Assert.assertEquals(text,textResult);


    }
}