package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaResumoMensal{

    protected WebDriver driver;

    public PaginaResumoMensal(WebDriver driver) {
        this.driver = driver;
    }

    protected By tabelaLinhas = By.cssSelector("#tabelaExtrato > tbody > tr");
    protected By elementoColuna = By.cssSelector("td:nth-child(1)"); //pega elemento da primeira linha encontrada (tabela linha) e da primeira coluna




}
