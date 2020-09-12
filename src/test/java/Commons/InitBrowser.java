package Commons;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import PageObject.DashboardPage;
import PageObject.Login;


public class InitBrowser {

   public WebDriver driver;
   public Login login ;
   public DashboardPage dashBoard;

    @BeforeTest
    public void initBrowser(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");


         login = new Login(driver);
         dashBoard = new DashboardPage(driver);
    }

    @AfterTest
    public void CloseBrowser(){
        driver.quit();
    }

    public void pause(int sec) {

        try {
            Thread.sleep(1000*sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
