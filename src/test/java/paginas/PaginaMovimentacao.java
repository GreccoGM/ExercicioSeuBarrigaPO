package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PaginaMovimentacao {

    private WebDriver driver;

    public PaginaMovimentacao(WebDriver driver) {
        this.driver = driver;
    }

    private By descricao     = By.id("descricao");
    private By dataPagamento = By.id("data_pagamento");
    private By dataTransacao = By.id("data_transacao");
    private By interessado   = By.id("interessado");
    private By valor         = By.id("valor");
    private By tipo          = By.id("tipo");
    private By conta         = By.id("conta");
    private By situacaoPago  = By.id("status_pago");
    private By situacaoPendente  = By.id("status_pendente");
    private By salvar        = By.className("btn-group");
    private By msgErro   = By.cssSelector("body > div.alert.alert-danger");
    private By msgSucesso = By.cssSelector("body > div.alert.alert-success");


    public void salvarSemCamposObrigatorios(){
        salvarMovimentacao();
    }

    public void salvarCampoValorInvalido(){
        setDescricao("Teste");
        setDataPagamento("12/08/2021");
        setDataTransacao("21/08/2021");
        setInteressado("Antonio");
        setValor("Mil e quinhentos");
        setConta("Conta 2109");
        setTipo("Receita");
        setSituacaoPendente();
        salvarMovimentacao();
    }

    public void salvarMovimentacaoSucesso(){
        setDescricao("Teste");
        setDataPagamento("12/08/2021");
        setDataTransacao("21/08/2021");
        setInteressado("Antonio");
        setValor("25600");
        setConta("Conta 2109");
        setTipo("Despesa");
        setSituacaoPago();
        salvarMovimentacao();
    }

    public void salvarMovimentacao(){
        driver.findElement(salvar).click();
    }

    public String getMsg(By msg)    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return driver.findElement(msg).getText();
    }

    public String getMsgErro(){
        return getMsg(msgErro);
    }

    public String getMsgSucesso(){
        return getMsg(msgSucesso);
    }

    private void setDescricao(String descricaoP){
        driver.findElement(descricao).sendKeys(descricaoP);
    }
    private void setDataPagamento(String dataPagamentoP){
        driver.findElement(dataPagamento).sendKeys(dataPagamentoP);
    }
    private void setDataTransacao(String dataTransacaoP){
        driver.findElement(dataTransacao).sendKeys(dataTransacaoP);
    }
    private void setInteressado(String interessadoP){
        driver.findElement(interessado).sendKeys(interessadoP);
    }
    private void setValor(String valorP){
        driver.findElement(valor).sendKeys(valorP);
    }
    private void setConta(String contaP){
        WebElement element = driver.findElement(conta);
        Select combo = new Select(element);
        combo.selectByVisibleText(contaP);
    }

    private void setTipo(String tipoP){
        WebElement element = driver.findElement(tipo);
        Select combo = new Select(element);
        combo.selectByVisibleText(tipoP);
    }

    private void setSituacaoPago(){
        driver.findElement(situacaoPago).click();
    }

    private void setSituacaoPendente(){
        driver.findElement(situacaoPendente).click();
    }

    public ArrayList<String> pegarMsg (){
        ArrayList<String> listaErros = new ArrayList<>();

        WebElement lista = driver.findElement(msgErro);
        List<WebElement> listaRows = lista.findElements(By.tagName("li"));

        for(WebElement li: listaRows) {
            listaErros.add(li.getText());
            //System.out.println(listaErros);
        }

        return listaErros;
    }








}
