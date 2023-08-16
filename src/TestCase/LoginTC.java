package TestCase;

import Pages.LoginPages;
import Study.CustomDataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import DataProvider.LoginData;
public class LoginTC {

    WebDriver driver;

//    @BeforeClass
//    @Parameters({"brower","url"})
//    void setup(String brower,String app){
//        if(brower.equalsIgnoreCase("chrome")){
//            System.out.println("this will execute before every class");
//            System.setProperty("webdriver.chrome.driver","D:\\java\\TestNG_Demo\\chromedriver.exe");
//            driver = new ChromeDriver();
//            driver.manage().window().maximize();
//        } else if (brower.equalsIgnoreCase("Edge")) {
//            System.out.println("this will execute before every class");
//            System.setProperty("webdriver.Edge.driver","D:\\java\\TestNG_Demo\\msedgedriver.exe");
//            driver = new EdgeDriver();
//            driver.manage().window().maximize();
//        }
//        driver.get(app);
//        try {
//            Thread.sleep(1500);
//        } catch(InterruptedException e) {
//            System.out.println("got interrupted!");
//        }
//    }

    @BeforeMethod
    @Parameters({"brower","url"})
    void login_setup(String brower,String app){
        /////////////////////////////
        if(brower.equalsIgnoreCase("chrome")){
            System.out.println("this will execute before every method");
            System.setProperty("webdriver.chrome.driver","D:\\java\\TestNG_Demo\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if (brower.equalsIgnoreCase("Edge")) {
            System.out.println("this will execute before every method");
            System.setProperty("webdriver.Edge.driver","D:\\java\\TestNG_Demo\\msedgedriver.exe");
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }
        driver.get(app);
        /////////////////////////////
        try {
            Thread.sleep(1500);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    //////@test là 1 method 
    @Test(priority = 1,dataProvider = "logindata",dataProviderClass = LoginData.class)
    void CaseLoginPass(String username, String password){
        System.out.println("CaseLoginPass");
        LoginPages.username(driver).click();
        LoginPages.username(driver).sendKeys(username);
        LoginPages.password(driver).click();
        LoginPages.password(driver).sendKeys(password);
        LoginPages.loginbutton(driver).click();
        try {
            Thread.sleep(1500);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }

    }

    @Test(priority = 2)
    void CaseLogin_MissPassword() {
        System.out.println("this test 2 ");
        LoginPages.username(driver).click();
        LoginPages.username(driver).sendKeys("standard_user");
        LoginPages.password(driver).click();
        LoginPages.password(driver).sendKeys("");
        LoginPages.loginbutton(driver).click();
        WebElement text = LoginPages.Noti(driver);
//        System.out.println(text);
//        Assert.assertEquals(text, text1);
        if (text.isDisplayed()){
            System.out.println("Hiển thị thông báo - Epic sadface: Password is required");
        }else{
            System.out.println("Case đang bị sai");
        }

        try {
            Thread.sleep(1500);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }

    }

    @Test(priority = 3)
    void CaseLogin_NoInput() {
        System.out.println("this test 2 ");
        LoginPages.username(driver).click();
        LoginPages.username(driver).sendKeys("");
        LoginPages.password(driver).click();
        LoginPages.password(driver).sendKeys("");
        LoginPages.loginbutton(driver).click();
        WebElement a = LoginPages.Noti(driver);
        var text = LoginPages.Noti(driver).getText();
        //////////////////////////////////////////////
        if (a.isDisplayed()){
            System.out.println(text);
        }else{
            System.out.println("Case đang bị sai");
        }
        //////////////////////////////////////////////
        try {
            Thread.sleep(1500);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
        /////////////////////////////////////////////

    }
    @AfterMethod
    void tearDown(){
        System.out.println("logout");
        driver.quit();
    }


}
