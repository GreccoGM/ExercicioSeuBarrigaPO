package dados;

import base.BaseTestes;
import paginas.PaginaHome;

public class Login extends BaseTestes {

    public PaginaHome realizarLogin(){
        pagLogin.setNomeUsuario("testeemail@email.com");
        pagLogin.setSenha("123456");

        return pagLogin.clicarBotaoLogin();
    }
}
