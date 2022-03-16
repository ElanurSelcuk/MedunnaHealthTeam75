package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US22_StaffPage {
    public US22_StaffPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
   @FindBy(xpath = "//*[@data-icon='th-list']")
public WebElement mypagesDropdown;
    @FindBy(xpath = "(//*[text()='Search Patient'])[1]")
public WebElement searchPatient;
    @FindBy(xpath = "//*[@name='ssn']")
public WebElement patientSSNBox;
    @FindBy(xpath = "(//*[text()='ceyda'])[1]")
public WebElement patientceyda;


}
