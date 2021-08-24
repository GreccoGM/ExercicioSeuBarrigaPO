package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PagEditarConta {

    protected WebDriver driver;

    public PagEditarConta(WebDriver driver) {
        this.driver = driver;
    }

    protected By nomeConta = By.id("nome");
    protected By salvar    = By.className("btn-group");
    protected By msgSucesso = By.cssSelector("body > div.alert.alert-success");

}
