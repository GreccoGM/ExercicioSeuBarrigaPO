package interacoes;

import org.openqa.selenium.WebDriver;
import paginas.PaginaLogin;

public class InteracaoLogin extends PaginaLogin {

    public InteracaoLogin(WebDriver driver) {
        super(driver);
    }

    public void setNomeUsuario(String nome){
        email().sendKeys(nome);
    }

    public void setSenha(String senha){
        senha().sendKeys(senha);
    }

    public void clicarBotaoLogin(){
        botaoLogar().click();
    }
}
