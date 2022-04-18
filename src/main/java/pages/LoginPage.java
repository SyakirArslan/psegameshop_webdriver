package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

  //  public static Object setPassword;
    private static WebDriver driver;

    private static By usernameField = By.id("username");
    private static By passwordField = By.id("password");
    private static By loginButton = By.name("login");

    public LoginPage(WebDriver driver){

        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public myAccountArea clickLoginButton(){
        driver.findElement(loginButton).click();
        return new myAccountArea(driver);
    }
}
