import common.CommonLibraries;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonLibraries {
    @Before
    public void beforeMethod(){

openBrowser();
    }
    @After

    public void afterMethod(){

        closeBrowser();

    }

}
