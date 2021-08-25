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

            setPaginaInicial();
            setInteracaoAdicionarConta();
            setInteracaoEditarConta();
            setIntListarContas();
            setDadosCadastrados();
   }

    @Test
        public void cadastrarContaSemNome () {
            pagInicial.clicarMenuLinkCriarConta();

            intAdicConta.salvarConta("");
            String msgRetorno = intAdicConta.getMsgErro();

            Assert.assertEquals("Informe o nome da conta", msgRetorno);
    }

    @Test
        public void cadastrarContaComSucesso () {
            pagInicial.clicarMenuLinkCriarConta();

            intAdicConta.salvarConta("Conta 2108");
            String msgRetorno = intAdicConta.getMsgSucesso();

            Assert.assertEquals("Conta adicionada com sucesso!", msgRetorno);
    }

    @Test
        public void listarContasCadastradas () {
            pagInicial.clicarMenuLinkListar();

            Assert.assertFalse(dadosCadastrados.listaComValor("tabelaContas"));
    }

    @Test
        public void sucessoAlteracaoConta(){
            pagInicial.clicarMenuLinkListar();

            intListarContas.clicarBtnEditar();
            intEditarConta.editarConta(" - Alteração");
            String msgSucessoEdicao = intEditarConta.getMsgSucesso();

            Assert.assertEquals("Conta alterada com sucesso!", msgSucessoEdicao);
    }

    @Test
        public void sucessoExclusaoConta(){
            pagInicial.clicarMenuLinkListar();
            intListarContas.clicarBtnExcluir();

            String msgSucessoExclusao = intEditarConta.getMsgSucesso();

            Assert.assertEquals("Conta removida com sucesso!", msgSucessoExclusao);
    }

}

