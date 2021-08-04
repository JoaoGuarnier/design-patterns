package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;


    public Orcamento(BigDecimal valor, int qtdItem) {
         this.quantidadeItens = qtdItem;
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens(){
        return quantidadeItens;
    }


}
