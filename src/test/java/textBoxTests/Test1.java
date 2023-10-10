package text_box_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test1 {
    private WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
    @Test
    public void step_01(){
        WebElement blockElements = driver.findElement(By.xpath("//div[@class='card mt-4 top-card']/div[div/h5[text()='Elements']]"));
        //WebElement textBoxElements = driver.findElement(By.xpath("//li[span[text()='Text Box']]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",blockElements);
        blockElements.click();
        WebElement textResultElement = driver.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']"));
        js.executeScript("arguments[0].scrollIntoView();",textResultElement);
        String text = textResultElement.getText();
        String textResult = "Please select an item from left to start practice.";
        Assert.assertTrue(text.equals(textResult));
        Assert.assertEquals(text,textResult);


    }
}