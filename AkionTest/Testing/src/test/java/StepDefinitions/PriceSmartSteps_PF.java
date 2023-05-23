package StepDefinitions;
import PageFactory.PriceSmartCountryPF;
import PageFactory.PriceSmartHomePF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class PriceSmartSteps_PF {
    WebDriver driver = null;
    PriceSmartHomePF home = null;
    PriceSmartCountryPF country = null;

    @Given("browser is running")
    public void browser_is_running() {
        System.out.println("Step: browser is running");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        //driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }


    @And("user go to priceSmart home page")
    public void user_go_to_price_smart_home_page() {
        System.out.println("Step: user go to priceSmart home page");
        this.driver.navigate().to("https://www.pricesmart.com/site/cr/en");


    }
    @When("^user put (.*) and (.*) and (.*)$")
    public void user_put_username_and_password_and_language(String username, String password, String Language)  {
        System.out.println("Step: user put username and password and language");

    }
    @Then("user is redirect to country in a specific club")
    public void user_is_redirect_to_country_in_a_specific_club() {
        System.out.println("Step: ");
    }
    @Then("user's shopping cart is empty")
    public void user_s_shopping_cart_is_empty() {
        System.out.println("Step: ");
    }
}
