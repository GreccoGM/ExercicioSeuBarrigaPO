package testes;

import dados.Login;
import base.BaseTestes;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import paginas.PagAdicionarConta;
import paginas.PagEditarConta;
import paginas.PagListarContas;

public class TesteConta extends BaseTestes {

    @Before
        public void login () {
            Login loginS = new Login();
            pagHome = loginS.realizarLogin();
    }

    @Test
        public void cadastrarContaSemNome () {
            PagAdicionarConta pagAdicionarConta = pagHome.clicarMenuLinkCriarConta();

            pagAdicionarConta.salvarConta("");
            String msgRetorno = pagAdicionarConta.getMsgErro();

            Assert.assertEquals("Informe o nome da conta", msgRetorno);
    }

    @Test
        public void cadastrarContaComSucesso () {
            PagAdicionarConta pagAdicionarConta = pagHome.clicarMenuLinkCriarConta();

            pagAdicionarConta.salvarConta("Conta 2108");
            String msgRetorno = pagAdicionarConta.getMsgSucesso();

            Assert.assertEquals("Conta adicionada com sucesso!", msgRetorno);
    }

    @Test
        public void listarContasCadastradas () {
            pagHome.clicarMenuLinkListar();

            Assert.assertFalse(dadosCadastrados.listaComValor("tabelaContas"));
    }

    @Test
        public void sucessoAlteracaoConta(){
        PagListarContas pagListarContas = pagHome.clicarMenuLinkListar();

        PagEditarConta pagEditar = pagListarContas.clicarBtnEditar();
        pagEditar.editarConta(" - Alteração");
        String msgSucessoEdicao = pagEditar.getMsgSucessoEdicao();

        Assert.assertEquals("Conta alterada com sucesso!", msgSucessoEdicao);
    }

    @Test
    public void sucessoExclusaoConta(){
        PagListarContas pagListarContas = pagHome.clicarMenuLinkListar();

        PagEditarConta pagEditar = pagListarContas.clicarBtnExcluir();

        String msgSucessoExclusao = pagEditar.getMsgSucessoEdicao();

        Assert.assertEquals("Conta removida com sucesso!", msgSucessoExclusao);
    }

}

