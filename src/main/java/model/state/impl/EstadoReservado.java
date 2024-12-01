package model.state.impl;

import model.Quarto;
import model.state.EstadoQuarto;

/**
 * Implementação do estado Reservado.
 */
public class EstadoReservado implements EstadoQuarto {
    @Override
    public void proximaEstado(Quarto quarto) {
        quarto.setEstadoAtual(new EstadoAguardandoLimpeza());
    }

    @Override
    public String getEstado() {
        return "Reservado";
    }
}