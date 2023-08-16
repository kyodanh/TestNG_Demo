package Study;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

   @Test(dataProvider = "logindata",dataProviderClass = CustomDataProvider.class)
   public void logintest(String email,String pwd){
        System.out.println(email+""+pwd);
   }



}
