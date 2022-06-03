package tests;

import executaDriver.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class ValidarSpecDoProdutoTest {
    WebDriver driver;
    Driver webDriver;

    @Rule
    public TestName test = new TestName();

    @Before
    public void setUp() throws InterruptedException {
        webDriver = new Driver("chrome");
        driver = webDriver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://advantageonlineshopping.com");
        Thread.sleep(5000);
    }

    @Test
    public void testQueroValidarEspecificacaoDoProduto() throws InterruptedException {
        new HomePage(driver)
                .clicarEmSpecialOffer()
                .clicarNoBotaoSeeOffer()
                .entaoValidoEspicificacaoDoProduto();
    }

    @Test
    public void testParaValidarAlteracaoDeCorDoProdutoNoCarrinho() throws InterruptedException {
        new HomePage(driver)
                .clicarEmSpecialOffer()
                .clicarNoBotaoSeeOffer()
                .entaoValidoEspicificacaoDoProduto()
                .eEscolhoACorBlackParaOProduto()
                .eClicoNoBotaoAddToCart()
                .entaoClicoParaIrAoCheckout()
                .validoProdutoNaCorBlack();
    }

    @Test
    public void testParaValidarPaginaDeCheckOut() throws InterruptedException {
        new HomePage(driver)
                .clicarEmSpecialOffer()
                .clicarNoBotaoSeeOffer()
                .entaoValidoEspicificacaoDoProduto()
                .eEscolhoACorBlackParaOProduto()
                .alteroAQuantidadeDeProdutos()
                .eClicoNoBotaoAddToCart()
                .entaoClicoParaIrAoCheckout()
                .validoProdutoNaCorBlack()
                .validoValorNaCompraDeDoisProdutos();
    }
    @After
    public void tearDown() {
        driver.close();
    }
}
