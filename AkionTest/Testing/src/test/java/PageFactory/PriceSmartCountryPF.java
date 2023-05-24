package PageFactory;

import PageFactory.ClubsPF.CostaRicaClubsPF;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceSmartCountryPF {

    @FindBy(xpath = "/html/body/section/section/section[1]/div/div[5]/div/div/div[1]/div/ul/li[1]/a")
    WebElement costaRicaPicker;

    @FindBy(xpath = "/html/body/section/section/section[1]/div/div[5]/div/div/div[1]/div/ul/li[2]/a")
    WebElement salvadorPicker;

    @FindBy(xpath = "/html/body/section/section/section[1]/div/div[5]/div/div/div[1]/div/ul/li[3]/a")
    WebElement guatemalaPicker;

    @FindBy(xpath = "/html/body/section/section/section[1]/div/div[5]/div/div/div[1]/div/ul/li[4]/a")
    WebElement hondurasPicker;

    @FindBy(xpath = "/html/body/section/section/section[1]/div/div[5]/div/div/div[1]/div/ul/li[5]/a")
    WebElement nicaraguaPicker;

    @FindBy(xpath = "/html/body/section/section/section[1]/div/div[5]/div/div/div[1]/div/ul/li[6]/a")
    WebElement panamaicker;

    @FindBy(xpath = "/html/body/section/section/section[1]/div/div[5]/div/div/div[3]/div/ul/li[1]/a")
    WebElement arubaPicker;

    @FindBy(xpath = "/html/body/section/section/section[1]/div/div[5]/div/div/div[3]/div/ul/li[2]/a")
    WebElement barbadosPicker;

    @FindBy(xpath = "/html/body/section/section/section[1]/div/div[5]/div/div/div[3]/div/ul/li[3]/a")
    WebElement domincanRepublicPicker;

    @FindBy(xpath = "/html/body/section/section/section[1]/div/div[5]/div/div/div[3]/div/ul/li[4]/a")
    WebElement jamaicaPicker;

    @FindBy(xpath = "/html/body/section/section/section[1]/div/div[5]/div/div/div[3]/div/ul/li[5]/a")
    WebElement trinidadAndTobagoPicker;

    @FindBy(xpath = "/html/body/section/section/section[1]/div/div[5]/div/div/div[3]/div/ul/li[6]/a")
    WebElement virginIslandsUsPicker;

    @FindBy(xpath = "/html/body/section/section/section[1]/div/div[5]/div/div/div[5]/div/ul/li/a")
    WebElement colombiaPicker;

    CostaRicaClubsPF costaRicaClubsPF;

    WebDriver driver;

    public PriceSmartCountryPF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickCostaRicaPicker( ) {
        this.costaRicaPicker.click();
    }

    public void clickSalvadorPicker( ) {
        this.salvadorPicker.click();
    }

    public void clickGuatemalaPicker( ) {
        this.guatemalaPicker.click();
    }

    public void clickHondurasPicker( ) {
        this.hondurasPicker.click();
    }

    public void clickNicaraguaPicker( ) {
        this.nicaraguaPicker.click();
    }

    public void clickPanamaPicker( ) {
        this.panamaicker.click();
    }

    public void clickArubaPicker( ) {
        this.arubaPicker.click();
    }

    public void clickBarbadosPicker( ) {
        this.barbadosPicker.click();
    }

    public void clickDominicanRepublicPicker( ) {
        this.domincanRepublicPicker.click();
    }

    public void clickJamaicaPicker( ) {
        this.jamaicaPicker.click();
    }

    public void clickTrinidadAndTobagoPicker( ) {
        this.trinidadAndTobagoPicker.click();
    }

    public void clickVirginIslandsUsPicker() {
        this.virginIslandsUsPicker.click();
    }

    public void clickColombiaPicker() {
        this.colombiaPicker.click();
    }


    public void selectCountry(String country,String club){
        switch (country) {
            case "Costa Rica":
                clickCostaRicaPicker();
                this.costaRicaClubsPF = new CostaRicaClubsPF(driver);
                costaRicaClubsPF.pickClub(club);
                break;
            case "Salvador":
                clickSalvadorPicker();
                break;
            case "Guatemala":
                clickGuatemalaPicker();
                break;
            case "Honduras":
                clickHondurasPicker();
                break;
            case "Nicaragua":
                clickNicaraguaPicker();
                break;
            case "Panamá":
                clickPanamaPicker();
                break;
            case "Aruba":
                clickArubaPicker();
                break;
            case "Barbados":
                clickBarbadosPicker();
                break;
            case "Republica Dominicana":
                clickDominicanRepublicPicker();
                break;
            case "Jamaica":
                clickJamaicaPicker();
                break;
            case "Trinidad y Tobago":
                clickTrinidadAndTobagoPicker();
                break;
            case "Virgin Island US":
                clickVirginIslandsUsPicker();
                break;
            case "Colombia":
                clickColombiaPicker();
                break;
            default:
                System.out.println("Unknown country: " + country);
                break;
        }
    }
}
