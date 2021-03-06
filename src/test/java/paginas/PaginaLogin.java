package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaLogin {

    protected WebDriver driver;

    public PaginaLogin(WebDriver driver) {
        this.driver = driver;
    }

    protected By emailUsuario = By.id("email");
    protected By senhaUsuario = By.id("senha");
    protected By login = By.cssSelector("body > div.jumbotron.col-lg-4 > form > button");

    protected WebElement email(){
        return driver.findElement(emailUsuario);
    }

    protected WebElement senha(){
        return driver.findElement(senhaUsuario);
    }

    protected WebElement botaoLogar(){
        return driver.findElement(login);
    }

}
