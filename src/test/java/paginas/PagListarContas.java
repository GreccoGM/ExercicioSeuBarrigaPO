package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PagListarContas {
    private WebDriver driver;

    public PagListarContas(WebDriver driver) {
        this.driver = driver;
    }

    private By btnEditar    = By.cssSelector("#tabelaContas > tbody > tr > td > a:nth-child(1)");
    private By btnExcluir   = By.cssSelector("#tabelaContas > tbody > tr:nth-child(4) > td:nth-child(2) > a:nth-child(2)");

    public PagEditarConta clicarBtnExcluir(){
        driver.findElement(btnExcluir).click();
        return new PagEditarConta(driver);
    }

    public PagEditarConta clicarBtnEditar(){
        driver.findElement(btnEditar).click();
        return new PagEditarConta(driver);
    }






}
