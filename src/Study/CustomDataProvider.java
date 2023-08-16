package Study;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

    @DataProvider(name = "logindata")
    public Object[][] getData(){
        Object[][] data ={{"abc@gmail.com","abc"},{"xyz@gmail.com","xyz"},{"kob@gmail.com","kob"}};
        return data;
    }

}
