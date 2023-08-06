import org.testng.annotations.*;

public class TC2 {

    @BeforeClass
    void BeforeClass(){
        System.out.println("this will execute before every Class");
    }

    @AfterClass
    void AfterClass(){
        System.out.println("this will execute after every Class");
    }


    @BeforeMethod
    void BeforeMethod(){
        System.out.println("this will execute before every method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("this will execute after every method");
    }

    @Test
    void test3(){
        System.out.println("this is test 3");
    }

    @Test
    void test4(){
        System.out.println("this is test 4");
    }

    @BeforeSuite
    void BeforeSuite(){
        System.out.println("this will execute before suite");
    }

    @AfterSuite
    void AfterSuite(){
        System.out.println("this will execute after suite");
    }
}
