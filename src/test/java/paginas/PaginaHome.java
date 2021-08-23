package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PaginaHome {
    private WebDriver driver;

    public PaginaHome(WebDriver driver) {
        this.driver = driver;
    }

    private By paginaInicialLinkHome = By.linkText("Home");
    private By menuContas = By.linkText("Contas");
    private By contasAdicionar = By.linkText("Adicionar");
    private By contasListar = By.linkText("Listar");
    private By criarMovimentacao = By.linkText("Criar Movimentação");
    private By resumoMensal = By.linkText("Resumo Mensal");

    public PagListarContas clicarMenuLinkListar(){
        driver.findElement(menuContas).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(contasListar).click();
        return new PagListarContas(driver);
    }

    public PagAdicionarConta clicarMenuLinkCriarConta(){
        driver.findElement(menuContas).click();
        driver.findElement(contasAdicionar).click();
        return new PagAdicionarConta(driver);
    }

    public PaginaMovimentacao clicarMenuLinkMovimentacao(){
        driver.findElement(criarMovimentacao).click();
        return new PaginaMovimentacao(driver);
    }

    public PaginaResumoMensal clicarMenuLinkResumoMensal(){
        driver.findElement(resumoMensal).click();
        return new PaginaResumoMensal(driver);
    }

    public String getAlert(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return driver.findElement(paginaInicialLinkHome).getText();
    }

}
