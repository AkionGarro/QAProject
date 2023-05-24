package PageFactory;

import PageFactory.ClubsPF.*;
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
    SalvadorClubsPF salvadorClubsPF;

    GuatemalaClubsPF guatemalaClubsPF;

    HondurasClubsPF hondurasClubsPF;

    NicaraguaClubsPF nicaraguaClubsPF;
    PanamaClubsPF panamaClubsPF;

    WebDriver driver;
    private ArubaClubsPF arubaClubsPF;
    private BarbadosClubsPF barbadosClubsPF;
    private RepublicaDominicanaClubsPF dominicanRepublicClubsPF;
    private JamaicaClubsPF jamaicaClubsPF;
    private TrinidadAndTobagoClubsPF trinidadAndTobagoClubsPF;
    private VirginIslandUSClubsPF virginIslandsUsClubsPF;
    private ColombiaClubsPF colombiaClubsPF;


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
                this.salvadorClubsPF = new SalvadorClubsPF(driver);
                this.salvadorClubsPF.pickClub(club);

                break;
            case "Guatemala":
                clickGuatemalaPicker();
                this.guatemalaClubsPF = new GuatemalaClubsPF(driver);
                this.guatemalaClubsPF.pickClub(club);
                break;
            case "Honduras":
                clickHondurasPicker();
                this.hondurasClubsPF = new HondurasClubsPF(driver);
                this.hondurasClubsPF.pickClub(club);
                break;
            case "Nicaragua":
                clickNicaraguaPicker();
                this.nicaraguaClubsPF = new NicaraguaClubsPF(driver);
                this.nicaraguaClubsPF.pickClub(club);
                break;
            case "Panamá":
                clickPanamaPicker();
                this.panamaClubsPF = new PanamaClubsPF(driver);
                this.panamaClubsPF.pickClub(club);
                break;
            case "Aruba":
                clickArubaPicker();
                this.arubaClubsPF = new ArubaClubsPF(driver);
                this.arubaClubsPF.pickClub(club);
                break;
            case "Barbados":
                clickBarbadosPicker();
                this.barbadosClubsPF = new BarbadosClubsPF(driver);
                this.barbadosClubsPF.pickClub(club);
                break;
            case "Republica Dominicana":
                clickDominicanRepublicPicker();
                this.dominicanRepublicClubsPF = new RepublicaDominicanaClubsPF(driver);
                this.dominicanRepublicClubsPF.pickClub(club);
                break;
            case "Jamaica":
                clickJamaicaPicker();
                this.jamaicaClubsPF = new JamaicaClubsPF(driver);
                this.jamaicaClubsPF.pickClub(club);
                break;
            case "Trinidad y Tobago":
                clickTrinidadAndTobagoPicker();
                this.trinidadAndTobagoClubsPF = new TrinidadAndTobagoClubsPF(driver);
                this.trinidadAndTobagoClubsPF.pickClub(club);
                break;
            case "Virgin Island US":
                clickVirginIslandsUsPicker();
                this.virginIslandsUsClubsPF = new VirginIslandUSClubsPF(driver);
                this.virginIslandsUsClubsPF.pickClub(club);
                break;
            case "Colombia":
                clickColombiaPicker();
                this.colombiaClubsPF = new ColombiaClubsPF(driver);
                this.colombiaClubsPF.pickClub(club);
                break;
            default:
                System.out.println("Unknown country: " + country);
                break;
        }
    }
}
