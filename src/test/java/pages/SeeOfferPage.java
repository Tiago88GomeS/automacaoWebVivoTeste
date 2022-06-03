package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeeOfferPage extends BasePage {
    public SeeOfferPage(WebDriver driver) {
        super(driver);
    }

    public ProductOfferPage clicarNoBotaoSeeOffer() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("see_offer_btn")).click();
        return new ProductOfferPage(driver);
    }
}

