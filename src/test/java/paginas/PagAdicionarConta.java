package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PagAdicionarConta {

    protected WebDriver driver;

    public PagAdicionarConta(WebDriver driver) {
            this.driver = driver;
    }

    protected By nomeConta = By.id("nome");
    protected By salvar    = By.className("btn-group");
    protected By msgErro   = By.cssSelector("body > div.alert.alert-danger");
    protected By msgSucesso = By.cssSelector("body > div.alert.alert-success");

    protected WebElement nomeConta(){
        return driver.findElement(nomeConta);
    }

    protected WebElement btnSalvar(){
        return driver.findElement(salvar);
    }

    protected WebElement msgErro(){
        return driver.findElement(msgErro);
    }

    protected WebElement msgSucesso(){
        return driver.findElement(msgSucesso);
    }






}
