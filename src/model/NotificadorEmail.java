package model;

import aplicacao.Notificador;

public class NotificadorEmail implements Notificador {
    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}