package Study;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {

    //Dependency (phu thuoc) ở test annonation nay thì sẽ phu thuoc vao method duoc gan ten như trong mau duoi muon chạy case drive car
    //thi phải phu thuoc vao case startcar pass va muon stop thi phai pass case drive car

    @Test
    public void startcar() {
        System.out.println("Car Started");
//        Assert.fail();
    }

    @Test(dependsOnMethods = {"startcar"})
    public void drivecar() {
        System.out.println("drive a car");
    }

    @Test(dependsOnMethods = {"drivecar"})
    public void stopcar() {
        System.out.println("stop a car");
    }

    @Test(dependsOnMethods = {"drivecar","stopcar"},alwaysRun = true)
    public void parkcar() {
        System.out.println("Park a car");
    }

}
