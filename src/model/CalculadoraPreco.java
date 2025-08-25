package model;

public class CalculadoraPreco {

    public double calcularTotal(double[] precos, int[] quantidades) {
        double total = 0;
        for (int i = 0; i < precos.length; i++) {
            total += precos[i] * quantidades[i];
        }
        return total;
    }

    public double aplicarDesconto(double total, boolean isEstudante) {
        if (isEstudante) {
            total = total * 0.95;
        }
        return total;
    }
}

