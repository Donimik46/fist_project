/*
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        WebElement userNameInput = driver.findElement(By.xpath("//input[@id='userName']"));
        WebElement userEmailInput = driver.findElement(By.xpath("//input[@id='userEmail']"));
        WebElement userCurrentAddressInput = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        WebElement userPermanentAddressInput = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        WebElement userConfirmButton = driver.findElement(By.xpath("//button[@id='submit']"));
        userNameInput.sendKeys("Игорь");
        userEmailInput.sendKeys("igor@mail.com");
        userCurrentAddressInput.sendKeys("Курск");
        userPermanentAddressInput.sendKeys("Kursk");
        userConfirmButton.click();
        String name;
        WebElement userNameOutput = driver.findElement(By.xpath("//p[@id='name']"));
        name = userNameOutput.getText();
        String email;
        WebElement userEmailOutput = driver.findElement(By.xpath("//p[@id='email']"));
        email = userEmailOutput.getText();
        String currentAddress;
        WebElement userCurrentAddressOutput = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        currentAddress = userCurrentAddressOutput.getText();
        String permanentAddress;
        WebElement userPermanentAddressOutput = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        permanentAddress = userPermanentAddressOutput.getText();
        System.out.println(name + " " + email + " " + currentAddress + " " + permanentAddress + " ");

    }
}*/
