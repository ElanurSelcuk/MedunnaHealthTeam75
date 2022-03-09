package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyAppoinmentEditsTestPage {

   public MyAppoinmentEditsTestPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='btn btn-success btn-sm']")
    public WebElement requestatestbutton;

   @FindBy(xpath = "//a[@class='btn btn-danger btn-sm']")
    public WebElement showtestresultsbutton;

   @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[1]/div/div[3]/button")
    public WebElement requestinpatientbutton;

   @FindBy(xpath = "//h2[@id='c-test-item-heading']")
    public WebElement TestItemstext;

   @FindBy(xpath = "//input[@name='1401']")
    public WebElement Glucosecheckbox;

   @FindBy(xpath ="//input[@name='1402']")
    public WebElement Ureacheckbox;

   @FindBy(xpath = "//input[@name='1403']")
    public WebElement Creatiniecheckbox;

    @FindBy(xpath = "//input[@name='1404']")
    public WebElement Sodiumcheckbox;

    @FindBy(xpath = "//input[@name='1405']")
    public WebElement Potassiumcheckbox;

    @FindBy(xpath = "//input[@name='1406']")
    public WebElement Totalproteincheckbox;

    @FindBy(xpath = "//input[@name='1407']")
    public WebElement Albumincheckbox;

    @FindBy(xpath = "//input[@name='1408']")
    public WebElement Hemoglobincheckbox;

    @FindBy(xpath = "//input[@name='8161']")
    public WebElement Cholesterol8checkbox;

    @FindBy(xpath = "//input[@name='8162']")
    public WebElement Cholesterol9checkbox;

    @FindBy(xpath = "//input[@name='8163']")
    public WebElement VitaminDcheckbox;

    @FindBy(xpath = "//input[@name='8165']")
    public WebElement Albimocheckbox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement savebuttonontestitemspage;

  @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr/td[7]/div/a")
    public WebElement viewresultsbutton1;

  @FindBy(xpath = "//*[@id='c-test-result-heading']")
    public WebElement testresultsheading;


}
