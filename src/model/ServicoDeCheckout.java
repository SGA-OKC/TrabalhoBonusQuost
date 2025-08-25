package model;

import aplicacao.MetodoPagamento;

public class ServicoDeCheckout {
    private MetodoPagamento metodoPagamento;
    private CalculadoraPreco calculadoraPreco;

    public ServicoDeCheckout(MetodoPagamento metodoPagamento, CalculadoraPreco calculadoraPreco) {
        this.metodoPagamento = metodoPagamento;
        this.calculadoraPreco = calculadoraPreco;
    }

    public void finalizarCompra(double[] precos, int[] quantidades, boolean isEstudante) {
        double total = calculadoraPreco.calcularTotal(precos, quantidades);
        total = calculadoraPreco.aplicarDesconto(total, isEstudante);

        metodoPagamento.pagar(total);
    }
}
