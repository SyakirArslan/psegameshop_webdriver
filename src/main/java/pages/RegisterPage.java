package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class RegisterPage {

    private static WebDriver driver;

    private static By favoriteGame = By.id("acf-field_5e758bca4e8cc");
    private static By favoriteConsole = By.id("acf-field_5e75905014c81");
    private static By HobbiesInterest = By.id("acf-field_5ea976d054e4e");
    private static By yourGender = By.id("acf-field_5ea3be750efb3-female");
    private static By emailAddress = By.id("reg_email");
    private static By Password = By.id("reg_password");
    private static By confirmPassword = By.id("reg_confirm_password");
    private static By registerButton = By.name("register");

    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    public static void setFavoriteGame(String option){
        cariDropdownElementGame().selectByVisibleText(option);
    }
        public List<String> getOptionFavoriteGame(){
             List<WebElement> selectedElements =
                   cariDropdownElementGame().getAllSelectedOptions();
             return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
        }

        private static Select cariDropdownElementGame(){
            return new Select(driver.findElement(favoriteGame));
        }

    public static void setFavoriteConsole(String option){
        cariDropdownElementConsole().selectByVisibleText(option);
    }
        public List<String> getOptionFavoriteConsole(){
            List<WebElement> selectedElement =
                    cariDropdownElementConsole().getAllSelectedOptions();
            return selectedElement.stream().map(e->e.getText()).collect(Collectors.toList());
        }

        private static Select cariDropdownElementConsole(){
            return new Select(driver.findElement(favoriteConsole));
        }

    public static void setHobbiesInterest(String option){
        cariDropdownElementHobbies().selectByVisibleText(option);
    }
        public List<String> getOptionHobbiesInterest(){
            List<WebElement> selectedElement =
                    cariDropdownElementHobbies().getAllSelectedOptions();
            return selectedElement.stream().map(e->e.getText()).collect(Collectors.toList());
        }
        private static Select cariDropdownElementHobbies(){
            return new Select(driver.findElement(HobbiesInterest));
        }

    public static void setYourGender(){
        driver.findElement(yourGender).click();
    }

    public static void setEmailAddress(String email){
        driver.findElement(emailAddress).sendKeys(email);
    }

    public static void setPassword(String password){
        driver.findElement(Password).sendKeys(password);
    }

    public static void setConfirmPassword(String confirmPass){
        driver.findElement(confirmPassword).sendKeys(confirmPass);
    }

    public static void setRegisterButton(){
        driver.findElement(registerButton).click();
    }
}
