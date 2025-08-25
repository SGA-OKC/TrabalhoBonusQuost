package model;

import aplicacao.MetodoPagamento;

public class PagamentoPix implements MetodoPagamento {
    public void pagar(double total) {
        System.out.println("-----------------------------------------");
        System.out.println("Pagando via PIX, valor Total: R$" + total);
        System.out.println("-----------------------------------------");
        System.out.println("Pagando via Cartão de Crédito, valor Total: R$" + total);
        System.out.println("-----------------------------------------");
    }
}