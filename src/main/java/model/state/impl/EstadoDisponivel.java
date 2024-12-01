package model.state.impl;

import model.Quarto;
import model.state.EstadoQuarto;

/**
 * Implementação do estado Disponível.
 */
public class EstadoDisponivel implements EstadoQuarto {
    @Override
    public void proximaEstado(Quarto quarto) {
        quarto.setEstadoAtual(new EstadoReservado());
    }

    @Override
    public String getEstado() {
        return "Disponível";
    }
}