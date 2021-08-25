package util;

import interacoes.*;
import org.junit.After;
import org.junit.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import util.navegacao.PaginaInicial;

public class BaseTestes {

    private static WebDriver driver;
    protected static DadosCadastrados dadosCadastrados;

    protected static InteracaoLogin intLogin;
    protected static PaginaInicial pagInicial;
    protected static InteracaoAdicionarConta intAdicConta;
    protected static InteracaoEditarConta intEditarConta;
    protected static InteracaoMovimentacao intMovimentacao;
    protected static InteracaoResumoMensal intResumoMensal;
    protected static InteracaoListarContas intListarContas;


    @Before
    public void inicializarDriver() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://seubarriga.wcaquino.me/");
        intLogin = new InteracaoLogin(driver);
    }

    public void setDadosCadastrados(){
        dadosCadastrados  = new DadosCadastrados(driver);
    }
    public void setPaginaInicial(){
        pagInicial = new PaginaInicial(driver);
    }
    public void setInteracaoAdicionarConta(){
        intAdicConta = new InteracaoAdicionarConta(driver);
    }
    public void setInteracaoEditarConta(){
        intEditarConta = new InteracaoEditarConta(driver);
    }
    public void setIntMovimentacao(){
        intMovimentacao = new InteracaoMovimentacao(driver);
    }
    public void setIntResumoMensal(){
        intResumoMensal = new InteracaoResumoMensal(driver);
    }
    public void setIntListarContas(){
        intListarContas = new InteracaoListarContas(driver);
    }

    @After
    public void finalizarDriver(){
        driver.quit();
    }






}
