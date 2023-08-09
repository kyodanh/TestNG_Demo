//1.setup - open browser
//2.login
//3.close

import org.testng.annotations.Test;


public class FirstTestCase {

    //bai hoc ve tao test case @test trong testNG

    @Test(priority = 1)
    void setup(){
        System.out.println("open brower");
    }

    @Test(priority = 2)
     void login(){
        System.out.println("This is Login test");
    }

    @Test(priority = 3)
    void teardown(){
        System.out.println("closing brower");
    }

}
