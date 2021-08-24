package interacoes;

import org.openqa.selenium.WebDriver;
import paginas.*;

import java.util.concurrent.TimeUnit;

public class InteracaoHome extends PaginaHome{

    public InteracaoHome(WebDriver driver) {
        super(driver);
    }

    public void clicarMenuLinkListar(){
        driver.findElement(menuContas).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(contasListar).click();
        //return new PagListarContas(driver);
    }

    public void clicarMenuLinkCriarConta(){
        driver.findElement(menuContas).click();
        driver.findElement(contasAdicionar).click();
        //return new PagAdicionarConta(driver);
    }

    public void clicarMenuLinkMovimentacao(){
        driver.findElement(criarMovimentacao).click();
        //return new PaginaMovimentacao(driver);
    }

    public void clicarMenuLinkResumoMensal(){
        driver.findElement(resumoMensal).click();
        //return new PaginaResumoMensal(driver);
    }

    public String getAlert(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return driver.findElement(paginaInicialLinkHome).getText();
    }
}
