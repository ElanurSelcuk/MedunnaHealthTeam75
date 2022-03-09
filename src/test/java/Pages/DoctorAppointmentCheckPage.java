package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DoctorAppointmentCheckPage {

    public DoctorAppointmentCheckPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(id="account-menu")
        public WebElement loginDropdown;

        @FindBy(xpath = "(//*[text()='Sign in'])[1]")
        public WebElement signInButton;

        @FindBy(id = "username")
        public WebElement username;

        @FindBy(id = "password")
        public WebElement password;

        @FindBy(xpath = "//button[@type='submit']")
        public WebElement loginButton;

        @FindBy(xpath = "//*[.='MY PAGES']")
        public WebElement myPagesDropdown;

        @FindBy(xpath = "//*[.='My Appointments']")
        public WebElement myAppointmentsButton;

        @FindBy(id = "appointment-heading")
        public WebElement appointmentsHeader;

        @FindBy(xpath = "//*[.='Edit']")
        public WebElement patientAppointmentEditButton;

        @FindBy(xpath = "//input[@id='appointment-id']")
        public WebElement idField;

        @FindBy(xpath = "//input[@id='appointment-startDate']")
        public WebElement startDateTime;

        @FindBy(xpath = "//input[@id='appointment-endDate']")
        public WebElement endDateTime;


}
