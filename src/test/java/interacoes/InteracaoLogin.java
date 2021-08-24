package interacoes;

import org.openqa.selenium.WebDriver;
import paginas.PaginaHome;
import paginas.PaginaLogin;

public class InteracaoLogin extends PaginaLogin {

    public InteracaoLogin(WebDriver driver) {
        super(driver);
    }

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
