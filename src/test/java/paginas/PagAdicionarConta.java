package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PagAdicionarConta {

    private WebDriver driver;

    public PagAdicionarConta(WebDriver driver) {
            this.driver = driver;
    }

    private By nomeConta = By.id("nome");
    private By salvar    = By.className("btn-group");
    private By msgErro   = By.cssSelector("body > div.alert.alert-danger");
    private By msgSucesso = By.cssSelector("body > div.alert.alert-success");


    public void salvarConta(String conta){
        driver.findElement(nomeConta).sendKeys(conta);
        driver.findElement(salvar).click();
    }

    public String getMsgErro(){
        return getMsg(msgErro);
    }

    public String getMsgSucesso(){
        return getMsg(msgSucesso);
    }

    public String getMsg(By msg) {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return driver.findElement(msg).getText();
    }

}
