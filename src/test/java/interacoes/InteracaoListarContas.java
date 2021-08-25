package interacoes;

import org.openqa.selenium.WebDriver;
import paginas.PagListarContas;

public class InteracaoListarContas extends PagListarContas {

    public InteracaoListarContas(WebDriver driver) {
        super(driver);
    }

    public void clicarBtnExcluir(){
        btnEditar().click();
    }

    public void clicarBtnEditar(){
        btnExcluir().click();
    }


}
