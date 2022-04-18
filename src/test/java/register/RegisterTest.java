package register;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.RegisterPage;

public class RegisterTest extends BaseTest {

    @Test
    public void testRegisterBerhasil(){

        // Muncul Notif Thank you for registering. Your account has to be activated before you can login.
        // Please check your email.

        var linkRegister = homePage.clickFormRegister();
        String option1 = "Action";
        String option2 = "Playstation";
        String option3 = "Culinary";
        String email = "temp_mail@yahoo.com";
        String password = "SyakirAlvar0";
        String confimPass = "SyakirAlvar0";

        // Favorite Game
        RegisterPage.setFavoriteGame(option1);
        linkRegister.getOptionFavoriteGame();
       // Favorite Console
        RegisterPage.setFavoriteConsole(option2);
        linkRegister.getOptionFavoriteConsole();
        // Hobbies Interest
        RegisterPage.setHobbiesInterest(option3);
        linkRegister.getOptionHobbiesInterest();
        // Gender
        linkRegister.setYourGender();
        // Email
        linkRegister.setEmailAddress(email);
        // Password
        linkRegister.setPassword(password);
        // Confirm Password
        linkRegister.setConfirmPassword(confimPass);
        // Button Register
        linkRegister.setRegisterButton();
    }
    @Test
    public void testRegisterEmailKosong(){

        // Harus notif "Error: Please provide a valid email address."

        var linkRegister = homePage.clickFormRegister();
        String option1 = "Action";
        String option2 = "Playstation";
        String option3 = "Culinary";
        String email = "";
        String password = "SyakirAlvar0";
        String confimPass = "SyakirAlvar0";

        // Favorite Game
        RegisterPage.setFavoriteGame(option1);
        linkRegister.getOptionFavoriteGame();
        // Favorite Console
        RegisterPage.setFavoriteConsole(option2);
        linkRegister.getOptionFavoriteConsole();
        // Hobbies Interest
        RegisterPage.setHobbiesInterest(option3);
        linkRegister.getOptionHobbiesInterest();
        // Gender
        linkRegister.setYourGender();
        // Email
        linkRegister.setEmailAddress(email);
        // Password
        linkRegister.setPassword(password);
        // Confirm Password
        linkRegister.setConfirmPassword(confimPass);
        // Button Register
        linkRegister.setRegisterButton();
    }

    @Test
    public void testRegisterPasswordKosong(){

        // Harus notif "Error: Please enter an account password."

        var linkRegister = homePage.clickFormRegister();
        String option1 = "Action";
        String option2 = "Playstation";
        String option3 = "Culinary";
        String email = "bebek_goreng@yahoo.com";
        String password = "";
        String confimPass = "";

        // Favorite Game
        RegisterPage.setFavoriteGame(option1);
        linkRegister.getOptionFavoriteGame();
        // Favorite Console
        RegisterPage.setFavoriteConsole(option2);
        linkRegister.getOptionFavoriteConsole();
        // Hobbies Interest
        RegisterPage.setHobbiesInterest(option3);
        linkRegister.getOptionHobbiesInterest();
        // Gender
        linkRegister.setYourGender();
        // Email
        linkRegister.setEmailAddress(email);
        // Password
        linkRegister.setPassword(password);
        // Confirm Password
        linkRegister.setConfirmPassword(confimPass);
        // Button Register
        linkRegister.setRegisterButton();
    }
}


