package BroswerTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirFox {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);// Maximise Window
        driver.manage().window().maximize();
        // We give implecit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Get the tille of the page//
        String title =  driver.getTitle();
        System.out.println("page title is :" + title );
        System.out.println("Current URL : " + driver.getCurrentUrl());
        System.out.println("Page source  :"+ driver.getPageSource());


        // find the email field element
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("test123@gmail.com");
        WebElement passwordFiled = driver.findElement(By.name("user[password]"));
        passwordFiled.sendKeys("test123");

        //close the browser
        //driver.quit();

    }}

