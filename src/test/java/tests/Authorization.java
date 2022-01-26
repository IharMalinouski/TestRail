package tests;

import io.qameta.allure.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Authorization extends BaseTest {

    @BeforeMethod
    @Test(description = "Авторизация")
    @Description("Авторизация на сайте TESTRAIL")
    public void authorization() {
        loginStep
                .authorization();
    }

    @AfterMethod
    @Test(description = "Logout")
    @Description("Logout")
    public void logout() {
        commonStep
                .logout();
    }
}
