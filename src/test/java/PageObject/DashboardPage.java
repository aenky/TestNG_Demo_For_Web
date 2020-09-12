package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardPage {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }


    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    WebElement title;


    public void verifyTitle()
    {
        Assert.assertTrue(title.isDisplayed());

    }



}
