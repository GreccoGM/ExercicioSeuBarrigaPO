package interacoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import paginas.PaginaResumoMensal;

public class InteracaoResumoMensal extends PaginaResumoMensal {

    public InteracaoResumoMensal(WebDriver driver) {
        super(driver);
    }

    public String pegarContaCadastrada (){
        WebElement lista = driver.findElement(tabelaLinhas);
        String elementoPosicao = lista.findElement(elementoColuna).getText();

        return elementoPosicao;
    }
}
