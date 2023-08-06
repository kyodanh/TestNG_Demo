import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {
    @Test(priority = 1)
    void setup(){
        System.out.println("open brower");
    }

    @Test(priority = 2)
    void viewproduct_homepage(){
        System.out.println("This is view product homepage");
    }

    @Test(priority = 3)
    void viewproduct_detail(){
        System.out.println("This is view product detail");
        Assert.assertEquals(1,1);
    }

    @Test(priority = 4)
    void addtocart(){
        System.out.println("This is add product to cart");
    }

    @Test(priority = 5)
    void teardown(){
        System.out.println("closing brower");
    }

}
