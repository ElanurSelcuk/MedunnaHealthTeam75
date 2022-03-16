package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US07_AppointmentDatePage {

 public US07_AppointmentDatePage(){
     PageFactory.initElements(Driver.getDriver(),this);

 }
@FindBy(id = "entity-menu")
public WebElement myPagesDropdown;

@FindBy(xpath = "(//*[.='Make an Appointment'])[1]")
    public WebElement makeAnAppointment;

@FindBy(id = "appoDate")
    public WebElement dateTimeBox;

@FindBy(xpath = "//*[.='Appointment date can not be past date!']")
    public WebElement currentDateMessage;

@FindBy(xpath = "(//*[.='Send an Appointment Request'])[3]")
public WebElement sendAnAppointmentRequestBox;

@FindBy(xpath = "//*[text()='Appointment registration saved!']")
public WebElement appointmentRegistrationSavedMessage;

}
