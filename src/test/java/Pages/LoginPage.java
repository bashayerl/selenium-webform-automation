package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    By usernameField=By.id("username");
    By passwordField=By.id("password");
    By login=By.cssSelector("#login > button");
    By errormessage=By.id("flash");
    public void enterusername(String username) {
        driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys(username);
    }
    public void enterpassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clicklogin() {
        driver.findElement(login).click();
    }
    public String geterrormessage() {
        return driver.findElement(errormessage).getText();
    }

}
