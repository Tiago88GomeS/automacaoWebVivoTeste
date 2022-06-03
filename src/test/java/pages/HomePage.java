package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage extends BasePage{
        public HomePage(WebDriver driver) {
        super(driver);

    }

    public SeeOfferPage clicarEmSpecialOffer() throws InterruptedException {
       Thread.sleep(2000);
        driver.findElement(By.linkText("SPECIAL OFFER")).click();
        return new SeeOfferPage(driver);
    }
}
