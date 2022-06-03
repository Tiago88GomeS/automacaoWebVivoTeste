package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage extends BasePage {
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    public CheckOutPage validoProdutoNaCorBlack(){
        String black = "BLACK";
        String textoObtidoCarrinho = driver.findElement(By.xpath("(//span[text()='BLACK'])[2]")).getText();
        Assert.assertEquals(black, textoObtidoCarrinho);
        System.out.println("------- A Cor Escolhida Para O Meu Produto Foi BLACK! -------");
        return this;
    }

    public CheckOutPage validoValorNaCompraDeDoisProdutos(){
        String valorDosProdutos = "$899.98";
        String valorObtido = driver.findElement(By.xpath("//span[contains(@class,'roboto-medium totalValue')]")).getText();
        Assert.assertEquals(valorDosProdutos, valorObtido);
        System.out.println("------- O Valor Total É De: $899.98 -------");
        return this;
    }


}
