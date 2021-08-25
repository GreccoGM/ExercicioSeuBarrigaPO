package testes;

import util.Login;
import util.BaseTestes;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteResumoMensal extends BaseTestes {


    @Before
    public void setup () {
        Login loginS = new Login();
        loginS.realizarLogin();

        setIntResumoMensal();
        setPaginaInicial();
        pagInicial.clicarMenuLinkResumoMensal();
    }

    @Test
    public void verificarResumoMensalMesAtual(){
        Assert.assertFalse(dadosCadastrados.listaComValor("tabelaExtrato"));
    }

    @Test
    public void verificarResumoCadastrado() {
        String movimentacao = intResumoMensal.pegarContaCadastrada();

        Assert.assertEquals("Teste",movimentacao);
    }

}
