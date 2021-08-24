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
        base.setInteracaoHome();
    }
    @Test
    public void loginComSucesso(){

        realizarLogin();
        String elementoHome = interacaoHome.getAlert();

        Assert.assertEquals("Home",elementoHome);
    }
}
