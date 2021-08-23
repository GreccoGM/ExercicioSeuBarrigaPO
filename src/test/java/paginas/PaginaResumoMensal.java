package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaResumoMensal{

    private WebDriver driver;

    public PaginaResumoMensal(WebDriver driver) {
        this.driver = driver;
    }

    private By tabelaLinhas = By.cssSelector("#tabelaExtrato > tbody > tr");
    private By elementoColuna = By.cssSelector("td:nth-child(1)"); //pega elemento da primeira linha encontrada (tabela linha) e da primeira coluna

    public String pegarContaCadastrada (){
        WebElement lista = driver.findElement(tabelaLinhas);
        String elementoPosicao = lista.findElement(elementoColuna).getText();

        return elementoPosicao;
    }


}
