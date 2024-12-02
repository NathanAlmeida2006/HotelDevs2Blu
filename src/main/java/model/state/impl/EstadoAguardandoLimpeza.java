package model.state.impl;

import model.Quarto;
import model.state.EstadoQuarto;

/**
 * Implementação do estado Aguardando Limpeza.
 */
public class EstadoAguardandoLimpeza implements EstadoQuarto {
    @Override
    public void proximaEstado(Quarto quarto) {
        quarto.setEstadoAtual(new EstadoLimpando());
    }

    @Override
    public String getEstado() {
        return "Aguardando Limpeza";
    }
}