package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurrePage {
    WebDriver driver;
    public SecurrePage(WebDriver driver) {
        this.driver = driver;
    }
    By successMessage = By.id("flash");
    public boolean isLoginSuccess() {
        return driver.getCurrentUrl().contains("/secure");
    }
    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }
}
