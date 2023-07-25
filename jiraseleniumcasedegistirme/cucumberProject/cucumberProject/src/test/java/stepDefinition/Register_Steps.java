package stepDefinition;

import PageObjectModel.register_Page;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Register_Steps {
    register_Page register_page = new register_Page();
    private WebDriver driver;
    @Given("Navigate to Website")
    public void navigateToWebsite()throws Throwable {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("click Sing in button")
    public void clickSingInButton()throws Throwable {
        register_page.clickOnSignInButton();
    }

    @And("type email{string}")
    public void typeEmail(String email) throws Throwable{
        register_page.typeEmail(email);

    }

    @And("click on Create an Account button")
    public void clickOnCreateAnAccountButton()throws Throwable {
        register_page.clickOnSubmitButton();
    }

    @And("choose title")
    public void chooseTitle(){
    }

    @And("type firstname {string} and lastname {string}")
    public void typeFirstnameAndLastname(String firstname, String lastname) throws Throwable{
        register_page.typeFirstNameAndLastName(firstname,lastname);
    }

    @And("type password {string}")
    public void typePassword(String password)throws Throwable {
        register_page.typePassword(password);
    }
    @After
    public void quitDriver() throws InterruptedException {
        Thread.sleep(2000);

        Driver.closeDriver();
    }
}
