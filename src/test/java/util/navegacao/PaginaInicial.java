package util.navegacao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.BaseTestes;

import java.util.concurrent.TimeUnit;

public class PaginaInicial extends BaseTestes {
    protected WebDriver driver;

    public PaginaInicial(WebDriver driver) {
        this.driver = driver;
    }

    protected By paginaInicialLinkHome = By.linkText("Home");
    protected By menuContas = By.linkText("Contas");
    protected By contasAdicionar = By.linkText("Adicionar");
    protected By contasListar = By.linkText("Listar");
    protected By criarMovimentacao = By.linkText("Criar Movimentação");
    protected By resumoMensal = By.linkText("Resumo Mensal");


    public void clicarMenuLinkListar(){
        driver.findElement(menuContas).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(contasListar).click();
    }

    public void clicarMenuLinkCriarConta(){
        driver.findElement(menuContas).click();
        driver.findElement(contasAdicionar).click();
    }

    public void clicarMenuLinkMovimentacao(){
        driver.findElement(criarMovimentacao).click();
    }

    public void clicarMenuLinkResumoMensal(){
        driver.findElement(resumoMensal).click();
    }

    public String getAlert(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return driver.findElement(paginaInicialLinkHome).getText();
    }

}
