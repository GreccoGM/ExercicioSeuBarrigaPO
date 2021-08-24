package testes;

import util.Login;
import util.BaseTestes;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteConta extends BaseTestes {

    @Before
        public void setup () {
            Login loginS = new Login();
            loginS.realizarLogin();

            setInteracaoHome();
            setInteracaoAdicionarConta();
            setInteracaoEditarConta();
            setIntListarContas();
            setDadosCadastrados();
   }

    @Test
        public void cadastrarContaSemNome () {
            interacaoHome.clicarMenuLinkCriarConta();

            intAdicConta.salvarConta("");
            String msgRetorno = intAdicConta.getMsgErro();

            Assert.assertEquals("Informe o nome da conta", msgRetorno);
    }

    @Test
        public void cadastrarContaComSucesso () {
            interacaoHome.clicarMenuLinkCriarConta();

            intAdicConta.salvarConta("Conta 2108");
            String msgRetorno = intAdicConta.getMsgSucesso();

            Assert.assertEquals("Conta adicionada com sucesso!", msgRetorno);
    }

    @Test
        public void listarContasCadastradas () {
            interacaoHome.clicarMenuLinkListar();

            Assert.assertFalse(dadosCadastrados.listaComValor("tabelaContas"));
    }

    @Test
        public void sucessoAlteracaoConta(){
            interacaoHome.clicarMenuLinkListar();

            intListarContas.clicarBtnEditar();
            intEditarConta.editarConta(" - Alteração");
            String msgSucessoEdicao = intEditarConta.getMsgSucesso();

            Assert.assertEquals("Conta alterada com sucesso!", msgSucessoEdicao);
    }

    @Test
    public void sucessoExclusaoConta(){
        interacaoHome.clicarMenuLinkListar();
        intListarContas.clicarBtnExcluir();

        String msgSucessoExclusao = intEditarConta.getMsgSucesso();

        Assert.assertEquals("Conta removida com sucesso!", msgSucessoExclusao);
    }

}

