package DataProvider;

import org.testng.annotations.DataProvider;

public class LoginData {

    @DataProvider(name = "logindata")
    public Object[][] LoginData(){
        Object[][] data ={{"standard_user","secret_sauce"}};
        return data;
    }


}
