package tests;

import Pages.LoginPage;
import Pages.SecurrePage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        SecurrePage securePage = new SecurrePage(driver);

        loginPage.enterusername("tomsmith");
        loginPage.enterpassword("SuperSecretPassword!");
        loginPage.clicklogin();

        Assert.assertTrue(
                securePage.isLoginSuccess(),
                "User should be redirected to secure page after successful login"
        );
    }

    @Test
    public void testErrorMessageDisplayedForInvalidLogin() {
        throw new SkipException(
                "Skipped due to known bug BR-002: Error message issue"
        );
    }

    @Test
    public void testLoginButtonMultipleClicks() {
        throw new SkipException(
                "Skipped due to known bug BR-004: Login button allows multiple clicks"
        );
    }
}