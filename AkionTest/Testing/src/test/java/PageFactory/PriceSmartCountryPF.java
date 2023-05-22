package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceSmartCountryPF {

    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement costaRicaPicker;

    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement salvadorPicker;

    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement guatemalaPicker;

    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement hondurasPicker;

    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement nicaraguaPicker;

    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement panamaicker;

    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement arubaPicker;

    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement barbadosPicker;

    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement domincanRepublicPicker;

    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement jamaicaPicker;

    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement trinidadAndTobagoPicker;

    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement virginIslandsUsPicker;

    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement colombiaPicker;

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

    public void clickPanamaicker( ) {
        this.panamaicker.click();
    }

    public void clickArubaPicker( ) {
        this.arubaPicker.click();
    }

    public void clickBarbadosPicker( ) {
        this.barbadosPicker.click();
    }

    public void clickDomincanRepublicPicker( ) {
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
}
