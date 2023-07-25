package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class register_Page  extends AbstractClass {
    private WebDriver driver;

    public register_Page() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    private WebElement signInButton;

    @FindBy(id = "email_create")
    private WebElement emailTexBox;

    @FindBy(id = "SubmitCreate")
    private WebElement submitButton;

    @FindBy(id = "id_gender")
    private WebElement gender;

    @FindBy(id = "customer_firstname")
    private WebElement firstName;

    @FindBy(id = "customer_lastname")
    private WebElement lastName;
    @FindBy(id = "passwd")
    private WebElement password;

    public void clickOnSignInButton() {
        clickFunction(signInButton);

    }

    public void typeEmail(String email) {
        sendKeysFunction(emailTexBox, email);

    }

    public void clickOnSubmitButton() {
        clickFunction(submitButton);

    }

    public void clickOnGender() {
        clickFunction(gender);

    }

    public void typeFirstNameAndLastName(String firstName1, String lastName2) {
        sendKeysFunction(firstName, firstName1);
        sendKeysFunction(lastName, lastName2);

    }
    public void typePassword(String password1){
        sendKeysFunction(password,password1);
    }
}
