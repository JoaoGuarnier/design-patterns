package br.com.alura.loja.testes;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("200"),6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"),1);
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.println(calculadora.calcular(orcamento));
        System.out.println(calculadora.calcular(orcamento2));

    }
}










