package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceSmartHomePF {

    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement clubPicker;

    @FindBy(xpath = "/html/body/section/section/section[2]/footer/div/div[3]/div/div/div[2]/button")
    WebElement languagePicker;

    @FindBy(xpath = "/html/body/section/section/section[2]/footer/div/div[3]/div/div/a/button")
    WebElement countryPicker;

    @FindBy(xpath = "/html/body/section/section/section[2]/footer/div/div[3]/div/div/div[2]/ul/li[1]/a")
    WebElement spanishPicker;

    @FindBy(xpath = "/html/body/section/section/section[2]/footer/div/div[3]/div/div/div[2]/ul/li[2]/a")
    WebElement englishPicker;

    WebDriver driver;

    public PriceSmartHomePF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickClubPicker() {
      this.clubPicker.click();
    }

    public void clickLanguagePicker() {
        this.languagePicker.click();
    }

    public void clickCountryPicker() {
      this.countryPicker.click();
    }

    public void clickEnglishPicker() {
        this.spanishPicker.click();
    }

    public void clickSpanishPicker() {
        this.englishPicker.click();
    }


}
