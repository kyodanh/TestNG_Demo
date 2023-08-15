import Pages.LoginPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParametersExample {

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
    void login_setup(String brower , String app){
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
        /////////////////////////////
        System.out.println("Case login");
        LoginPages.username(driver).click();
        LoginPages.username(driver).sendKeys("standard_user");
        LoginPages.password(driver).click();
        LoginPages.password(driver).sendKeys("secret_sauce");
        LoginPages.loginbutton(driver).click();
        try {
            Thread.sleep(1500);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    //////@test là 1 method
    @Test(priority = 1)
    void checkdisplay(){
        System.out.println("this test 1 ");
        var a = driver.findElement(By.xpath("//*[@id=\'header_container\']/div[2]/span"));
        Assert.assertTrue(a.isDisplayed());
//        try {
//            Thread.sleep(1500);
//        } catch(InterruptedException e) {
//            System.out.println("got interrupted!");
//        }

    }

//    @Test(priority = 2)
//    void gotoproduct(){
//        System.out.println("this test 2 ");
//        driver.findElement(By.xpath("//*[@id=\'item_4_title_link\']/div")).click();
//        try {
//            Thread.sleep(1500);
//        } catch(InterruptedException e) {
//            System.out.println("got interrupted!");
//        }
//    }



    @AfterMethod
    void tearDown(){
        System.out.println("logout");
        driver.quit();
    }


}
