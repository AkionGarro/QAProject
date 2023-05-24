package PageFactory.ClubsPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BarbadosClubsPF {

    @FindBy(xpath = "/html/body/form/div/div/div/div/div/div/div[2]/div/div[1]/div[1]/div[3]/div[1]/button")
    WebElement StMichaelsPicker;


    @FindBy(xpath = "/html/body/section/section/nav/section/div/div/div[4]/ul[1]/li/div/button")
    WebElement clubPicker;


    WebDriver driver;

    public BarbadosClubsPF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickClubPicker() {
        this.clubPicker.click();
    }
    public void clickStMichaelsPicker( ) {
        this.StMichaelsPicker.click();
    }



    public void pickClub(String club){

        club = club.toLowerCase();
        clickClubPicker();
        switch (club){
            case("st. michaels"):
                clickStMichaelsPicker();
                break;

            default:
                System.out.println("Hubo un error, no se encuentra el club");
        }
    }
}
