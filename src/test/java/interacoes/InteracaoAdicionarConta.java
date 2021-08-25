package interacoes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import paginas.PagAdicionarConta;

import java.util.concurrent.TimeUnit;

public class InteracaoAdicionarConta extends PagAdicionarConta {

    public InteracaoAdicionarConta(WebDriver driver) {
        super(driver);
    }

    public void salvarConta(String conta){
        nomeConta().sendKeys(conta);
        btnSalvar().click();
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
