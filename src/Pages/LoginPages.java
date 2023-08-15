package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPages {

    private static WebElement element = null;


    public static WebElement username(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\'user-name\']"));
        return element;
    }

    public static WebElement password(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\'password\']"));
        return element;
    }

    public static WebElement loginbutton(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\'login-button\']"));
        return element;
    }

    public static WebElement Noti(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
        return element;
    }
}
