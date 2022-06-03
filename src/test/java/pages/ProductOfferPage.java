package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductOfferPage extends BasePage {
    public ProductOfferPage(WebDriver driver) {
        super(driver);
    }

    public ProductOfferPage entaoValidoEspicificacaoDoProduto() {
        String nomeProduto = "HP PAVILION 15Z TOUCH LAPTOP";
        String textoObtido = driver.findElement(By.xpath("//h1[contains(@class,'roboto-regular screen768')]")).getText();
        Assert.assertEquals(nomeProduto, textoObtido);
        System.out.println("Deu certo!");
        return this;
    }

    public ProductOfferPage eEscolhoACorBlackParaOProduto() {
        driver.findElement(By.xpath("(//span[@id='bunny'])[2]")).click();
        return this;
    }

    public ProductOfferPage alteroAQuantidadeDeProdutos(){
        driver.findElement(By.className("plus")).click();
        return this;
    }

    public ProductOfferPage eClicoNoBotaoAddToCart(){
       driver.findElement(By.xpath("//*[@name=\"save_to_cart\"]")).click();
       return this;
    }

    public ProductOfferPage clicoParaRemoverOsProdutosDoCarrinho(){
        driver.findElement(By.xpath("//div[contains(@class,'removeProduct iconCss')]")).click();
        return this;
    }

    public ProductOfferPage validoCarrinhoVazio(){
        driver.findElement(By.id("shoppingCartLink")).click();
        String textoObtidoCarrinhoVario = "Your shopping cart is empty";
        String valorCarrinhoVazio = driver.findElement(By.xpath("//label[@class='roboto-bold ng-scope']")).getText();
        Assert.assertEquals(textoObtidoCarrinhoVario, valorCarrinhoVazio);
        System.out.println("------- Carrinho Está Vazio! ------");
        return this;
    }

    public CheckOutPage entaoClicoParaIrAoCheckout() throws InterruptedException {
        driver.findElement(By.id("checkOutPopUp")).click();
        return new CheckOutPage(driver);
    }

}
