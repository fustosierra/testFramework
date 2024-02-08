package testFramework.baseTest;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import testFramework.spring.ApplicationContextConfig;

@ContextConfiguration(classes = ApplicationContextConfig.class)
public class BaseTest extends AbstractTestNGSpringContextTests {

    @Autowired
    public TestFrameworkDriver driver;

    public WebDriver webDriver;

    @BeforeMethod(alwaysRun = true)
    public void createTestContext(ITestContext context) {
        context.setAttribute("driver", driver.getDriver());
    }

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        String url = driver.getBaseUrl();
        driver.get(url);
    }
}
