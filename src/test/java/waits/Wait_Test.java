package waits;

import browser.Browser;
import main_pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.base.BasePage;
import pages.elements.ElementsPage;

import java.time.Duration;

public class Wait_Test {
    private WebDriver driver;
   // private BasePage basePage;
    private MainPage mainPage;
    private ElementsPage elementsPage;

    @BeforeClass
    public void beforeClass(){
        driver = Browser.createDriver();
       // basePage = new BasePage(driver);
        mainPage = new MainPage(driver);
        mainPage.openStartPage();
        //elementsPage = new ElementsPage();
        //basePage.openStartPage();

    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
    @Test
    public void step_01(){
        String xpath = "//button[@id='visibleAfter']";
        //basePage.click("//div[@class='card mt-4 top-card']/div[div/h5[text()='Elements']]");
        elementsPage=mainPage.openCategoryElements();
        elementsPage.click("//span[text()='Dynamic Properties']");
        elementsPage.waitElementDisplayed(xpath, 5);
        elementsPage.click(xpath);
        Assert.assertTrue(elementsPage.findElement(xpath).isEnabled());



    }
    @Test
    public void step_02(){
        String xpath = "//button[@id='enableAfter']";
        elementsPage.openStartPage();
        mainPage.openCategoryElements();
        elementsPage.click("//span[text()='Dynamic Properties']");
        new WebDriverWait(driver,Duration.ofSeconds(10))
                .until(d -> elementsPage.findElement(xpath).isEnabled());
        Assert.assertTrue(elementsPage.findElement(xpath).isEnabled());

    }
}