package tests;

import evidencia.Generator;
import evidencia.Screenshot;
import executaDriver.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

import java.io.IOException;

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
    public void testQueroValidarEspecificacaoDoProduto() throws InterruptedException, IOException {
        new HomePage(driver)
                .clicarEmSpecialOffer()
                .clicarNoBotaoSeeOffer()
                .entaoValidoEspicificacaoDoProduto();

        Screenshot.takeScreenshot(driver,"C:\\Users\\user\\test-report\\ " +
                Generator.geracaoDataHoraParaArquivo() + test.getMethodName() + ".png");
    }

    @Test
    public void testParaValidarAlteracaoDeCorDoProdutoNoCarrinho() throws InterruptedException, IOException {
        new HomePage(driver)
                .clicarEmSpecialOffer()
                .clicarNoBotaoSeeOffer()
                .entaoValidoEspicificacaoDoProduto()
                .eEscolhoACorBlackParaOProduto()
                .eClicoNoBotaoAddToCart()
                .entaoClicoParaIrAoCheckout()
                .validoProdutoNaCorBlack();

        Screenshot.takeScreenshot(driver,"C:\\Users\\user\\test-report\\ " +
                Generator.geracaoDataHoraParaArquivo() + test.getMethodName() + ".png");
    }

    @Test
    public void testParaValidarPaginaDeCheckOut() throws InterruptedException, IOException {
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

        Screenshot.takeScreenshot(driver,"C:\\Users\\user\\test-report\\ " +
                Generator.geracaoDataHoraParaArquivo() + test.getMethodName() + ".png");
    }

    @Test
    public void testRemoverOsProdutosDoCarrinho() throws InterruptedException, IOException {
        new HomePage(driver)
                .clicarEmSpecialOffer()
                .clicarNoBotaoSeeOffer()
                .entaoValidoEspicificacaoDoProduto()
                .eEscolhoACorBlackParaOProduto()
                .alteroAQuantidadeDeProdutos()
                .eClicoNoBotaoAddToCart()
                .clicoParaRemoverOsProdutosDoCarrinho()
                .validoCarrinhoVazio();

        Screenshot.takeScreenshot(driver,"C:\\Users\\user\\test-report\\ " +
                Generator.geracaoDataHoraParaArquivo() + test.getMethodName() + ".png");
    }
    @After
    public void tearDown() {
        driver.close();
    }
}
