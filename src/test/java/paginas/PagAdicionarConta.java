package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PagAdicionarConta {

    protected WebDriver driver;

    public PagAdicionarConta(WebDriver driver) {
            this.driver = driver;
    }

    protected By nomeConta = By.id("nome");
    protected By salvar    = By.className("btn-group");
    protected By msgErro   = By.cssSelector("body > div.alert.alert-danger");
    protected By msgSucesso = By.cssSelector("body > div.alert.alert-success");


}
