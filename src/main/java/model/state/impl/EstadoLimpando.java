package model.state.impl;

import model.Quarto;
import model.state.EstadoQuarto;

/**
 * Implementação do estado Limpando.
 */
public class EstadoLimpando implements EstadoQuarto {
    @Override
    public void proximaEstado(Quarto quarto) {
        quarto.setEstadoAtual(new EstadoDisponivel());
    }

    @Override
    public String getEstado() {
        return "Limpando";
    }
}