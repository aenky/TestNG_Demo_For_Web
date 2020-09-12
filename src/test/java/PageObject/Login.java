package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(id="Email")
    WebElement emailTextbox;

    @FindBy(id="Password")
    WebElement passwordTextBox;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement  loginBnt;



    public void loginwithValidCredentials()
    {
        emailTextbox.clear();
        emailTextbox.sendKeys("admin@yourstore.com");
        passwordTextBox.clear();
        passwordTextBox.sendKeys("admin");
        loginBnt.click();
    }
}
