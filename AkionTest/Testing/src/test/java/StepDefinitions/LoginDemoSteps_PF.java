package StepDefinitions;

import PageFactory.HomePF;
import PageFactory.LoginPF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps_PF {

    WebDriver driver = null;
    LoginPF loginPF;
    HomePF homePF;
/*
    @Given("browser is opened")
    public void browser_is_opened() {
        System.out.println("Step: browser is opened");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        //driver = new ChromeDriver(options);
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
    public void user_put_username_and_password(String username, String password) throws InterruptedException {

        this.loginPF = new LoginPF(driver);
        loginPF.validateLogin(username, password);
        System.out.println("Step: user enters a text in search box");

    }

    @And("user click on login")
    public void user_click_on_login() {

        this.loginPF.clickLoginButton();

    }

    @Then("user is redirect to home page")
    public void user_is_redirect_to_home_page() throws InterruptedException {
        this.homePF = new HomePF(driver);
        this.homePF.logoutButtonIsDesplayed();

        driver.close();
        driver.quit();


    }

*/
}
