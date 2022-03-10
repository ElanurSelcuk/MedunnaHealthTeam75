package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyAppoinmentEditsPage {

    public MyAppoinmentEditsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountmenu;

    @FindBy(xpath = "//*[.='Sign in']")
    public WebElement signinbuttonataccountmenu;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name=rememberMe'']")
    public WebElement remembermebutton;

    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[2]/span")
    public WebElement signinbuttontoassignrole;

    @FindBy(xpath = "//*[.='MY PAGES']")
    public WebElement mypagestext;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a")
    public WebElement mypagesdropdown;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[1]")
    public WebElement Myappoinmentsoptionfromdropdown;


    @FindBy(xpath = "//h2[@id='appointment-heading']")
    public WebElement Appoinmentsheadingonthepage;


    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[2]")
    public WebElement editbuttonappoinmentspage;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[3]")
    public WebElement editbutton3appoinmentspage;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[6]")
    public WebElement editbutton6appoinmentspage;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm'][1]")
    public WebElement editbutton1appoinmentspage;

    @FindBy(xpath = "//*[@id=\"hospitalmsappfrontendApp.appointment.home.createOrEditLabel\"]")
    public WebElement createoreditanappoinmenttextonpage;

    @FindBy(xpath = "//textarea[@name='anamnesis']")
    public WebElement anamnesistextbox;

    @FindBy(xpath = "//textarea[@name='treatment']")
    public WebElement treatmenttextbox;

    @FindBy(xpath = "//textarea[@name='diagnosis']")
    public WebElement diagnosistextbox;

    @FindBy(xpath = "//textarea[@name='prescription']")
    public WebElement prescriptiontextbox;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement descriptiontextbox;

    @FindBy(xpath = "//select[@name='status']")
    public WebElement Statusdropdown;

    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement savebuttononeditapppage;


    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement editaidadata;








}
