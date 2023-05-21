package StepDefinitions;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps_POM {

    WebDriver driver = null;
    LoginPage loginPage = null;
    @Given("browser is opened")
    public void browser_is_opened() {
        System.out.printf("Trying POM TEST");
        System.out.println("Step: browser is opened");
        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @And("user go to login page now")
    public void user_go_to_login_page_now() {

        driver.navigate().to("https://example.testproject.io/web/");
        System.out.println("Step: user go to login page now");
    }
    @When("^user put (.*) and (.*)$")
    public void user_put_username_and_password(String username,String password) throws InterruptedException {
        this.loginPage = new LoginPage(this.driver);
        loginPage.validateLogin(username,password);

        Thread.sleep(2000);
        System.out.println("Step: user enters a text in search box");

    }
    @And("user click on login")
    public void user_click_on_login() {
        loginPage.clickLoginButton();
        System.out.println("Step: user click on login");
    }
    @Then("user is redirect to home page")
    public void user_is_redirect_to_home_page() throws InterruptedException {
        Thread.sleep(2000);
        this.loginPage.logoutButtonIsDesplayed();
        driver.close();
        driver.quit();


    }

}
