package testes;

import dados.Login;
import org.junit.Assert;
import org.junit.Test;
import paginas.PaginaHome;

public class TesteLogin extends Login {

    @Test
    public void loginComSucesso(){

        PaginaHome pagHome = realizarLogin();
        String elementoHome = pagHome.getAlert();

        Assert.assertEquals("Home",elementoHome);
    }
}
