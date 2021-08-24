package testes;

import util.Login;
import util.BaseTestes;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TesteMovimentacao extends BaseTestes {

    @Before
        public void setup () {
            Login loginS = new Login();
            loginS.realizarLogin();

            setInteracaoHome();
            setIntMovimentacao();
            interacaoHome.clicarMenuLinkMovimentacao();
    }

    @Test
        public void verificarCamposObrigatorios(){
        String msgs[] = {"Data da Movimentação é obrigatório", "Data do pagamento é obrigatório",
                "Descrição é obrigatório", "Interessado é obrigatório",
                "Valor é obrigatório", "Valor deve ser um número"};
        intMovimentacao.salvarSemCamposObrigatorios();

        ArrayList<String> teste = intMovimentacao.pegarMsg();
        String mensagensRetornadas[] = teste.toArray(new String[0]);

        Assert.assertArrayEquals(msgs,mensagensRetornadas);
    }

    @Test
        public void verificarTipoCaracterCampoNumero() {
            intMovimentacao.salvarCampoValorInvalido();
            String msgRetorno = intMovimentacao.getMsgErro();

            Assert.assertEquals("Valor deve ser um número", msgRetorno);
    }

    @Test
        public void cadastrarMovimentacaoComSucesso() {
            intMovimentacao.salvarMovimentacaoSucesso();
            String msgRetorno = intMovimentacao.getMsgSucesso();
            Assert.assertEquals("Movimentação adicionada com sucesso!", msgRetorno);
    }

}
