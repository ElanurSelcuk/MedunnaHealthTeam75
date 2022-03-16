package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US06_LoginPage {
    public US06_LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//*[@data-icon='user']")
public WebElement loginIcon;

@FindBy(id ="login-item")
        public WebElement signinDropDown;

@FindBy(name = "username")
public WebElement usernameBox;

@FindBy(id= "password")
    public WebElement passwordBox;

@FindBy(xpath = "//*[@type='submit']")
    public WebElement signInButton;
}
