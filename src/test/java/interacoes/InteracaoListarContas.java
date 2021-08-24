package interacoes;

import org.openqa.selenium.WebDriver;
import paginas.PagEditarConta;
import paginas.PagListarContas;

public class InteracaoListarContas extends PagListarContas {

    public InteracaoListarContas(WebDriver driver) {
        super(driver);
    }

    public PagEditarConta clicarBtnExcluir(){
        driver.findElement(btnExcluir).click();
        return new PagEditarConta(driver);
    }

    public PagEditarConta clicarBtnEditar(){
        driver.findElement(btnEditar).click();
        return new PagEditarConta(driver);
    }


}
