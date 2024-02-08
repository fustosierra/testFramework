package testFramework.tests;


import org.testng.annotations.Test;
import testFramework.baseTest.BaseTest;
import org.testng.annotations.Listeners;
import testFramework.utils.TestListener;

import static org.testng.Assert.assertTrue;

@Listeners(TestListener.class)
public class LoginTests extends BaseTest {

    @Test
    public void checkUrl() {
        String currentUrl = driver.getCurrentUrl();
        String baseUrl = driver.getBaseUrl();
        assertTrue(currentUrl.equalsIgnoreCase(baseUrl));
    }

}