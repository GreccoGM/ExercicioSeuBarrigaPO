package interacoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import paginas.PaginaResumoMensal;

public class InteracaoResumoMensal extends PaginaResumoMensal {

    public InteracaoResumoMensal(WebDriver driver) {
        super(driver);
    }

    public String pegarContaCadastrada (){
        WebElement lista = tabelaLinhas();
        String elementoPosicao = elementoColuna(lista).getText();

        return elementoPosicao;
    }
}
