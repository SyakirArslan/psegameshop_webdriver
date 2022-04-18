package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By formLoginandRegis = By.className("icon-user");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormLogin(){
        driver.findElement(formLoginandRegis).click();
        return new LoginPage(driver);
    }

    public RegisterPage clickFormRegister(){
        driver.findElement(formLoginandRegis).click();
        return new RegisterPage(driver);
    }
}
