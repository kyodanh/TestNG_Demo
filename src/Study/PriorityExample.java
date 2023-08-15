package Study;

import org.testng.annotations.Test;

public class PriorityExample {

    ///Priority la thu tu chay test case , stt duoc tinh theo so tang dan và enabled là text noi ve co muon thuc hien chay test

    @Test(priority = 0)
    public void Test1(){
        System.out.println("This is test 1");
    }

    @Test(priority = 1)
    public void Test2(){
        System.out.println("This is test 2");
    }

    @Test(priority = 2)
    public void Test3(){
        System.out.println("This is test 3");
    }

    @Test(priority = 3,enabled = false)
    public void Test4(){
        System.out.println("This is test 4");
    }

}
