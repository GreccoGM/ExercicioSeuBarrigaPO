package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class PagEditarConta {

    protected WebDriver driver;

    public PagEditarConta(WebDriver driver) {
        this.driver = driver;
    }

    protected By nomeConta = By.id("nome");
    protected By salvar    = By.className("btn-group");
    protected By msgSucesso = By.cssSelector("body > div.alert.alert-success");

    protected WebElement nomeConta(){
        return driver.findElement(nomeConta);
    }

    protected WebElement btnSalvar(){
        return driver.findElement(salvar);
    }

//    protected WebElement getMsg(By msg){
//        return driver.findElement(msg);
//    }




}
