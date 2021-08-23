package testes;

import dados.Login;
import base.BaseTestes;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import paginas.PaginaResumoMensal;

public class TesteResumoMensal extends BaseTestes {

    private static PaginaResumoMensal pagResumoMensal;

    @Before
    public void login () {
        Login loginS = new Login();
        pagHome = loginS.realizarLogin();
        pagResumoMensal = pagHome.clicarMenuLinkResumoMensal();
    }

    @Test
    public void verificarResumoMensalMesAtual(){
        Assert.assertFalse(dadosCadastrados.listaComValor("tabelaExtrato"));
    }

    @Test
    public void verificarResumoCadastrado() {
        String movimentacao= pagResumoMensal.pegarContaCadastrada();

        Assert.assertEquals("Teste",movimentacao);
    }

}
