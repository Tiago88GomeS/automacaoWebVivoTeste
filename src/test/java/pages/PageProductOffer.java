package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageProductOffer extends BasePage {
    public PageProductOffer(WebDriver driver) {
        super(driver);
    }

    public PageProductOffer entaoValidoEspicificacaoDoProduto(){
        String nomeProduto =  "HP PAVILION 15Z TOUCH LAPTOP";
        String textoObtido = driver.findElement(By.xpath("//h1[contains(@class,'roboto-regular screen768')]")).getText();
        Assert.assertEquals(nomeProduto, textoObtido);
        System.out.println("Deu certo!");
        return this;
    }

}
