package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class contactUs_Page extends  AbstractClass{

    WebDriver driver;

    public contactUs_Page(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[2]/a" )
    private WebElement contactUsButton;

    public void clickContactUsButton(){
        clickFunction(contactUsButton);
    }
    @FindBy(id = "id_contact")
    private WebElement subjectHeadingDropdown;

    public void selectFromDropdown(){

        selectElementFromDropdown(subjectHeadingDropdown,"Webmaster");
    }
    @FindBy(id = "email")
    private WebElement emailTex;

    public void typeEmail(){

        sendKeysFunction(emailTex,"feneli_uygar@hotmail.com");

    }
    @FindBy(id = "id_order")
    private WebElement order;

    public void TypeOrderRefarance(){
        sendKeysFunction(order,"order132");

    }
    @FindBy(id = "message")
    private WebElement messageBox;

    public void typeMassege(){
        sendKeysFunction(messageBox,"Ürün kırık geldi bana geri dönüş yaparmısınız?");

    }
    @FindBy(id = "submitMessage")
    private WebElement sendButton;

    public void clickOnSendButton(){
        clickFunction(sendButton);
    }
    @FindBy(css = "p.alert-success")
    private WebElement successMessage;

    public void assertMyMessage(){
        Assertion(successMessage,"Your message has been successfully sent to our team.");


    }


}
