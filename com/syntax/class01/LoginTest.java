package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
     public void openAndNavigate(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Test
    public void validAdminLogin(){
       driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
       driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
       driver.findElement(By.id("btnLogin")).click();
       WebElement welcome= driver.findElement(By.cssSelector("a#welcome"));
       if(welcome.isDisplayed()){
           System.out.println("Test works");
       }else{
           System.out.println("Test does not work!!!");
       }

    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
