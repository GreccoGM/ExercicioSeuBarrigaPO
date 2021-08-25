package interacoes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import paginas.PagEditarConta;
import paginas.PagListarContas;

import java.util.concurrent.TimeUnit;

public class InteracaoEditarConta extends PagEditarConta {

    public InteracaoEditarConta(WebDriver driver) {
        super(driver);
    }

    public void editarConta(String conta){
        nomeConta().sendKeys(conta);
        btnSalvar().click();
    }

    public String getMsgSucesso(){
        return getMsg(msgSucesso);
    }



    public String getMsg(By msg)    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return driver.findElement(msg).getText();
    }
}
