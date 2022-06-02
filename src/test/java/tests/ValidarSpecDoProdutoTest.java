package tests;

import executaDriver.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;

public class ValidarSpecDoProdutoTest {
    WebDriver driver;
    Driver webDriver;

    @Rule
    public TestName test = new TestName();

    @Before
    public void setUp() {
        webDriver = new Driver("chrome");
        driver = webDriver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://advantageonlineshopping.com");
    }

    @Test
    public void testQueroValidarEspecificacaoDoProduto(){

    }
    @After
    public void tearDown() {
        driver.close();
    }
}
