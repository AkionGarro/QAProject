package PageFactory.ClubsPF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HondurasClubsPF {

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[1]/div[1]/div[3]/div[1]/button")
    WebElement florenciaPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/button")
    WebElement sanPedroSulaPicker;

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[3]/div[1]/div[3]/div[1]/button")
    WebElement elSaucePicker;


    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement clubPicker;


    WebDriver driver;

    public HondurasClubsPF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickClubPicker() {
        this.clubPicker.click();
    }
    public void clickFlorenciaPicker( ) {
        this.florenciaPicker.click();
    }

    public void clickSanPedroSulaPicker( ) {
        this.sanPedroSulaPicker.click();
    }

    public void clickElSaucePicker( ) {
        this.elSaucePicker.click();
    }

    public void skipPreferedClub(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div/div/div/div/div/div/div[1]/button")));
        WebElement modalAcceptButton = driver.findElement(
                By.xpath("/html/body/form/div/div/div/div/div/div/div[1]/button"));
        modalAcceptButton.click();
    }

    public void pickClub(String club){

        club = club.toLowerCase();
        clickClubPicker();
        switch (club){
            case("florencia"):
                skipPreferedClub();
                break;
            case("san pedro sula"):
                clickSanPedroSulaPicker();
                break;
            case("el sauce"):
                clickElSaucePicker();
                break;
            default:
                System.out.println("Hubo un error, no se encuentra el club");
        }
    }
}
