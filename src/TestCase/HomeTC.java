package TestCase;

import Pages.HomePages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages.LoginPages;
import javax.xml.namespace.QName;

public class HomeTC {
    WebDriver driver;

    @BeforeMethod
    @Parameters({"brower", "url"})
    void setup_and_login(String brower, String app) {
        /////////////////////////////
        if (brower.equalsIgnoreCase("chrome")) {
            System.out.println("this will execute before every method");
            System.setProperty("webdriver.chrome.driver", "D:\\java\\TestNG_Demo\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if (brower.equalsIgnoreCase("Edge")) {
            System.out.println("this will execute before every method");
            System.setProperty("webdriver.Edge.driver", "D:\\java\\TestNG_Demo\\msedgedriver.exe");
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }
        driver.get(app);
        /////////////////////////////
        LoginPages.username(driver).click();
        LoginPages.username(driver).sendKeys("standard_user");
        LoginPages.password(driver).click();
        LoginPages.password(driver).sendKeys("secret_sauce");
        LoginPages.loginbutton(driver).click();
    }

    @Test(priority = 1)
    void CheckHomePage() {
        WebElement a = HomePages.Logo_HomePage(driver);
        if (a.isDisplayed()) {
            System.out.println("true");
        } else {
            Assert.fail();
        }
    }

    @Test(priority = 2)
    @Parameters({"name_product", "name_pic"})
    void click_product(String name, String pic) {
//      var a = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']")).getText();
//      System.out.println(a);
        HomePages.Product_Name(driver, name).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
        WebElement a = driver.findElement(By.xpath(pic));
        System.out.println(a.getAttribute("src"));
        var b = driver.findElement(By.xpath("//*[@id=\'inventory_item_container\']/div/div/div[2]/div[1]")).getText();
        System.out.println(b);
        try {
            Thread.sleep(1500);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }


    @AfterMethod
    void tearDown(){
        System.out.println("logout");
        driver.quit();
    }
}
