package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PagEditarConta {

    private WebDriver driver;

    public PagEditarConta(WebDriver driver) {
        this.driver = driver;
    }

    private By nomeConta = By.id("nome");
    private By salvar    = By.className("btn-group");
    private By msgSucesso = By.cssSelector("body > div.alert.alert-success");


    public PagListarContas editarConta(String conta){
        driver.findElement(nomeConta).sendKeys(conta);
        driver.findElement(salvar).click();

        return new PagListarContas(driver);
    }

    public String getMsgSucessoEdicao(){
        return getMsg(msgSucesso);
    }

    public String getMsg(By msg)    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return driver.findElement(msg).getText();
    }
}
