package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaMovimentacao {

    protected WebDriver driver;

    public PaginaMovimentacao(WebDriver driver) {
        this.driver = driver;
    }

    protected By descricao     = By.id("descricao");
    protected By dataPagamento = By.id("data_pagamento");
    protected By dataTransacao = By.id("data_transacao");
    protected By interessado   = By.id("interessado");
    protected By valor         = By.id("valor");
    protected By tipo          = By.id("tipo");
    protected By conta         = By.id("conta");
    protected By situacaoPago  = By.id("status_pago");
    protected By situacaoPendente  = By.id("status_pendente");
    protected By salvar        = By.className("btn-group");
    protected By msgErro       = By.cssSelector("body > div.alert.alert-danger");
    protected By msgSucesso    = By.cssSelector("body > div.alert.alert-success");

    protected WebElement descricao(){
        return driver.findElement(descricao);
    }
    protected WebElement dtPagamento(){
        return driver.findElement(dataPagamento);
    }
    protected WebElement dtTransacao(){
        return driver.findElement(dataTransacao);
    }
    protected WebElement interessado(){
        return driver.findElement(interessado);
    }
    protected WebElement valor(){
        return driver.findElement(valor);
    }
    protected WebElement tipo(){
        return driver.findElement(tipo);
    }
    protected WebElement conta(){
        return driver.findElement(conta);
    }

    protected WebElement situacaoPago(){
        return driver.findElement(situacaoPago);
    }
    protected WebElement situacaoPendente(){
        return driver.findElement(situacaoPendente);
    }

    protected WebElement msgErro(){
        return driver.findElement(msgErro);
    }

    protected WebElement msgSucesso(){
        return driver.findElement(msgSucesso);
    }


    protected WebElement btnSalvar(){
        return driver.findElement(salvar);
    }


}
