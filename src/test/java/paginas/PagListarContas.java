package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PagListarContas {
    protected WebDriver driver;

    public PagListarContas(WebDriver driver) {
        this.driver = driver;
    }

    protected By btnEditar    = By.cssSelector("#tabelaContas > tbody > tr > td > a:nth-child(1)");
    protected By btnExcluir   = By.cssSelector("#tabelaContas > tbody > tr:nth-child(4) > td:nth-child(2) > a:nth-child(2)");

}
