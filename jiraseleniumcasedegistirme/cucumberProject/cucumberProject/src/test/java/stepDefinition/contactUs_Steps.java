package stepDefinition;

import PageObjectModel.contactUs_Page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import token.bearerToken;
import utilities.Driver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class contactUs_Steps extends token.bearerToken {

    bearerToken requestSender = new bearerToken();

    public static String text1;
    public static final String GREEN = "\033[0;32m";
    public static final String RESET = "\033[0m";

    @Before
    public void open() throws MalformedURLException {

        requestSender = new bearerToken();
    }

    private WebDriver driver;
    contactUs_Page contactUs_page= new contactUs_Page();
    @Given("navigate to Website")
    public void navigate_to_website() throws Throwable {
        try {
            driver = Driver.getDriver();
            driver.manage().window().maximize();
            driver.get("http://www.automationpractice.pl/index.php");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            requestSender.changeResultt("JIR-2", true);
        } catch (Exception e){
            requestSender.changeResultt("JIR-2", false);
            tearDown();
            System.exit(0);
    }

}

    @Given("^click on contact us button$")
    public void click_on_contact_us_button()  throws Throwable {
        contactUs_page.clickContactUsButton();
    }

    @Given("select Subject Heading")
    public void select_subject_heading()  throws Throwable {
        contactUs_page.selectFromDropdown();
    }

    @Given("type Email")
    public void type_email()  throws Throwable {
        contactUs_page.typeEmail();
    }

    @Given("type Order reference")
    public void type_order_reference()  throws Throwable {
        contactUs_page.TypeOrderRefarance();
    }

    @Given("type a message")
    public void type_a_message()  throws Throwable {
        contactUs_page.typeMassege();
    }

    @When("click on send button")
    public void click_on_send_button()  throws Throwable {
        contactUs_page.clickOnSendButton();
    }

    @Then("verify success message")
    public void verify_success_message()  throws Throwable {
        contactUs_page.assertMyMessage();


    }

    @After
    public void tearDown() {
        // Close the driver and send test results
        if (driver != null) {
            driver.quit();
        }
        try {
            requestSender.sendTestResults();
        } catch (IOException e) {
            System.out.println("Error sending test results: " + e.getMessage());
        }

    }

}
