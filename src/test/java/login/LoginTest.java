package login;

import base.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    LoginPage loginpage = new LoginPage(driver);


    @DataProvider(name = "credentials")
    public Object[][] getData(){

        return new Object[][] {
                {"positif","silalet121@3dinews.com","SyakirAlvar0"},
                {"negatif","silelet121@3dinews.com","SyakirAlvarO"},
                {"negatif","silalet121@3dinews.com","SyakirAlvarO"},
                {"negatif","silelet121@3dinews.com","SyakirAlvar0"}
        };
    }

    @Test(dataProvider = "credentials")
    public void verifyLogin(String condition, String email, String password){
        loginpage.setUsername(email);
        loginpage.setPassword(password);
        loginpage.clickLoginButton();

        if ()



    }

//    //NegatifTest
//    @Test
//    public void testLoginTidakBerhasil(){
//
//      LoginPage testLogin =  homePage.clickFormLogin();
//      // username login
//      testLogin.setUsername("silalet121@3dinews.com");
//      // password login
//      testLogin.setPassword("Syakir.Alvar0");
//      testLogin.clickLoginButton();
//    }
//
//    //PositifTest
//    @Test
//    public void testLoginBerhasil(){
//
//        LoginPage testLogin =  homePage.clickFormLogin();
//        // username login
//        testLogin.setUsername("silalet121@3dinews.com");
//        // passoword login
//        testLogin.setPassword("SyakirAlvar0");
//        testLogin.clickLoginButton();
//    }
}
