package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaLogin {

    private WebDriver driver;

    public PaginaLogin(WebDriver driver) {
        this.driver = driver;
    }

    private By emailUsuario = By.id("email");
    private By senhaUsuario = By.id("senha");
    private By login = By.cssSelector("body > div.jumbotron.col-lg-4 > form > button");


    public void setNomeUsuario(String nome){
        driver.findElement(emailUsuario).sendKeys(nome);
    }

    public void setSenha(String senha){
        driver.findElement(senhaUsuario).sendKeys(senha);
    }

    public PaginaHome clicarBotaoLogin(){
        driver.findElement(login).click();
        return new PaginaHome(driver);
    }
}
