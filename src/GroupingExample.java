import org.testng.annotations.Test;

public class GroupingExample {

    @Test(groups = {"sanity"})
    void test1(){
        System.out.println("this is test 1");
    }

    @Test(groups = {"regresstion"})
    void test2(){
        System.out.println("this is test 2");
    }

    @Test(groups = {"regresstion"})
    void test3(){
        System.out.println("this is test 3");
    }

    @Test(groups = {"regresstion"})
    void test4(){
        System.out.println("this is test 4");
    }

    @Test(groups = {"sanity","regresstion"})
    void test5(){
        System.out.println("this is test 5");
    }

}
