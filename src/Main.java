import aplicacao.MetodoPagamento;
import model.CalculadoraPreco;
import model.PagamentoPix;
import model.ServicoDeCheckout;

public class Main {
    public static void main(String[] args) {

        double[] precos = {100.0, 150.0};
        int[] quantidades = {1, 2};
        boolean isEstudante = true;

        CalculadoraPreco calculadora = new CalculadoraPreco();
        MetodoPagamento metodoPagamento = new PagamentoPix();

        ServicoDeCheckout checkout = new ServicoDeCheckout(metodoPagamento, calculadora);
        checkout.finalizarCompra(precos, quantidades, isEstudante);

    }
}
