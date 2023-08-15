package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePages {

    private static WebElement element = null;


    public static WebElement Logo_HomePage(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\'header_container\']/div[2]/span"));
        return element;
    }



    public static WebElement Product_Name(WebDriver driver,String name){
        element = driver.findElement(By.xpath(name));
        return element;
    }



}
