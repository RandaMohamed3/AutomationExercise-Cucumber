package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/main/resources/features/01_register.feature",
                "src/main/resources/features/02_login.feature",
                "src/main/resources/features/03_contactUs.feature",
                "src/main/resources/features/04_TestCases.feature",
                "src/main/resources/features/05_product_productDetail.feature",
                "src/main/resources/features/06_searchProduct.feature",
                "src/main/resources/features/07_subscription.feature"
        },
        glue = {"stepDefinitions", "hooks"},
        plugin = {
                "pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
       monochrome = true
)
public class TestRunner {}