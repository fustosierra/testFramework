package testFramework.baseTest;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Component;
import testFramework.spring.ApplicationContextConfig;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;

@Component
public class TestFrameworkDriver extends ApplicationContextConfig {

    public WebDriver driver;

    public TestFrameworkDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
//                chromeOptions.addArguments("--incognito");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
    }


    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void get(String url) {
        driver.get(url);
    }

    public String getBaseUrl() {
        return new String("https://www.google.com/");
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
