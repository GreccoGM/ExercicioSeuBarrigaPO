package util;

import paginas.PaginaHome;

public class Login extends BaseTestes {


    public PaginaHome realizarLogin(){
        intLogin.setNomeUsuario("testeemail@email.com");
        intLogin.setSenha("123456");

        return intLogin.clicarBotaoLogin();
    }
}
