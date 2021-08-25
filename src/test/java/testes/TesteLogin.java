package testes;

import org.junit.Before;
import util.BaseTestes;
import util.Login;
import org.junit.Assert;
import org.junit.Test;

public class TesteLogin extends Login {

    @Before
    public void setup(){
        BaseTestes base = new BaseTestes();
        base.setPaginaInicial();
    }

    @Test
    public void loginComSucesso(){
        realizarLogin();
        String elementoHome = pagInicial.getAlert();

        Assert.assertEquals("Home",elementoHome);
    }
}
