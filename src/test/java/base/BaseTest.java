package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

public class BaseTest {

    public String baseUrl = "https://www.psegameshop.com/";
    String driverPath = "D:\\QA Automation\\ChromeDriver\\chromedriver.exe";
    public WebDriver driver;
    protected HomePage homePage;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
       // driver.manage().window().maximize();

        homePage = new HomePage(driver);

//        WebElement inputLink = driver.findElement(By.className("icon-user"));
//        inputLink.click();
//        System.out.println(driver.getTitle());
//        driver.quit();
    }

    @AfterTest
    public void tearDown(){
       // driver.quit();
    }

}
