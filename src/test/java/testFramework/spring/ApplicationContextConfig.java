package testFramework.spring;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import testFramework.baseTest.BaseTest;
import testFramework.baseTest.TestFrameworkDriver;

@Configuration
@ComponentScan(basePackages = {"baseTest"})
public class ApplicationContextConfig {


    @Bean("testFrameworkDriver")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public TestFrameworkDriver testFrameworkDriver() {
        return new TestFrameworkDriver();
    }

    @Bean("testBase")
    public BaseTest testBase() {
        return new BaseTest();
    }
}
