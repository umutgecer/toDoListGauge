package com.todomvc;


import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeScenario
    public void runDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20, 2000);
        driver.get("https://todomvc.com/examples/vue/");
        driver.manage().window().maximize();
    }

    @AfterScenario
    public void stopDriver() {
        driver.quit();
    }
}