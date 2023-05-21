package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePF {
    @FindBy(xpath = "/html/body/div[2]/div[2]/form/div[6]/button[2]")
    WebElement logoutButton;

    WebDriver driver;

    public HomePF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void logoutButtonIsDesplayed(){
        this.logoutButton.isDisplayed();
    }
}
