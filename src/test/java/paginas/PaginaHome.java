package paginas;

import interacoes.InteracaoHome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PaginaHome {
    protected WebDriver driver;

    public PaginaHome(WebDriver driver) {
        this.driver = driver;
    }

    protected By paginaInicialLinkHome = By.linkText("Home");
    protected By menuContas = By.linkText("Contas");
    protected By contasAdicionar = By.linkText("Adicionar");
    protected By contasListar = By.linkText("Listar");
    protected By criarMovimentacao = By.linkText("Criar Movimentação");
    protected By resumoMensal = By.linkText("Resumo Mensal");

}
