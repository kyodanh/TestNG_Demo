import org.testng.annotations.*;

public class TC1 {

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
    void test1(){
        System.out.println("this is test 1");
    }

    @Test
    void test2(){
        System.out.println("this is test 2");
    }

    @BeforeTest
    void BeforeTest(){
        System.out.println("this will execute before test");
    }

    @AfterTest
    void AfterTest(){
        System.out.println("this will execute after test");
    }

}
