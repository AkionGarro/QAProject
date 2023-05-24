package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceSmartHomePF {


    @FindBy(xpath = "/html/body/section/section/section[2]/footer/div/div[3]/div/div/div[2]/button")
    WebElement languagePicker;

    @FindBy(xpath = "/html/body/section/section/section[2]/footer/div/div[3]/div/div/a/button")
    WebElement countryPicker;

    @FindBy(xpath = "/html/body/section/section/section[2]/footer/div/div[3]/div/div/div[2]/ul/li[1]/a")
    WebElement spanishPicker;

    @FindBy(xpath = "/html/body/section/section/section[2]/footer/div/div[3]/div/div/div[2]/ul/li[2]/a")
    WebElement englishPicker;

    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[5]/ul/li/div/div/span")
    WebElement shoppingCart;

    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[1]/a/div/img")
    WebElement logoPriceSmart;

    WebDriver driver;

    PriceSmartCountryPF countries;


    public PriceSmartHomePF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
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
    public Boolean shoppingCartIsEmpty() {
        int items =  Integer.parseInt(this.shoppingCart.getText());
        return items == 0;
    }

    public void logoIsDesplayed(){
        this.logoPriceSmart.isDisplayed();
    }

    public void languagePicker(String lang){
        lang = lang.toLowerCase();
        clickLanguagePicker();
        switch (lang){
            case ("ingles"):
                clickEnglishPicker();
                break;
            case("español"):
                clickSpanishPicker();
                break;
            default:
                System.out.println("Error no existe el lenguaje");
        }
    }

    public void countryClubPicker(String country,String club){
        clickCountryPicker();
        this.countries = new PriceSmartCountryPF(driver);
        countries.selectCountry(country,club);
    }




}
