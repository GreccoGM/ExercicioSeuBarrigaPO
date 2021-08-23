package testes;

import dados.Login;
import base.BaseTestes;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import paginas.PaginaMovimentacao;

import java.util.ArrayList;

public class TesteMovimentacao extends BaseTestes {

    private static PaginaMovimentacao pagMovimentacao;
    @Before
        public void login () {
            Login loginS = new Login();
            pagHome = loginS.realizarLogin();
            pagMovimentacao = pagHome.clicarMenuLinkMovimentacao();
    }

    @Test
        public void verificarCamposObrigatorios(){
        String msgs[] = {"Data da Movimentação é obrigatório", "Data do pagamento é obrigatório",
                "Descrição é obrigatório", "Interessado é obrigatório",
                "Valor é obrigatório", "Valor deve ser um número"};
        pagMovimentacao.salvarSemCamposObrigatorios();

        ArrayList<String> teste = pagMovimentacao.pegarMsg();
        String mensagensRetornadas[] = teste.toArray(new String[0]);

        Assert.assertArrayEquals(msgs,mensagensRetornadas);
    }

    @Test
        public void verificarTipoCaracterCampoNumero() {
            pagMovimentacao.salvarCampoValorInvalido();
            String msgRetorno = pagMovimentacao.getMsgErro();

            Assert.assertEquals("Valor deve ser um número", msgRetorno);
    }

    @Test
        public void cadastrarMovimentacaoComSucesso() {
            pagMovimentacao.salvarMovimentacaoSucesso();
            String msgRetorno = pagMovimentacao.getMsgSucesso();
            Assert.assertEquals("Movimentação adicionada com sucesso!", msgRetorno);
    }

}
