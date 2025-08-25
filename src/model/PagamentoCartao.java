package model;

import aplicacao.MetodoPagamento;

public class PagamentoCartao implements MetodoPagamento {
    public void pagar(double total) {
        System.out.println("Pagando via Cartão de Crédito... \n Total: R$" + total);
    }

}
