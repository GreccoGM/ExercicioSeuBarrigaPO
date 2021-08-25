package util;

public class Login extends BaseTestes {

    public void realizarLogin(){
        intLogin.setNomeUsuario("testeemail@email.com");
        intLogin.setSenha("123456");

        intLogin.clicarBotaoLogin();
    }
}
